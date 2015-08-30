package bb.kandula.server.rest;

import java.util.HashMap;
import java.util.Map;

public class Statuses {
    private final Map<Enum, String> statuses = new HashMap<>();

    public Statuses() {
        statuses.put(KeyBox.SUCCESS, "Operation successful");
    }

    public String get(Enum status) {
        return statuses.get(status);
    }
}
