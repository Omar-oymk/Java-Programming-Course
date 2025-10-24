package Question_06;

public class Main
{
    public static void main(String[] args)
    {
        // create a grocery list
        GroceryList groceryList = new GroceryList();

        // initialize items
        GroceryItemOrder eggs = new GroceryItemOrder("Eggs", 1.5);
        eggs.setQuantity(36);
        GroceryItemOrder milk = new GroceryItemOrder("Milk", 5);
        milk.setQuantity(3);
        GroceryItemOrder lemonJuice = new GroceryItemOrder("LemonJuice", 3);
        lemonJuice.setQuantity(2);
        GroceryItemOrder flour = new GroceryItemOrder("Flour", 4);
        flour.setQuantity(2);
        GroceryItemOrder chicken = new GroceryItemOrder("Chicken", 20);
        chicken.setQuantity(2);

        // add items to the list
        groceryList.add(milk);
        groceryList.add(lemonJuice);
        groceryList.add(flour);
        groceryList.add(chicken);
        groceryList.add(eggs);

        // get total cost
        System.out.println("The total cost will be: " + groceryList.getTotalCost());
    }
}
