public class Pizza {

    private int price;
    private boolean veg;
    private int extraCheesesPrice = 100;
    private int extraToppingsPrices = 100;
    private int backpack = 200;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;

    public Pizza(Boolean veg){
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        } else {
            this.price = 400;
        }

        basePizzaPrice = this.price;
    }
    public void addextraCheese(){
        isExtraCheeseAdded = true;
        this.price += extraCheesesPrice;
    }

    public void addExtraToppings(){
        isExtraToppingsAdded= true;
        this.price += backpack;
    }

    public void takeway(){
        isOptedForTakeAway = true;
        this.price += backpack;
    }

    public void getBill(){
        String bill = "";
        System.out.println("Pizza: " + basePizzaPrice);
        if(isExtraCheeseAdded){
            bill += "Extra Cheese added: " + extraCheesesPrice + "\n";

        }
        if(isExtraCheeseAdded){
            bill += "Extra Toppings Added: " + extraToppingsPrices + "\n";
        }
        if(isOptedForTakeAway){
            bill += "Opted Take Out: " + backpack + "\n";
        }
        bill += "Bill: " + this.price + "\n";
        System.out.println(bill);
    }

}
