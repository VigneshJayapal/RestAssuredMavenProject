import io.qameta.allure.*;
import io.qameta.allure.testng.AllureTestNg;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({AllureTestNg.class})
public class ExecuteTestCase {

    UserService userService = new UserService();

    @Test(description = "Validate GET API")
    @Severity(SeverityLevel.CRITICAL)
    public void getMethodTest() {

        Response response = userService.getRequest();

        int statusCode = response.getStatusCode();
        System.out.println("Status Code: " + statusCode);

        Assert.assertEquals(statusCode, 200);

        System.out.println(response.getBody().prettyPrint());
    }
}