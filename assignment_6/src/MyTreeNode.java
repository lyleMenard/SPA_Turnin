package src;

public class MyTreeNode {
    public int data;
    public MyTreeNode leftNext;
    public MyTreeNode rightNext;

    MyTreeNode(int d){
        this.data = d;
        this.leftNext = null;
        this.rightNext = null;
    }

}