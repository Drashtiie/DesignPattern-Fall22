public class MeatProductMenu extends ProductMenu{
    public void showMenu(){
        System.out.println("Meat Produce Menu");
    };


    public void selectProduct(int USerType) {
        System.out.println("Bridge Pattern ");
        Person person;
        if (USerType == 0) {
            person = PersonFactory.createObject("Buyer");

        } else
        {
            person = PersonFactory.createObject("Seller");

        }
        person.showMenu();
    }
}
