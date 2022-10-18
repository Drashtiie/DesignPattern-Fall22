public class Buyer extends Person{
//    ProductMenu a = new ProductMenu();

    Buyer(){
        System.out.println("in buyer const");
    }
    public void showMenu(){}
     public ProductMenu CreateProductMenu(){
        return new MeatProductMenu() {
        };
     }
}
