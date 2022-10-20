public abstract class  ProductMenu {

    public abstract   void showMenu();

    public void showAddButton(){
            System.out.println("Add Button shown");

    }

    public void showViewButton(){
        System.out.println("View Button added");

    };
    public void showRadioButton(){
        System.out.println("Radio Button shown");

    };
    public void showLabels(){
        System.out.println("Labels shown");

    };
    public void showComboxes(){
        System.out.println("Comboxes shown");

    };

    public abstract void selectProduct(int UserType);


    public void createProductList() {
        System.out.println("Product List created ");
    }

    public void attachProductToUser() {
        System.out.println("attached Product to user");
    }

    public void productOperation() {
        System.out.println("Operation performed on the course");
    }



}
