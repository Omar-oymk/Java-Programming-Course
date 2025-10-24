package Question_06;

import java.util.ArrayList;

class GroceryList
{
    private ArrayList<GroceryItemOrder> itemOrders;

    public GroceryList()
    {
        itemOrders = new ArrayList<GroceryItemOrder>();
    }

    public void add(GroceryItemOrder item)
    {
        if(itemOrders.size() >= 10) { System.out.println("Grocery is full"); }
        else { itemOrders.add(item); }
    }

    public double getTotalCost()
    {
        double totalCost = 0;
        for( GroceryItemOrder item : itemOrders )
        {
            totalCost += item.getCost();
        }

        return totalCost;
    }
}
