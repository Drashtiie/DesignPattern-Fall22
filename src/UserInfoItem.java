
public class UserInfoItem {

    int UserType;
    String name;
     UserInfoItem(int ut,String n){
         this.UserType=ut;
         this.name=n;
     }
    public void createUser(){

        System.out.println("User with name:  " + this.name + " created");
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