package bb.kandula.server.rest;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.Map;

@Path("/test")
public class KandulaRestService {

    public KandulaRestService() {

    }

    @POST
    @Path("/service")
    @Produces("application/json")
    public Map<String, Object> test(Map<String, Object> request) {
        TestRequest req = new TestRequest(request);
        GenericResponse resp = new GenericResponse();
        return resp.getResponse(KeyBox.SUCCESS, req.process());
    }

}
