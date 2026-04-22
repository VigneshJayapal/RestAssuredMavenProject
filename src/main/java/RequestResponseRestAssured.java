import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RequestResponseRestAssured {

    public static Response getRequest(String EndPoint){
        return RestAssured
                .given()
                .baseUri(ConfigReader.get("base.uri"))
                .when()
                .get(EndPoint);
    }

    public static Response postRequest(String EndPoint, Object body){
        return RestAssured
                .given()
                .baseUri(ConfigReader.get("base.uri"))
                .header("Content-Type","application/json")
                .body(body)
                .when()
                .post(EndPoint);
    }
}
