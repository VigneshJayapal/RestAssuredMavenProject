import io.restassured.response.Response;

public class UserService {

    public Response getRequest(){
        return RequestResponseRestAssured.getRequest(Endpoints.GET_USER);
    }

    public Response getRequest(int id){
        return RequestResponseRestAssured.getRequest(Endpoints.GET_USER+"/"+id);
    }

    public Response createRequest(Object payload){
        return RequestResponseRestAssured.postRequest(Endpoints.CREATE_USER, payload);
    }
}
