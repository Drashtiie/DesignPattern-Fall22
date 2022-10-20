public class Buyer extends Person{
//    ProductMenu a = new ProductMenu();

    Buyer(){
        System.out.println("buyer constructor");
    }
    public void showMenu(){
        System.out.println("Menu items");

    }
     public ProductMenu CreateProductMenu(){
         String s = "Meat Produce";
         if (s.equalsIgnoreCase("Meat Produce")) {
             return new MeatProductMenu();
         } else {
             return new ProduceProductMenu();
         }
     }
}
