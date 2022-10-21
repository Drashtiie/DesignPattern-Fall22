import java.util.Iterator;
import java.util.Scanner;
public class Facade {
    public int UserType;
    public int menuType;
    private String theSelectedProduct;
    private int nProductCategory;
    private Person thePerson;
    private ClassProductList theProductList;

    public void facade(){

        System.out.println("Facade pattern");
        UserType = login(new Login());
//        System.out.println(
//                "Select from available ProductMenu Menus \n 1. Meat Produce Menu \n 2. Produce Product Menu ");
//        Scanner scan = new Scanner(System.in);
//        theSelectedProduct = scan.nextLine();
        // pattern implemented (Bridge implementation and Factory implementation

//        theSelectedProduct = UserType;
        System.out.println("Do you want to add Trading ?(1/0)");
        Scanner scan = new Scanner(System.in);
        int ans = scan.nextInt();
        if(ans == 1){
            System.out.println("Add trading");
            this.addTrading();
        }

        System.out.println("Do you want to view trading?(1/0)");
//        Scanner scan = new Scanner(System.in);
        ans= scan.nextInt();
        if(ans==1){
            viewTrading();
        }

        UserInfoItem a = new UserInfoItem(this.UserType,"Drashti");
        createUser(a);
        ProductList pList= new ProductList();
        selectProduct(pList);
//        System.out.println("Enter 1 for meat products and 2 for produced products");
//        int b=scan.nextInt();
//        if(b==2){
//            ProductMenu pmenu = new ProduceProductMenu();
////            pmenu.show();
//        }

//        if (theSelectedProduct.equalsIgnoreCase("Meat Produce Menu")) {
//            selectProduct(new MeatProductMenu(), UserType);
//        } else if (theSelectedProduct.equalsIgnoreCase("Produce Product Menu")) {
//            selectProduct(new ProduceProductMenu(), UserType);
//        } else {
//            System.out.println("Wrong Selection");
//            System.exit(-1);
//        }
        System.out.println("Implementing Visitor Pattern");
        remind();
        System.out.println("Implementing Iterator pattern");
        ProductList p = new ProductList();
//        @SuppressWarnings("rawtypes")
        Iterator iterate = (Iterator) p.createIterator();
        ProductIterator pIterator = new ProductIterator();
        ProductList pList1 = new ProductList();
        Iterator iterate2 = (Iterator) pList1.createIterator();
        ProductIterator si = new ProductIterator();
        while (pIterator.hasNext(iterate)) {
            System.out.println(pIterator.Next(iterate));
//            System.out.println(si.Next(iterate2));
        }
        System.out.println("Select from available Product Menus \n 1. Meat Produce Menu \n 2. Produce Product Menu");
//         Scanner sc=new Scanner(System.in);
        menuType= scan.nextInt();
        scan.close();
         };

    public int login(Login object){
//        int a = object.login();
//        System.out.println(a);
//        this.activity();
        return object.login();

    }
    public void addTrading(){
        System.out.println("Trading info generated and added");
        if(this.UserType==0){
            BuyerTradingMenu.buyertradingMenu();
        }
        else{
            SellerTradingMenu.sellettradingMenu();
        }
////        p.addTrading();
    }



    public void viewTrading(){
        System.out.println("Viewing trading info");
        if(this.UserType==0){
            BuyerTradingMenu.buyertradingMenu();
        }
        else{
            SellerTradingMenu.sellettradingMenu();
        }
////        p.addTrading();
    }
    public void viewOffering(){
        System.out.println("View Offerings");
    }
    public void markOffering(Offering a){
        a.setDeal();
    }
    public void submitOffering(Offering a){
        a.submitOffering();
    }
//    public void decideBidding(Bidding b){
//        b.decideBidding();
//    }
//    public void discussBidding(){}
//    public void submitBidding(){}
    public void remind(){
        System.out.println("This is remind message for of the upcoming overdue\n" +
                "trading window.");
    }
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
    public String selectProduct(ProductList p){
//    to be checked

        p.display();
        System.out.println("Enter id of product to select");
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();

        System.out.println(p.a.get(t));
//          String i=s.nextInt(p.getl(i));
        Product p1 =new Product(p.a.get(t));
        return theSelectedProduct;
    }


}
