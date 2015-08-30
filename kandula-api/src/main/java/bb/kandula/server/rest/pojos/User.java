package bb.kandula.server.rest.pojos;

import java.util.Map;

public class User {

    private String title;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String nicOrPassportNo;
    private String country;
    private String billingAddress;
    private String postalAddress;
    private String postalCode;
    private String mobileNo;
    private String email;

    public User(String title,
                String firstName,
                String lastName,
                String dateOfBirth,
                String nicOrPassportNo,
                String country,
                String billingAddress,
                String postalAddress,
                String postalCode,
                String mobileNo,
                String email) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nicOrPassportNo = nicOrPassportNo;
        this.country = country;
        this.billingAddress = billingAddress;
        this.postalAddress = postalAddress;
        this.postalCode = postalCode;
        this.mobileNo = mobileNo;
        this.email = email;
    }

    public User(Map<String, Object> request) {
        this.title = (String) request.get("title");
        this.firstName = (String) request.get("firstName");
        this.lastName = (String) request.get("lastName");
        this.dateOfBirth = (String) request.get("dateOfBirth");
        this.nicOrPassportNo = (String) request.get("nicOrPassportNo");
        this.country = (String) request.get("country");
        this.billingAddress = (String) request.get("billingAddress");
        this.postalAddress = (String) request.get("postalAddress");
        this.postalCode = (String) request.get("postalCode");
        this.mobileNo = (String) request.get("mobileNo");
        this.email = (String) request.get("email");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNicOrPassportNo() {
        return nicOrPassportNo;
    }

    public void setNicOrPassportNo(String nicOrPassportNo) {
        this.nicOrPassportNo = nicOrPassportNo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
