import java.util.ArrayList;
import java.util.Iterator;

//Implemented Iterative Pattern
public class ProductList extends Reminder {
    ArrayList<String> a = new ArrayList<>();
    ProductList() {
        a.add("Meat Pork");
        a.add("Meat Beef");
        a.add("Meat Mutton");
        a.add("Produce Tomato");
        a.add("Produce Onion");
        System.out.println("Product List created");
    }
    public void display(){
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i) + " ");
        }
    }
    public Iterator createIterator() {
        return this.a.iterator();
    }

    public Reminder accept(NodeVisitor nodeVisitor) {
        System.out.println("Course List Reminder ...");
        return nodeVisitor.visitProduct(this);
    }
}