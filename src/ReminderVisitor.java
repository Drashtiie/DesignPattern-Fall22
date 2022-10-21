import java.time.Duration;
import java.time.LocalDate;
import java.util.HashMap;

//Implemented Visitor Pattern

public class ReminderVisitor extends NodeVisitor {
    String m_Reminder;
    HashMap<String, LocalDate> h = new HashMap<String, LocalDate>();
    public ReminderVisitor(){
        h.put("Meat:Beef", LocalDate.of(2022, 12, 1));
        h.put("Meat:Pork",LocalDate.of(2023, 1, 6));
        h.put("Meat:Mutton",LocalDate.of(2023, 2, 1));
        h.put("Produce:Tomato",LocalDate.of(2022, 12, 9));
        h.put("Produce:Onion",LocalDate.of(2022, 11, 12));
    }
    public void visitFacade(Facade facade) {
        System.out.println("visiting trading");
        }
    public void visitTrading(Trading trading){
        for(String key: h.keySet()){
            System.out.println("Product = "+ key + " Total days remaining for Trading = " + Duration.between(LocalDate.now().atStartOfDay(), h.get(key).atStartOfDay()).toDays());
        }
    }
    public Reminder visitProduct(ProductList p){
        System.out.println("visiting product");
        return p;
    }
}


