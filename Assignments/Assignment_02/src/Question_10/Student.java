package Question_10;

import java.util.ArrayList;

class Student extends Person
{
    // Fields
    protected final String classStatus;

    // Constructors
    public Student(String name, String address, String phoneNumber, String emailAddress,
                   String classStatus)
    {
        super(name, address, phoneNumber, emailAddress);
        this.classStatus = classStatus.toLowerCase();
    }

    @Override
    public String toString()
    {
        return "----------------\n" +
                "Class: Student\n" +
                "Name : " + name + "\n" +
                "----------------\n";
    }
}
