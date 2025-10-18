package Question_10;
import java.util.Date;

class Employee extends Person
{
    // Fields
    protected String office;
    protected double salary;
    protected final Date dateHired;

    // Constructors
    public Employee(String name, String address, String phoneNumber, String emailAddress,
            String office, double salary)
    {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        dateHired = new Date();
    }

    @Override
    public String toString()
    {
        return "----------------\n" +
                "Class: Employee\n" +
                "Name : " + name + "\n" +
                "----------------\n";
    }
}
