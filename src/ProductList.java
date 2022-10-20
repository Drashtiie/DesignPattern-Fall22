import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings("rawtypes")
public class ProductList extends Reminder {

    ArrayList<String> a = new ArrayList<>();
    ProductList() {
        a.add("Meat Pork");
        a.add("Meat Beef");
        a.add("Meat Mutton");
        a.add("Produce Tomato");
        a.add("Produce Onion");
    }

    public Iterator createIterator() {
        return this.a.iterator();
    }

    public Reminder accept(NodeVisitor nodeVisitor) {
        System.out.println("Course List Reminder ...");
        return nodeVisitor.visitProduct(this);
    }

}