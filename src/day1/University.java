package day1;

import java.util.Scanner;

public class University {
    private String name;
    private int countOfStudents;
    private int maxAgeOfStudents;
    private int minAgeOfStudents;
    private final String[] faculties = new String[] {"Medicines","Applied Mathematics","Computer Since","Mathematics","Mechanics"};


    public boolean checkAge(int age) {
        return this.minAgeOfStudents <= age && this.maxAgeOfStudents >= age;
    }

    public void suggestFaculties () {
        for (int i = 0; i < this.faculties.length; i++) {
            System.out.println(faculties[i] + "--" + i + 1);
        }
    }

    @Override
    public String toString() {
        return "day1.University{" +
                "name='" + name + '\'' +
                ", countOfStudents=" + countOfStudents +
                ", maxAgeOfStudents=" + maxAgeOfStudents +
                ", minAgeOfStudents=" + minAgeOfStudents +
                '}';
    }

    public void addStudent (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Choose the Faculty");
        suggestFaculties();
        scanner.nextInt();
        System.out.println("Please  your age for : ");
        int age = scanner.nextInt();
        if(checkAge(age)) {
            register();
        }
        else {
            System.out.println("we will call you");
        }

        System.out.println(this.toString());
    }

    private void register() {
        countOfStudents++;
    }

}
