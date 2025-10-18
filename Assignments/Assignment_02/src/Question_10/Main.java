package Question_10;

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
