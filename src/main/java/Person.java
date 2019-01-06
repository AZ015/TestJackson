import com.fasterxml.jackson.annotation.*;

import java.util.Date;
import java.util.List;

@JsonAutoDetect
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property="type")
public class Person {

    @JsonProperty(value = "First Name")
    private String firstName;

    @JsonProperty(value = "Last Name")
    private String LastName;
    private int age;
    private int height;
    @JsonIgnore
    private double weight;
    private Gender gender;
    private List<String> countries;
    @JsonProperty(value = "Event Time")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    public Date eventDate;

    public Person(String firstName, String lastName, int age, int height, double weight, Gender gender, Date eventDate) {
        this.firstName = firstName;
        LastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.eventDate = eventDate;
    }

    @JsonGetter
    public String getFirstName() {
        return firstName;
    }

    @JsonSetter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonGetter
    public String getLastName() {
        return LastName;
    }

    @JsonSetter
    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @JsonGetter
    public int getAge() {
        return age;
    }

    @JsonSetter
    public void setAge(int age) {
        this.age = age;
    }

    @JsonGetter
    public int getHeight() {
        return height;
    }

    @JsonSetter
    public void setHeight(int height) {
        this.height = height;
    }

    @JsonGetter
    public double getWeight() {
        return weight;
    }

    @JsonSetter
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @JsonGetter
    public Gender getGender() {
        return gender;
    }

    @JsonSetter
    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
