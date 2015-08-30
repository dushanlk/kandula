package bb.kandula.server.rest;

import bb.kandula.server.rest.pojos.User;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.Map;

@Path("/user")
public class RestService {

    public RestService() {
    }

    @POST
    @Path("/register")
    @Produces("application/json")
    @Consumes("application/json")
    public Map<String, Object> register(Map<String, Object> request) {
        User user = new User(request);
        GenericResponse response = new GenericResponse();
        return response.getResponse(KeyBox.SUCCESS, user.getEmail());
    }
}
