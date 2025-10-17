package Question_5;

public class MyInteger
{
    // ATTRIBUTES
    private final int value;

    // CONSTRUCTOR
    public MyInteger(int value) { this.value = value; }

    // GETTERS
    public int getValue() { return value; }

    // METHODS
    //region NON-STATIC CHECKERS
    public boolean isEven() { return value % 2 == 0; }
    public boolean isOdd() { return value % 2 != 0; }
    public boolean isPrime()
    {
        int count = 0;
        for(int i = 1; i < value; i++)
        {
            if(value%i == 0) count++;
        }
        return count < 2;
    }

    public boolean equals(int x) { return value == x; }
    public boolean equals(MyInteger x) { return value == x.getValue(); }
    //endregion
    //region STATIC-CHECKERS

    // THESE TAKE CONSTANT VARIABLE (primitive datatype)
    public static boolean isEven(int value) { return value %2 == 0; }
    public static boolean isOdd(int value) { return value %2 != 0; }
    public static boolean isPrime(int value)
    {
        int count = 0;
        for(int i = 1; i < value; i++)
        {
            if(value%i == 0) count++;
        }
        return count < 2;
    }

    // THESE TAKE AN OBJECT OF THE CLASS MyInteger (non-primitive datatype)
    public static boolean isEven(MyInteger value) { return value.getValue() % 2 == 0; }
    public static boolean isOdd(MyInteger value) { return value.getValue() % 2 != 0; }
    public static boolean isPrime(MyInteger value)
    {
        int count = 0;
        for(int i = 1; i < value.getValue(); i++)
        {
            if(value.getValue()%i == 0) count++;
        }
        return count < 2;
    }
    //endregion

}
