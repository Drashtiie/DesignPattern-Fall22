public class Facade {
    private int UserType;
    private Product theSelectedProduct;
    private int nProductCategory;
    private Person thePerson;
    private ClassProductList theProductList;

    public void facade(){
         };

    public int login(Login object){
        return object.login();

    }
    public void addTrading(){}
    public void viewTrading(){}
    public void decideBidding(){}
    public void discussBinding(){}
    public void submitBidding(){}
    public void remind(){}
    public void productOperation(){}
    public void attachProductToUser(){}
//    public void createUser(UserinfoItem userinfoitem){}
    public void createProductlist(){}
    public Product SelectProduct(){
        return theSelectedProduct;
    }


}
