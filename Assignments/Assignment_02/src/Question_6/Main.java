package Question_6;

//6. What is the output of running the class C in (a)? What problem arises in compiling
//the program in (b)?

public class Main
{
    public static void main(String[] args)
    {
        // SCENARIO 1
        B b = new B();  // this will work normally because it will be able to call the parents constructor normally

        // SCENARIO 2
        D d = new D(5);
    }
}

class A
{
    public A()
    {
        System.out.println("A's no args constructor is invoked");
    }
}

class B extends A { }

class C
{
    public C(int x) {}
}

class D extends C
{
    public D(int x) { super (x); }       // U HAVE TO INVOKE THE PARENTS CONSTRUCTOR
}

// ANSWER:
/*
in a) : the output will be "A's no-arg constructor is invoked"
in b) : it will give compilation error cause since B inherits from A it has to at least match the same
constructor parameters
 */