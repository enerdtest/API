import com.jayway.restassured.RestAssured;
import com.jayway.restassured.config.LogConfig;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import net.minidev.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.testng.Assert;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

import static com.jayway.restassured.RestAssured.*;
import static java.lang.System.*;

public class WeatherGetRequest {
    Md5Hash md5Hash = new Md5Hash();

    @Before
    public void setup() {
        RestAssured.config = config().logConfig(LogConfig.logConfig().enablePrettyPrinting(false));
    }

    @After
    public void teardown() {
        RestAssured.reset();
    }

   // @Test(priority = 0)
    public void test_01(){
        Response response = given().
                param("q", "london").
                param("appid", "74a2d581c507e15004cfeaa962a20947").
                when().get("http://api.openweathermap.org/data/2.5/weather");
        out.println(response.asString());
        out.println(response.getStatusCode());
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    //@Test(priority = 1)
    public void test_02(){
        Response response = given().
                param("id", "1566083").
                param("appid", "74a2d581c507e15004cfeaa962a20947").
                when().get("http://api.openweathermap.org/data/2.5/weather");
        out.println(response.getStatusCode());
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    //@Test(priority = 2)
    public void test_03(){
        Response response = given().
                param("q","london").
                param("appid", "74a2d581c507e15004cfeaa962a20947").
                when().get("http://api.openweathermap.org/data/2.5/weather");
        JsonPath jsonPath = response.jsonPath();

        out.println(response.getStatusCode());
        Assert.assertEquals(response.getStatusCode(), 200);
        out.println(response.getBody().asString());
        Assert.assertEquals(response.getBody().asString().contains("coord"), true);

        String city = jsonPath.get("name");
        out.println("City Name: " + city);
        Assert.assertEquals(city.toLowerCase(), "london", "Correct city name");
    }

   // @Test(priority = 4)
    public void test_04(){
        baseURI = ("http://api.openweathermap.org/data/2.5/weather");
        RequestSpecification httpRequest = RestAssured.given().
                param("q", "Hanoi").
                param("appid", "74a2d581c507e15004cfeaa962a20947");
        Response response = httpRequest.get();

        if (response.getStatusCode() == 200){
            out.println("Test PASS!");
        }else {
            out.println("Test FAILED!");
        }
    }

    //@Test(priority = 0)
    public void accessToken(){
        baseURI = ("http://openapi-test.savour.fun");
        String app_uuid = "ICEOPERATIONTEST-HYZO-NHO2-DNKU-W9ZZLR7RUIFU";
        String token = "sLGZzb3r4FJHU327YKQ1";
        String corp_uuid = "gsc53f9713sf4e3791725a9tf786c8c9";
        long timestamp = Instant.now().getEpochSecond();
        String signature = md5Hash.getMd5(app_uuid + timestamp + token);

        RequestSpecification accessRequest = RestAssured.given().log().all();

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("app_uuid", app_uuid);
        jsonObject.put("token", token);
        jsonObject.put("corp_uuid", corp_uuid);
        jsonObject.put("timestamp", timestamp);
        jsonObject.put("signature", signature);
        accessRequest.body(jsonObject.toJSONString());
        accessRequest.contentType(ContentType.JSON);
        accessRequest.header("Content-Length", jsonObject.toJSONString().length());
        accessRequest.header("Host", baseURI);
        accessRequest.header("Accept", "application/json");
        accessRequest.header("Content-Type", "application/x-www-form-urlencoded");

        Response response = accessRequest.post("/v1/authms/auth/app");

        out.println(response.getStatusCode());
        out.println(response.asString());

    }

   // @Test
    public void test_05(){
        String weatherReport = given().
                parameter("q", "hanoi").
                parameter("appid", "74a2d581c507e15004cfeaa962a20947").
                when().get("http://api.openweathermap.org/data/2.5/weather").then().
                contentType(ContentType.JSON).extract().path("sys.country");
        out.println(weatherReport);
    }

   // @Test(priority = 0)
    public void several_city(){
        Response response = given().
                param("id","524901,703448,2643743").
                param("appid","74a2d581c507e15004cfeaa962a20947").
                when().
                get("http://api.openweathermap.org/data/2.5/group");
        String secondsCity = response.then().contentType(ContentType.JSON).extract().path("list[-1].main").toString();
        out.println(secondsCity);

    }

   // @Test(priority = 0)
    public void valueOf(){
        Response response = given().
                param("id","524901,703448,2643743").
                param("appid","74a2d581c507e15004cfeaa962a20947").
                when().
                get("http://api.openweathermap.org/data/2.5/group");
        String longitude = response.then().contentType(ContentType.JSON).extract().path("list[-1].coord.lon").toString();
        out.println(longitude);

        String latitude = response.then().contentType(ContentType.JSON).extract().path("list[-1].coord.lat").toString();
        out.println(latitude);

       String longlat = given().
               param("lat",latitude).
               param("lon", longitude).
               param("appid","74a2d581c507e15004cfeaa962a20947").
               when().
               get("http://api.openweathermap.org/data/2.5/weather").
               then().contentType(ContentType.JSON).extract().path("name");
        out.println(longlat);
        getCurrentTimeStamp();

    }


    //@Test
    public void postRest(){
        baseURI =("https://oauth2-czytest.savour.fun");
        RequestSpecification request = RestAssured.given();
        String username = "0937960123";
        String password = "Aa123456!";
        String grant_type = "password";
        String clientSecret = "oy4x7fSh5RI4BNc78UoV4fN08eO5C4pj0daM0B8M";

        request.header("Content-Type", "application/x-www-form-urlencoded");

        JSONObject requestParams = new JSONObject();
        requestParams.put("username", username);
        requestParams.put("password", password);
        requestParams.put("grant_type", grant_type);
        requestParams.put("client_secret", clientSecret);
        requestParams.put("type", 1);
        requestParams.put("client_id", 2);
        request.body(requestParams.toJSONString());
        Response response = request.post("/oauth/token");
        request.log().all();

        int statusCode = response.getStatusCode();
        System.out.println("The status code received: " + statusCode);

        System.out.println("Response body: " + response.body().asString());

    }


    public String getCurrentTimeStamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
    }


}
