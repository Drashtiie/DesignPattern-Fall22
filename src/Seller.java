public class Seller extends Person{

    public void showMenu(){
        System.out.println("Menu items");

    }
    public ProductMenu CreateProductMenu(){
        String s = "Meat Produce";
        if (s.equalsIgnoreCase("Meat Produce")) {
            return new MeatProductMenu();
        } else {
            return new ProduceProductMenu();
        }}
}
