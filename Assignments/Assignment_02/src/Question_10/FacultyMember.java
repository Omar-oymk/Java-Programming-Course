package Question_10;

class FacultyMember extends Employee
{
    // Fields
    protected int officeHours;
    protected String rank;

    // Constructors
    public FacultyMember( String name, String address, String phoneNumber, String emailAddress,
            String office, double salary,
            int officeHours, String rank)
    {
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString()
    {
        return "----------------\n" +
                "Class: FacultyMember\n" +
                "Name : " + name + "\n" +
                "----------------\n";
    }
}
