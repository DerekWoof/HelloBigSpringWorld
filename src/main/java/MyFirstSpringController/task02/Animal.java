package MyFirstSpringController.task02;

public class Animal {

    private String name;
    private String age;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Animal(String name, String age) {

        this.name = name;
        this.age = age;
    }
}
