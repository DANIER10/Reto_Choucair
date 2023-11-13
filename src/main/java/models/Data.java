package models;

public class Data {
    public String name;
    public String lastName;
    public String day;
    public String email;
    public String month;
    public String year;
    public String password;
    public String city;
    public String zip;
    public String country;
    public String computer;
    public String version;
    public String language;
    public String mobile;
    public String model;
    public String os;
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDay() {
        return day;
    }

    public String getEmail() {
        return email;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

    public String getPassword() {
        return password;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public String getCountry() {
        return country;
    }

    public String getComputer() {
        return computer;
    }

    public String getVersion() {
        return version;
    }

    public String getLanguage() {
        return language;
    }

    public String getMobile() {
        return mobile;
    }

    public String getModel() {
        return model;
    }

    public String getOs() {
        return os;
    }

    public Data(String name, String lastName, String day, String email, String month, String year, String password, String city, String zip, String country, String computer, String version, String language, String mobile, String model, String os) {
        this.name = name;
        this.lastName = lastName;
        this.day = day;
        this.email = email;
        this.month = month;
        this.year = year;
        this.password = password;
        this.city = city;
        this.zip = zip;
        this.country = country;
        this.computer = computer;
        this.version = version;
        this.language = language;
        this.mobile = mobile;
        this.model = model;
        this.os = os;
    }
}
