import java.util.ArrayList;

public class MeatProductMenu extends ProductMenu{
    ArrayList<String> a = new ArrayList<>();
    MeatProductMenu() {
        a.add("Pork");
        a.add("Beef");
        a.add("Mutton");
        System.out.println("Meat Produce Menu");
    }
    public void showMenu(int b){
        System.out.println("Meat Produce Menu");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i) + " ");
        }
    };
    public void selectProduct(int USerType) {
        System.out.println("Bridge Pattern ");
        Person person;
        if (USerType == 0) {
            person = new  Buyer(0,"Buyer2");

        } else
        {
            person = new  Buyer(0,"Seller2");
        }
        person.showMenu(1);
    }
}
