public class MeatLovers extends Pizza {


    public MeatLovers(boolean veg){
        super(false);
        super.addExtraToppings();
        super.addextraCheese();
    }

    @Override
    public void addextraCheese(){}

    @Override
    public void addExtraToppings(){}
}
