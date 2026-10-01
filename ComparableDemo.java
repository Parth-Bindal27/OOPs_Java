import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

class Student implements Comparable<Student> {
    private String name;
    private int rollNumber;
    private int marks;

    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public int compareTo(Student other) {
        return other.marks - this.marks; // Sorts in descending order of marks
    }

    @Override 
    public String toString() {
        return "Student{name='" + name + "', rollNumber=" + rollNumber + ", marks=" + marks + "}";
    }
}

class CustomComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) { 
        if (s1.getMarks() != s2.getMarks()) {
            return s2.getMarks() - s1.getMarks(); // Sorts in descending order of marks
        }
        return s1.getName().compareTo(s2.getName()); // If marks are equal, sort by name
    }
}

//compare returns a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
//compareTo method is used to compare the names of the students in ascending order. It returns a negative integer if the first name is lexicographically less than the second name, zero if they are equal, and a positive integer if the first name is greater than the second name.
//for descending order, we can simply reverse the order of the arguments in the compareTo method. This will return a positive integer if the first name is lexicographically less than the second name, zero if they are equal, and a negative integer if the first name is greater than the second name.
//for descending order of names, we can use the compareTo method in reverse order. This will return a positive integer if the first name is lexicographically less than the second name, zero if they are equal, and a negative integer if the first name is greater than the second name.
//for descending of order of single character names, we can use the compareTo method in reverse order. This will return a positive integer if the first name is lexicographically less than the second name, zero if they are equal, and a negative integer if the first name is greater than the second name.

class IntegerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
        return i1.compareTo(i2); // Sorts in ascending order of integers
    }
}

class IntegerComparator2 implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
        return i2.compareTo(i1); // Sorts in descending order of integers
    }
}

//for single parameter names, we can use the compareTo method in reverse order. This will return a positive integer if the first name is lexicographically less than the second name, zero if they are equal, and a negative integer if the first name is greater than the second name.
class SingleCharacterNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s2.getName().compareTo(s1.getName()); // Sorts in descending order of single character names
    }
}

class SingleIntegerParameterComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
        return i1.compareTo(i2); // Sorts in ascending order of single integer parameters
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) { // used string compareTo method to sort the names in ascending order
        return s1.getName().compareTo(s2.getName()); // Sorts in ascending order of names
    }
}

class NameComparator2 implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) { // used string compareTo method to sort the names in ascending order
        return s2.getName().compareTo(s1.getName()); // Sorts in descending order of names
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(20);
        list.add(15);
        list.add(30);
        list.sort(null); // Sorts the list in ascending order
        System.out.println("Sorted list: " + list);

        Collections.sort(list, Collections.reverseOrder()); // Sorts the list in descending order
        System.out.println("Sorted list: " + list);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Alice", 20, 85));
        studentList.add(new Student("Bob", 18, 90));
        studentList.add(new Student("Charlie", 22, 78));

        // Sort students by marks
        Collections.sort(studentList); // Sorts in descending order of marks
        System.out.println("\nSorted students by marks:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        studentList.sort(new CustomComparator()); // Sorts using custom comparator
        System.out.println("\nSorted students by marks and names:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        studentList.sort(new NameComparator()); // Sorts using name comparator
        System.out.println("\nSorted students by names:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        studentList.sort(new NameComparator2()); // Sorts using name comparator in descending order
        System.out.println("\nSorted students by names in descending order:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
