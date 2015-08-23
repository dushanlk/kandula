package bb.kandula.server.listener;

import bb.kandula.server.json.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/test")
public class KandulaRestService {

    public KandulaRestService() {

    }

    @GET
    @Path("/service")
    @Produces("application/json")
    public String test() {
        User user = new User();
        user.setName("Dushan");
        user.setCountry("LK");
        return user.toString();
    }

}
