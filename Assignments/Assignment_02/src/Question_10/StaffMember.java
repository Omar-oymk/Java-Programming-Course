package Question_10;

class StaffMember extends Employee
{
    // Fields
    protected String title;

    // Constructors
    public StaffMember( String name, String address, String phoneNumber, String emailAddress,
                          String office, double salary,
                          String title)
    {
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.title = title;
    }

    @Override
    public String toString()
    {
        return "----------------\n" +
                "Class: StaffMember\n" +
                "Name : " + name + "\n" +
                "----------------\n";
    }
}
