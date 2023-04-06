public class Pep extends Pizza {


    public Pep(boolean veg){
        super(false);
        super.addExtraToppings();
        super.addextraCheese();
    }

    @Override
    public void addextraCheese(){}

    @Override
    public void addExtraToppings(){}
}
