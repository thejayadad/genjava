public class Main {


    public static void main(String[] args) {
        //PIZZA ORDERING PROGRAM

        MeatLovers ml = new MeatLovers(false);
        ml.addExtraToppings();
        ml.addextraCheese();
        ml.getBill();

        Pep pep = new Pep(false);
        pep.addExtraToppings();
        pep.addextraCheese();
        ml.getBill();
    }
}
