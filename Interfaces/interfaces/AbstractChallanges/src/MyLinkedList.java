public class MyLinkedList {
    private LinkedItem root = null;


    public MyLinkedList(LinkedItem root) {
        this.root = root;
    }

    public LinkedItem getRoot() {
        return this.root;
    }

    public boolean addItem(LinkedItem newItem) {
        if (this.root == null) {
            //The list was empty, so this item becomes the head of the list
            this.root = newItem;
            return true;
        }
        LinkedItem currentItem = this.root;
        while(currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0 ) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            }else if (comparison > 0) {
                if(currentItem.previous() != null) {
                    //newitem is less, inset before
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    currentItem.setPrevious(newItem);
                } else {
                    // the node with a previous is the root
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    this.root = newItem;
                }
            } else {
                System.out.println(newItem.getValue() + " is already present, not added");
                return false;
            }
        }
        return false;
    }



}
