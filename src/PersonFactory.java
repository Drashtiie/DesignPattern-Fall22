//public class PersonFactory extends Person {
//
////    PersonFactory(ProductMenu p) {
////        super(p);
////    }
//
//    @Override
//    public void showMenu() {}
//
//    @Override
//    public ProductMenu CreateProductMenu(int a) {
//        // TODO Auto-generated method stub
//        return new ProductMenu();
//    }
//
//    public static Person createObject(String str) {
//        Person person;
//        System.out.println("Factory Pattern Intiated for user creation....");
//        if (str.equalsIgnoreCase("Student")) {
//            person = new Buyer();
//        } else
//
//        {
//            person = new Seller();
//        }
//        return person;
//    }
//}