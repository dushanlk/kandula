package bb.kandula.server.rest.pojos;

import com.google.gson.annotations.Expose;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class TestUser {
    @Id
    private String id;

    @Expose
    @Column(name = "firstname")
    private String firstName;

    @Expose
    @Column(name = "lastname")
    private String lastname;

    @Expose
    @Column(name = "email")
    private String email;

    public TestUser() {
    }

    public TestUser(String id, String firstName, String lastname, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


/*
*
* +-----------+-----------------+------+-----+-------------------+-----------------------------+
| Field     | Type            | Null | Key | Default           | Extra                       |
+-----------+-----------------+------+-----+-------------------+-----------------------------+
| id        | int(6) unsigned | NO   | PRI | NULL              | auto_increment              |
| firstname | varchar(30)     | NO   |     | NULL              |                             |
| lastname  | varchar(30)     | NO   |     | NULL              |                             |
| email     | varchar(50)     | YES  |     | NULL              |                             |
| reg_date  | timestamp       | NO   |     | CURRENT_TIMESTAMP | on update CURRENT_TIMESTAMP |
+-----------+-----------------+------+-----+-------------------+-----------------------------+

* */