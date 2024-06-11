package H;

public class Person extends PersonRecord {

    private String name ;
    private int age;
    private String addrees;


    public Person(String name, int age, String addrees) {
        this.name = name;
        setAge(age);
        this.addrees = addrees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;

    }

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Age must be between 0 and 150");
        }
        this.age = age;
    }

    public String getAddrees() {
        return addrees;
    }

    public void setAddrees(String addrees) {
        this.addrees = addrees;
    }

    @Override
    public String getDetails() {

            return "Name: " + getName() + ", Age: " + getAge() + ", Address: " + getAddrees();

    }

    @Override
    public String toString() {
        return getDetails();
    }
}
