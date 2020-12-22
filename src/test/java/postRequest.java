import com.github.dzieciou.testing.curl.CurlLogger;
import com.github.dzieciou.testing.curl.CurlRestAssuredConfigFactory;
import com.github.dzieciou.testing.curl.Options;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.config.LogConfig;
import com.jayway.restassured.config.RestAssuredConfig;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import net.minidev.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.testng.annotations.Test;

import java.time.Instant;

import static com.jayway.restassured.RestAssured.*;
import static java.lang.System.out;

public class postRequest {


    @Before
    public void setup() {
        RestAssured.config = config().logConfig(LogConfig.logConfig().enablePrettyPrinting(false));
        baseURI = ("http://openapi-test.savour.fun");
    }

    @After
    public void teardown() {
        RestAssured.reset();
    }

//    @Test
    public void login_livin(){
        baseURI = ("https://oauth2-czytest.savour.fun");

        RequestSpecification request = RestAssured.given().contentType(ContentType.JSON);
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("username", "0937960123");
        jsonObject.put("password", "Aa123456!");
        jsonObject.put("grant_type", "password");
        jsonObject.put("client_secret", "oy4x7fSh5RI4BNc78UoV4fN08eO5C4pj0daM0B8M");
        jsonObject.put("type", 1);
        jsonObject.put("client_id", 2);

        request.body(jsonObject).log().all();
        Response response = request.post("/oauth/token");
        System.out.println(response.getStatusCode());
        System.out.println(response.asString());
        JsonPath  jsonPath = response.jsonPath();
        out.println("Access Token is: " + jsonPath.get("access_token").toString());
    }

//    @Test
    public void test_01(){
//        baseURI = ("http://merchant-service-test.savour.fun");
        baseURI = ("http://openapi-test.savour.fun");
        RequestSpecification request = RestAssured.given().contentType(ContentType.JSON);


        String phone = "0937960123";
        String password = "Aa123456!";

        String app_uuid = "ICEOPERATIONTEST-HYZO-NHO2-DNKU-W9ZZLR7RUIFU";
        String token = "sLGZzb3r4FJHU327YKQ1";
        String corp_uuid = "gsc53f9713sf4e3791725a9tf786c8c9";

        JSONObject object = new JSONObject();

//        object.put("phone", phone);
//        object.put("password", password);

        object.put("app_uuid", app_uuid);
        object.put("token", token);
        object.put("corp_uuid", corp_uuid);
        object.put("timestamp", "1607914770");
        object.put("signature", "02cb091e1edeb12736a923cebf3d022c");

        request.headers("Accept", "application/json");
        request.headers("Host", "openapi-test.savour.fun");
        request.headers("Accept-Encoding","gzip, deflate, br");
        request.headers("Accept-Encoding","gzip, deflate, br");

        RestAssuredConfig config = RestAssuredConfig.newConfig();

        Response response = request.config(config).body(object.toJSONString()).when().contentType(ContentType.JSON).post("v1/authms/auth/app");


//        Response response = request.contentType(ContentType.JSON).body(object.toJSONString()).post("api/v1/admin/authentication/login");


        out.println(response.body().asString());
//        out.println(response.getStatusCode());
//        Assert.assertEquals(response.getStatusCode(), 201);
    }

    //@Test
    public void iceToken(){

        baseURI = ("http://openapi-test.savour.fun");

        String app_uuid = "ICEOPERATIONTEST-HYZO-NHO2-DNKU-W9ZZLR7RUIFU";
        String token = "sLGZzb3r4FJHU327YKQ1";
        String corp_uuid = "gsc53f9713sf4e3791725a9tf786c8c9";
        long timestamp = Instant.now().getEpochSecond();
        String signature = md5Hash.getMd5(app_uuid + token + timestamp);
        String convert = String.valueOf(timestamp);

        RequestSpecification request = RestAssured.given().contentType(ContentType.JSON);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("app_uuid", app_uuid);
        jsonObject.put("token", token);
        jsonObject.put("corp_uuid", corp_uuid);
        jsonObject.put("timestamp", convert);
        jsonObject.put("signature", signature);

        request.headers("Accept", "application/json");
        request.headers("Content-Type","application/x-www-form-urlencoded");

        request.body(jsonObject.toJSONString()).log().all();
        Response response = request.post("v1/authms/auth/app");

        out.println(response.asString());
        out.println(response.statusCode());


    }

}
