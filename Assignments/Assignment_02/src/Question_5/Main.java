package Question_5;

/*
5. (The MyInteger class) Design a class named MyInteger. The class contains:
 An int data field named value that stores the int value represented by this
object.
 A constructor that creates a MyInteger object for the specified int value. A
getter method that returns the int value.
 The methods isEven(), isOdd(), and isPrime() that return true if the value in
this object is even, odd, or prime, respectively.
 The static methods isEven(int), isOdd(int), and isPrime(int) that return true if
the specified value is even, odd, or prime, respectively.
 The static methods isEven(MyInteger), isOdd(MyInteger), and
isPrime(MyInteger) that return true if the specified value is even, odd, or
prime, respectively.
 The methods equals(int) and equals(MyInteger) that return true if the value
in this object is equal to the specified value.
 Draw the UML diagram for the class and then implement the class. Write
a client program that tests all methods in the class.
 */

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