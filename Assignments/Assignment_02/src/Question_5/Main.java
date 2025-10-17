package Question_5;


public class Main
{
    public static void main(String[] args)
    {
        MyInteger i1 = new MyInteger(21);
        MyInteger i2 = new MyInteger(20);

        // invoking non static methods
        System.out.println("--------------");
        System.out.println(i1.getValue() + "is Even?: " + i1.isEven());
        System.out.println(i1.getValue() + "is Odd?: " + i1.isOdd());
        System.out.println(i1.getValue() + "is Prime?: " + i1.isPrime());
        System.out.println(i1.getValue() + "is equal to " + i2.getValue() + "?: " + i1.equals(i2));
        System.out.println(i1.getValue() + "is equal to " + 21 + "?: " + i1.equals(21));
        System.out.println("--------------");

        // invoking static methods
        System.out.println(MyInteger.isEven(i2));
        System.out.println(MyInteger.isOdd(i2));
        System.out.println(MyInteger.isPrime(i2));

        System.out.println(MyInteger.isEven(11));
        System.out.println(MyInteger.isOdd(11));
        System.out.println(MyInteger.isPrime(30));
    }
}