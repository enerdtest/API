import com.jayway.restassured.RestAssured;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.*;

public class WheatherGetRequest {

    @Test(priority = 0)
    public void test_01(){
        Response response = when().get("http://api.openweathermap.org/data/2.5/weather?q=london&appid=74a2d581c507e15004cfeaa962a20947");
        System.out.println(response);
        System.out.println(response.getStatusCode());
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test(priority = 1)
    public void test_02(){
        Response response = when().get("http://api.openweathermap.org/data/2.5/weather?q=london&appid=74a2d581c507e15004cfeaa962a2097");
        System.out.println(response.getStatusCode());
        Assert.assertEquals(response.getStatusCode(), 401);
    }

    @Test(priority = 2)
    public void test_03(){
        Response response = given().
                param("q","london").
                param("appid", "74a2d581c507e15004cfeaa962a20947").
                when().get("http://api.openweathermap.org/data/2.5/weather");
        JsonPath jsonPath = response.jsonPath();

        System.out.println(response.getStatusCode());
        Assert.assertEquals(response.getStatusCode(), 200);
        System.out.println(response.getBody().asString());
        Assert.assertEquals(response.getBody().asString().contains("coord"), true);

        String city = jsonPath.get("name");
        System.out.println("City Name: " + city);
        Assert.assertEquals(city.toLowerCase(), "london", "Correct city name");
    }

    @Test(priority = 4)
    public void test_04(){
        baseURI = ("http://api.openweathermap.org/data/2.5/weather/city");
        RequestSpecification httpRequest = RestAssured.given().
                param("q", "Hanoi").
                param("appid", "74a2d581c507e15004cfeaa962a20947");
        Response response = httpRequest.get();
        System.out.println(response.getBody().asString());

        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
