import io.qameta.allure.testng.AllureTestNg;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({AllureTestNg.class})
public class ExecuteTestCase {

    public static UserService userService = new UserService();
    @Test
    public static void getMethodTest(){
        Response response = userService.getRequest();
        int statusCode = response.getStatusCode();
        System.out.println("Status Code is:"+statusCode);
        ResponseBody responseBody = response.getBody();
        System.out.println(responseBody.prettyPrint());
    }
}
