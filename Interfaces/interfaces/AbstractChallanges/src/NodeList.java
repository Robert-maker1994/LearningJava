
public interface NodeList {
    LinkedItem getroot();
    boolean additem(LinkedItem item);
    boolean removeItem(LinkedItem item);
    void traverse(LinkedItem root);
}
