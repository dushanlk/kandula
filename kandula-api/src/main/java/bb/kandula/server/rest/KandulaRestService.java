package bb.kandula.server.rest;

import bb.kandula.server.json.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.HashMap;
import java.util.Map;

@Path("/test")
public class KandulaRestService {

    public KandulaRestService() {

    }

    @GET
    @Path("/service")
    @Produces("application/json")
    public Map<String, String> test() {
        User user = new User();
        user.setName("Dushan");
        user.setCountry("LK");
        Map map = new HashMap<>();
        map.put("name", "Dushan");
        map.put("country", "Sri Lanka");
        return map;
    }

}
