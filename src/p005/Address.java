package p005;

public class Address {
    private String landMark;
    private String houseNumber;
    private String provience;
    private String city;
    private String country;
    private String postalCode;

    public Address(String landMark, String houseNumber, String provience, String city, String country, String postalCode) {
        this.landMark = landMark;
        this.houseNumber = houseNumber;
        this.provience = provience;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
    }

    public String getLandMark() {
        return landMark;
    }

    public void setLandMark(String landMark) {
        this.landMark = landMark;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getProvience() {
        return provience;
    }

    public void setProvience(String provience) {
        this.provience = provience;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "landMark='" + landMark + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", provience='" + provience + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
