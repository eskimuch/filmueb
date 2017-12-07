package filmueb.data;

public class Actor
{
    private String name, surname, country;

    public Actor(String name, String surname, String country) {
        this.name = name;
        this.surname = surname;
        this.country = country;
    }
    public Actor(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
