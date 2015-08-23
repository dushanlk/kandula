package bb.kandula.server.json;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {

    private String name;
    private String country;

    public User() {

    }

    public User(String name, String country) {
        this.name = name;
        this.country = country;
    }

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
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("name='").append(name).append("\',");
        sb.append("country='").append(country).append("\'");
        sb.append("}");
        return sb.toString();
    }
}
