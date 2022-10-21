public class Buyer extends Person{
    int UserType;
    String userName;
    Buyer(){
        System.out.println("buyer constructor");
    }
    Buyer(int ut,String un){
        this.UserType=ut;
        this.userName=un;
        System.out.println(un + " is buyer");
    }
    public int getUserType() {
        return UserType;
    }
    public String getUsername() {
        return userName;
    }
    //Implemented Bridge Pattern

    public void showMenu(int b)  {
        if(b == 0){
            CreateProductMenu(1);
        }
        if(b == 1){
            CreateProductMenu(2);
        }
    }

    //Implemented Factory Pattern
    public ProductMenu CreateProductMenu(int b){
         System.out.println("Create Product" );

         if(b == 0){
             System.out.println("Meat Produce Menu");
             MeatProductMenu a = new MeatProductMenu() ;
             a.showMenu(b);
             return a;
         }
         if(b == 1){
             System.out.println("Produce Product Menu");
             ProduceProductMenu a = new ProduceProductMenu() ;
             a.showMenu(b);
             return a;
         }
         return null;
     }
}
