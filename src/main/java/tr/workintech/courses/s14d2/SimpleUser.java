package tr.workintech.courses.s14d2;

import java.util.Date;

public class SimpleUser  extends BaseUser implements User {

    private static final String A_CONST = "123";
    private final Date birthDay;
    private final String id;
    private String name;
    private String prefix = "Mr";
    private Car car;

    public SimpleUser(String id, String name, Date birthDay) {
        this.birthDay = birthDay;
        this.id = id;
        this.name = name;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public String getPrefixedName() {

        return this.prefix + this.name;
    }

    public void setName(String name) {

        if (name == null)
            throw new NullPointerException("Name cannot be null");
        if (name.length() > 2)
            throw new IllegalArgumentException("Name cannot be 1 character");

        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
        this.car.setUser(this);
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Date getBirthDay() {
        return new Date(this.birthDay.getTime());
    }

    public int getAge() {

        if (this.birthDay == null)
            return 0;

        Date today = new Date();

        return today.getYear() - birthDay.getYear();
    }
}
