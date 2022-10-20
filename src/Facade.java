import java.util.Scanner;
import java.util.Iterator;
public class Facade {
    private int UserType;
    private String theSelectedProduct;
    private int nProductCategory;
    private Person thePerson;
    private ClassProductList theProductList;

    public void facade(){

        System.out.println("Facade pattern");
        UserType = login(new Login());
        System.out.println(
                "Select from available ProductMenu Menus \n 1. Meat Produce Menu \n 2. Produce Product Menu ");
        Scanner scan = new Scanner(System.in);
        theSelectedProduct = scan.nextLine();
        // pattern implemented (Bridge implementation and Factory implementation
        if (theSelectedProduct.equalsIgnoreCase("Meat Produce Menu")) {
            selectProduct(new MeatProductMenu(), UserType);
        } else if (theSelectedProduct.equalsIgnoreCase("Produce Product Menu")) {
            selectProduct(new ProduceProductMenu(), UserType);
        } else {
            System.out.println("Wrong Selection");
            System.exit(-1);
        }
        System.out.println("Implementing Visitor Pattern");
        remind();
        System.out.println("Implementing Iterator pattern");
        ProductList p = new ProductList();
//        @SuppressWarnings("rawtypes")
        Iterator iterate = (Iterator) p.createIterator();
        ProductIterator pIterator = new ProductIterator();
        ProductList pList = new ProductList();
        Iterator iterate2 = (Iterator) pList.createIterator();
        ProductIterator si = new ProductIterator();
        while (pIterator.hasNext(iterate)) {
            System.out.println(pIterator.Next(iterate));
//            System.out.println(si.Next(iterate2));
        }
        scan.close();
         };

    public int login(Login object){
        return object.login();

    }
    public void addTrading(ProductMenu p){
//        p.addTrading();
    }
    public void viewOffering(Offering a){
        a.viewOffering();
    }
    public void marketOffering(Offering a){
        a.marketOffering();
    }
    public void submitOffering(Offering a){
        a.submitOffering();
    }
//    public void decideBidding(Bidding b){
//        b.decideBidding();
//    }
//    public void discussBidding(){}
//    public void submitBidding(){}
    public void remind(){}
    public void productOperation(ProductMenu p){
        p.productOperation();
    }
    public void attachProductToUser(ProductMenu p){
        p.attachProductToUser();
    }
    public void createUser(UserInfoItem userinfoitem){
        userinfoitem.createUser();
    }
    public void createProductlist(ProductMenu p){
        p.createProductList();
    }
    public String selectProduct(ProductMenu p, int UserType){
//    to be checked
        return theSelectedProduct;
    }


}
