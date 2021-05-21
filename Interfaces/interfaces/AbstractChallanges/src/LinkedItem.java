import org.w3c.dom.Element;
import org.w3c.dom.Node;

import java.util.LinkedList;

public abstract class LinkedItem {
    protected LinkedItem rightLink = null;
    protected LinkedItem leftLink = null;

    protected Object value;

    public LinkedItem(Object value) {
        this.value = value;
    }
    abstract LinkedItem next();
    abstract LinkedItem setNext(LinkedItem item);
    abstract LinkedItem previous();
    abstract LinkedItem setPrevious(LinkedItem item);

    abstract int compareTo(LinkedItem item);

    public Object getValue() {
        return value;
    }
    public void setValue(Object value) {
        this.value = value;
    }
}
