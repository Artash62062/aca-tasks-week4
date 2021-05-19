package day2;

public class Person {
    private String firstName;
    private String lastName;
    private String passportID;
    private int age;
    private String sex;

    public Person() {
    }

    public Person(String firstName, String lastName, String passportID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportID = passportID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 18 && age < 99) {
            System.out.println("Invalid First name");
            return;
        }
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if(!(sex.equals("male")|| sex.equals("female"))) {
            System.out.println("Invalid sex");
        }
        this.sex = sex;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() > 3 && firstName.length() < 15) {
            System.out.println("Invalid First name");
            return;
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() > 3 && lastName.length() < 15) {
            System.out.println("Invalid Last Name name");
            return;
        }
        this.lastName = lastName;
    }

    public String getPassportID() {
        return passportID;
    }

    public void setPassportID(String passportID) {
        if(passportID.length()!=8 || (passportID.charAt(0)!='A'&& passportID.charAt(1)!='N')) {
            System.out.println("Invalid PassportID");
        }
        this.passportID = passportID;
    }


    public String display() {
        return "firstName is'" + firstName + '\'' +
                ", lastName is'" + lastName + '\'' +
                ", passportID is'" + passportID + '\'' +
                '}';
    }
}
