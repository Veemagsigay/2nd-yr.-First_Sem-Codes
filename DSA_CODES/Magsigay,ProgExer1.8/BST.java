public class BST {
    protected BSTNode root;
    private int count = 0;
    public BST() {
        root = null;
    }

    public Boolean search(BSTNode p, int el) { // Figure 6.9
        while (p != null)
        if (el == p.key){
            count++;
            return true;
        }
        else if (el < p.key){
            p = p.left;
            count++;
        }
        else {
            p = p.right;
            count++;
        }
        return false;
    }

    public void insert(int el) { // Figure 6.23
    BSTNode p = root, prev = null;
    while (p != null) { // find a place for inserting new node;
        prev = p;
        if (p.key < el)
            p = p.right;
        else p = p.left;
    }
    if (root == null) // tree is empty;
        root = new BSTNode(el);
    else if (prev.key < el)
        prev.right = new BSTNode(el);
    else prev.left = new BSTNode(el);
    }

    public int checkCount(){
        return this.count;
    }

    public void resetCount(){
        count = 0;
    }
}
