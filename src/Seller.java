public class Seller extends Person{

    public void showMenu(){}
    public ProductMenu CreateProductMenu(){
        return new MeatProductMenu();
    }
}
