package src;

public class MyBST {

    public MyTreeNode headNode;

    public MyBST() {
        this.headNode = null;
    }

    public void add(int k) {
        this.headNode = add_recursive_call(this.headNode, k);
    }

    public MyTreeNode add_recursive_call(MyTreeNode root, int k) {
        //Base Case
        if (root == null) {
            return new MyTreeNode(k);
        }
        else {
            //left side
            if (k < root.data) {
                root.leftNext = add_recursive_call(root.leftNext, k);
            }
            //right side
            else {
                root.rightNext = add_recursive_call(root.rightNext, k);
            }
        }
        return root;
    }

    public static void printBinaryTree(MyTreeNode root, int level){
        if(root==null)
            return;
        printBinaryTree(root.rightNext, level+1);
        if(level!=0){
            for(int i=0;i<level-1;i++)
                System.out.print("|\t");
            System.out.println("|-------"+root.data);
        }
        else
            System.out.println(root.data);
        printBinaryTree(root.leftNext, level+1);
    }
}