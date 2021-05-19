package day1.Task5;

public class Sort {
    public static void main(String[] args) {
        students();
    }
    public static void students() {
        Student student = new Student((byte) 16, "Artak", 145);
        Student student1 = new Student((byte) 16, "valodik", 158);
        Student student2 = new Student((byte) 16, "Artaksh", 1184);
        Student[] students = new Student[3];
        students[0] = student;
        students[1] = student1;
        students[2] = student2;

        sort(students,student.age);
        for (Student value : students) {
            System.out.println(value.toString());
        }
        sort(students,student.weight);
        for (Student value : students) {
            System.out.println(value.toString());
        }
        sort(students,student.name);
        for (Student value : students) {
            System.out.println(value.toString());
        }
    }

    private static int partition(Student[] students, int from, int to, String str) {
        int rightIndex = to;
        int leftIndex = from;

        Student pivot = students[(from + to) / 2];
        while (leftIndex <= rightIndex) {
            while (students[leftIndex].name.compareTo(pivot.name) < 0) {
                leftIndex++;
            }
            while (students[leftIndex].name.compareTo(pivot.name) < 0) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(students, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap(Student[] students, int i, int j) {
        Student temp = students[j];
        students[j] = students[i];
        students[i] = temp;
    }

    public static void sort(Student[] students, int from, int to, String str) {
        if (from < to) {
            int divideIndex = partition(students, from, to, str);
            sort(students, from, divideIndex - 1, str);
            sort(students, divideIndex, to, str);
        }
    }

    public static void sort(Student[] students, String str) {
        sort(students, 0, students.length-1, str);
    }


    private static int partition(Student[] students, int from, int to, int weight) {
        int rightIndex = to;
        int leftIndex = from;
        Student pivot = students[(from + to) / 2];
        while (leftIndex <= rightIndex) {
            while (students[leftIndex].weight < pivot.weight) {
                leftIndex++;
            }
            while (students[rightIndex].weight > pivot.weight) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(students, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    public static void sort(Student[] students, int from, int to, int weight) {
        if (from < to) {
            int divideIndex = partition(students, from, to, weight);
            sort(students, from, divideIndex - 1, weight);
            sort(students, divideIndex, to, weight);
        }
    }

    public static void sort(Student[] students, int weight) {
        sort(students, 0, students.length - 1, weight);
    }

    private static int partition(Student[] students, int from, int to, byte age) {
        int rightIndex = to;
        int leftIndex = from;
        Student pivot = students[(from + to) / 2];
        while (leftIndex <= rightIndex) {
            while (students[leftIndex].age < pivot.age) {
                leftIndex++;
            }
            while (students[rightIndex].age > pivot.age) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(students, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    public static void sort(Student[] students, int from, int to, byte age) {
        if (from < to) {
            int divideIndex = partition(students, from, to, age);
            sort(students, from, divideIndex - 1, age);
            sort(students, divideIndex, to, age);
        }
    }

    public static void sort(Student[] students, byte age) {
        Sort.sort(students, 0, students.length - 1, (byte) age);
    }

}
