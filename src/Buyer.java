public class Buyer extends Person{
//    ProductMenu a = new ProductMenu();
    //sssScanner scan = new Scanner(System.in);
    int UserType;
    String userName;

    Buyer(){
        System.out.println("buyer constructor");
    }
    Buyer(int ut,String un){
        this.UserType=ut;
        this.userName=un;
        System.out.println(un + " is buyer");
    }

    public int getUserType() {
        return UserType;
    }

    public String getUsername() {
        return userName;
    }

    public void showMenu(int b)  {
//        System.out.println("Select from available Product Menus \n 1. Meat Produce Menu \n 2. Produce Product Menu");
////        System.out.println("Enter 1 for meat products and 2 for produced products");
////        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
////        int b = Integer.parseInt(reader.readLine());
////        int b= Integer.parseInt(inp.readLine());
//        Scanner scan = new Scanner(System.in);
//       int b = scan.nextInt();

        //int b=scan.nextInt(0);
//
        //scan.close();
        if(b == 1){
            System.out.println("Meat Produce Menu");
            CreateProductMenu(1);
//            a.showMenu();
        }
        if(b == 2){
            System.out.println("Produce Produce Menu");
            CreateProductMenu(2);
//            a.showMenu();
        }

//        System.out.println("Menu items");

    }
     public ProductMenu CreateProductMenu(int b){
//         System.out.println("Select from available Product Menus \n 1. Meat Produce Menu \n 2. Produce Product Menu");
//         Scanner sc=new Scanner(System.in);
//         b= sc.nextInt();
         System.out.println("Create Product" );
         System.out.println(b);

         if(b == 1){
//             System.out.println("Meat Produce Menu");
             MeatProductMenu a = new MeatProductMenu() ;
             a.showMenu(b);
             return a;
         }
         if(b == 2){
             System.out.println("Produce Produce Menu");
             ProduceProductMenu a = new ProduceProductMenu() ;
             a.showMenu(b);
             return a;
         }

         return null;
//         String s = "Meat Produce";
//         if (s.equalsIgnoreCase("Meat Produce")) {
//             return new MeatProductMenu();
//         } else {
//             return new ProduceProductMenu();
//         }
     }
}
