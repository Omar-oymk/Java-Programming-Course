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
    //endregion
    //region STATIC-CHECKERS
    //endregion
}
