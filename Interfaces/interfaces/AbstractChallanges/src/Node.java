import java.util.LinkedList;

public class Node implements MyLinkedList {



    public Node(Object value) {
        super(value);
    }

    @Override
    LinkedItem next() {
        return this.rightLink;
    }

    @Override
    LinkedItem setNext(LinkedItem item) {
     this.rightLink = item;
     return this.rightLink;
    }

    @Override
    LinkedItem previous() {
        return this.leftLink;

    }

    @Override
    LinkedItem setPrevious(LinkedItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    int compareTo(LinkedItem item) {
        if(item != null ) {
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}


