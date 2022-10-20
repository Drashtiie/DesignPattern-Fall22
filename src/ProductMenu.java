public abstract class  ProductMenu {

    public abstract   void showMenu();
    public abstract void showAddButton();
    public abstract  void showViewButton();
    public abstract  void showRadioButton();
    public abstract  void showLabels();
    public abstract void showComboxes();

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
