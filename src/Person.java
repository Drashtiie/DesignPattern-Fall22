abstract class Person {


    private ProductMenu theProductMenu;
    abstract void showMenu(int b) ;
    abstract ProductMenu CreateProductMenu(int a);

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

}
