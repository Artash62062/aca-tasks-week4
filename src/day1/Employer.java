package day1;

public class Employer {
    private String name;
    private int age;
    private String workSpace;
    private int salary;
    public Employer() {}

    public Employer(String name, int age, String workSpace, int salary) {
        this.name = name;
        this.age = age;
        this.workSpace = workSpace;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "day1.Employer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", workSpace='" + workSpace + '\'' +
                ", salary=" + salary +
                '}';
    }
}
