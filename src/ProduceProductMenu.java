import java.util.ArrayList;

public class ProduceProductMenu extends ProductMenu {
    ArrayList<String> a = new ArrayList<>();
    ProduceProductMenu() {
        a.add("Tomato");
        a.add("Onion");
    }
    public void showMenu(int b){
        System.out.println("Produce Produce Menu");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i) + " ");
        }
    };
    public void showAddButton() {
        System.out.println();
    }
    public void showViewButton() {
        System.out.println();
    }
    public void showRadioButton() {
        System.out.println();
    }
    public void showLabels() {
        System.out.println();
    }
    public void showComboxes() {
        System.out.println();
    }
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
