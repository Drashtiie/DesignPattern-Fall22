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

        System.out.println("********************************* Facade pattern *********************************");
        UserType = login(new Login());
        System.out.println("Do you want to add Trading ?(1/0)");
        Scanner scan = new Scanner(System.in);
        int ans = scan.nextInt();
        if(ans == 1){
            System.out.println("Add trading");
            this.addTrading();
        }
        System.out.println("Do you want to view trading?(1/0)");
        ans= scan.nextInt();
        if(ans==1){
            viewTrading();
        }
        UserInfoItem a = new UserInfoItem(this.UserType,"Drashti");
        createUser(a);
        ProductList pList= new ProductList();
        selectProduct(pList);
        System.out.println("Select from available Product Menus \n 0. Meat Produce Menu \n 1. Produce Product Menu");
        menuType= scan.nextInt();

        System.out.println("********************************* Bridge pattern *********************************");
        //Implemented Bridge Pattern

        Person h = new Buyer(0, "buyer1");
        Product object = new Product();
        h.showMenu(menuType);
        System.out.println("********************************* Factory pattern *********************************");

        //Implemented Factory Pattern
        System.out.println("Creating Product Menu");
        h.CreateProductMenu(menuType);
        System.out.println("********************************* Visitor Pattern *********************************");
        //Implemented Visitor Pattern
        remind();
        ReminderVisitor rv = new ReminderVisitor();
        Trading t = new Trading();
        rv.visitTrading(t);
        System.out.println("********************************* Iterator pattern *********************************");
        //Iteratively printing values of product list
        //Implemented Iterative Pattern
        ProductList p = new ProductList();
        Iterator iterate = (Iterator) p.createIterator();
        ProductIterator pIterator = new ProductIterator();
        while (pIterator.hasNext(iterate)) {
            System.out.println(pIterator.Next(iterate));
        }
        scan.close();
    };

    public int login(Login object){
        return object.login();
    }
    public void addTrading(){
        System.out.println("Trading info generated and added"+ UserType);
        if(this.UserType==0){
            BuyerTradingMenu.buyertradingMenu();
        }
        else{
            SellerTradingMenu.sellettradingMenu();
        }
    }
    public void viewTrading(){
        System.out.println("Viewing trading info");
        if(this.UserType==0){
            BuyerTradingMenu.buyertradingMenu();
        }
        else{
            SellerTradingMenu.sellettradingMenu();
        }
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
        p.display();
        System.out.println("Enter id of product to select");
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        System.out.println(p.a.get(t));
        Product p1 =new Product(p.a.get(t));
        return theSelectedProduct;
    }
}
