public class MeatProductMenu extends ProductMenu{
    public void showMenu(){
        System.out.println();
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
            person = PersonFactory.createObject("Buyer");

        } else
        {
            person = PersonFactory.createObject("Seller");

        }
        person.showMenu();
    }
}
