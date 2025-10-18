package Question_10;

class Person
{
    // Fields
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String emailAddress;

    // Constructors
    public Person(String name, String address, String phoneNumber, String emailAddress)
    {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString()
    {
        return "----------------\n" +
                "Class: Person\n" +
                "Name : " + name + "\n" +
                "----------------\n";
    }
}