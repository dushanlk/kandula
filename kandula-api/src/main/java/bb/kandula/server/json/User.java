package bb.kandula.server.json;

public class User {

    private String name;
    private String country;

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "User [" +
                "name=" + name + ", " +
                "country=" + country +
                "]";
    }
}
