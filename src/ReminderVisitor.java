public class ReminderVisitor extends NodeVisitor {

    private Reminder m_Reminder;

    public Reminder visitProduct(ProductList product){
        System.out.println("visiting Facade");
        return product;


    }
    public void visitTrading(Trading trading){
        System.out.println("visiting Assignment ....");
    }
    public void visitFacade(Facade facade){
        System.out.println("visiting Course");
    }


//    String m_Reminder;

//    @Override
//    public void visitProduct(HacsFacade HF) {
//        System.out.println("visiting Facade ....");
//    }
//
//    @Override
//    public Reminder visitAssignment(Assignment A) {
//        System.out.println("visiting Assignment ....");
//        return A;
//    }
//
//    @Override
//    public Reminder visitCourse(ProductList CL) {
//        System.out.println("visiting Course");
//        return CL;
//
//    }

}


