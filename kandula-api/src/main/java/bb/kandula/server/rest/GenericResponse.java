package bb.kandula.server.rest;

import java.util.LinkedHashMap;
import java.util.Map;

public class GenericResponse {

    private Statuses statuses = new Statuses();

    public Map<String, Object> getResponse(Enum status, String result) {
        Map<String, Object> response = createResponse(status);
        response.put("result", result);
        return response;
    }

    public Map<String, Object> getResponse(Enum status, Map result) {
        Map<String, Object> response = createResponse(status);
        response.put("result", result);
        return response;
    }

    private Map<String, Object> createResponse(Enum status) {
        Map<String, Object> response = new LinkedHashMap<>();
        response.put("status", status.toString());
        response.put("description", statuses.get(status));
        return response;
    }


}
