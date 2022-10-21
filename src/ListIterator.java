import java.util.Iterator;

public abstract class ListIterator {

    abstract boolean hasNext(Iterator iterator);
    abstract String Next(Iterator iterator);
    abstract void MoveToHead(Iterator iterator);
    abstract void Remove(Iterator iterator);
}
