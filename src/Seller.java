import java.util.Scanner;

public class Seller extends Person{

    public void showMenu(int b)  {
        System.out.println("Select from available ProductMenu Menus \\n 1. Meat Produce Menu \\n 2. Produce Product Menu");
        Scanner scan = new Scanner(System.in);
        int ans = scan.nextInt();
        if(ans == 1){
            System.out.println("Meat Produce Menu");
            MeatProductMenu a = new MeatProductMenu() ;
            a.showMenu(ans);
        }
        if(ans == 2){
            System.out.println("Produce Produce Menu");
            ProduceProductMenu a = new ProduceProductMenu() ;
            a.showMenu(ans);
        }
//        System.out.println("Menu items");

    }
    public ProductMenu CreateProductMenu(int b){
        String s = "Meat Produce";
        if (s.equalsIgnoreCase("Meat Produce")) {
            return new MeatProductMenu();
        } else {
            return new ProduceProductMenu();
        }}
}
