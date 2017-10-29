package Lesson11.ParcelsSystem;

public class Location {
    private String country;
    private String region;
    private String city;


    public Location() {
        country = "Країна";
        region = "Область";
        city = "Місто";
    }

    public Location(String country, String region, String city) {
        this.country = country;
        this.region = region;
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return  "Location{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
