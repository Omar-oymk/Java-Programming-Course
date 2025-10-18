package Question_10;

/*
10.(The Person, Student, Employee, Faculty, and Staff classes) Design a class named
Person and its two subclasses named Student and Employee. Make Faculty and
Staff subclasses of Employee. A person has a name, address, phone number, and
email address. A student has a class status (freshman, sophomore, junior, or
senior). Define the status as a constant. An employee has an office, salary, and
date hired. A faculty member has office hours and a rank. A staff member has a
title. Override the toString method in each class to display the class name and the
person’s name. Draw the UML diagram for the classes and implement them.
Write a test program that creates a Person, Student, Employee, Faculty, and Staff,
and invokes their toString() methods.
 */

public class Main
{
    public static void main(String[] args)
    {
        //region declaring and initializing objects
        Person p1 = new Person("Ahmed", "Alexandria/Smouha/HamadaStreet/10thFloor",
                "01207715511", "ahmedhamada@gmail.com");

        Student s1 = new Student("Omar", "Alexandria/Smouha/HamadaStreet/10thFloor",
                "01207715511", "omarhamada@gmail.com", "sophomore");

        Employee e1 = new Employee("Ahmed", "Alexandria/Smouha/HamadaStreet/10thFloor",
                "01207715511", "ahmedhamada@gmail.com", "SmouhaOffice", 200000);

        FacultyMember f1 = new FacultyMember("Omar", "Alexandria/Smouha/HamadaStreet/10thFloor",
                "01207715511", "ahmedhamada@gmail.com", "SmouhaOffice", 200000,
                5, "Rank 2");

        StaffMember sm1 = new StaffMember("Ahmed", "Alexandria/Smouha/HamadaStreet/10thFloor",
                "01207715511", "ahmedhamada@gmail.com", "SmouhaOffice", 200000,
                "BrainStormer");
        //endregion
        //region invoking toString methods
        System.out.println(p1);
        System.out.println(s1);
        System.out.println(e1);
        System.out.println(f1);
        System.out.println(sm1);
        //endregion
    }
}
