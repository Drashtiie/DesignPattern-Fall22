public class Main {

    public static void main(java.lang.String[] args) {
        Facade obj = new Facade();
        obj.facade();
        Person h = new Buyer(0, "buyer1");
        System.out.println("Select from available Product Menus \n 1. Meat Produce Menu \n 2. Produce Product Menu");
//        System.out.println("Enter 1 for meat products and 2 for produced products");
//        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
//        int b = Integer.parseInt(reader.readLine());
//        int b= Integer.parseInt(inp.readLine());
//        Scanner scan = new Scanner(System.in);
//        int b = scan.nextInt();
//Bridge Pattern
        h.showMenu(obj.menuType);

//        Factory Pattern
        h.CreateProductMenu(obj.menuType);
//        h.showMenu();
    }
}
