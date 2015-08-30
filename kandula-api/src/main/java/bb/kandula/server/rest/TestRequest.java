package bb.kandula.server.rest;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestRequest {

    private String name;
    private String country;

    public TestRequest(Map<String, Object> req) {
        this.name = req.get("name").toString();
        this.country = req.get("country").toString();
    }

    public Map process () {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("name", name);
        map.put("country", country);
        return map;
    }
}
