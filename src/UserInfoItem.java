
public class UserInfoItem {

    int UserType;
    String name;
     UserInfoItem(int ut,String n){
         this.UserType=ut;
         this.name=n;
     }
    public void createUser(){

        System.out.println("User with name:  " + this.name + " created");
        Buyer b1=new Buyer(0,this.name);
    }
}
//
//"""
//Vtutu:Beef
//tutu:Tomato
//mimi:Beef
//mimi:Onion
//pepe:Beef
//pepe:Tomato
//pepe:Onion
//"""
//
//        """
//Meat:Beef
//Meat:Pork
//Meat:Mutton
//Produce:Tomato
//Produce:Onion
//
//"""