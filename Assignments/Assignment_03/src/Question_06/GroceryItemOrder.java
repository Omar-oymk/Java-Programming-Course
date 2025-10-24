package Question_06;

class GroceryItemOrder
{
    private String itemName;
    private int quantity;
    private double pricePerUnit;

    public GroceryItemOrder(String name, double pricePerUnit)
    {
        quantity = 1;
        itemName = name;
        this.pricePerUnit = pricePerUnit;
    }

    public double getCost()
    {
        return quantity * pricePerUnit;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
}
