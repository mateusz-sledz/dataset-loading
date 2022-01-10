package fr.epita.titanic.datamodel;

public class Passenger {

    private Integer PassengerId;
    private Boolean Survived;
    private Integer pClass;
    private String Name;
    private String Sex;
    private Double Age;
    private Boolean SibSp;
    private Integer Parch;
    private String Ticket;
    private Double Fare;
    private String Cabin;
    private String Embarked;


    public Integer getPassengerId() {
        return PassengerId;
    }

    public void setPassengerId(Integer passengerId) {
        PassengerId = passengerId;
    }

    public Boolean getSurvived() {
        return Survived;
    }

    public void setSurvived(Boolean survived) {
        Survived = survived;
    }

    public Integer getpClass() {
        return pClass;
    }

    public void setpClass(Integer pClass) {
        this.pClass = pClass;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public Double getAge() {
        return Age;
    }

    public void setAge(Double age) {
        Age = age;
    }

    public Boolean getSibSp() {
        return SibSp;
    }

    public void setSibSp(Boolean sibSp) {
        SibSp = sibSp;
    }

    public Integer getParch() {
        return Parch;
    }

    public void setParch(Integer parch) {
        Parch = parch;
    }

    public String getTicket() {
        return Ticket;
    }

    public void setTicket(String ticket) {
        Ticket = ticket;
    }

    public Double getFare() {
        return Fare;
    }

    public void setFare(Double fare) {
        Fare = fare;
    }

    public String getCabin() {
        return Cabin;
    }

    public void setCabin(String cabin) {
        Cabin = cabin;
    }

    public String getEmbarked() {
        return Embarked;
    }

    public void setEmbarked(String embarked) {
        Embarked = embarked;
    }
}
