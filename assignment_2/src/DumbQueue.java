package src;

public class DumbQueue {
    MyStack s = null;

    public void queue(Integer k) {
        this.s.push(k);
    } //big o of o(1)

    public int dequeue() {
        MyStack t = null;
        for(int i = 0; i < this.s.myStack.size(); i++) {
            t.push(this.s.pop());
        }
        int x = t.pop();
        for(int i = 0; i < this.s.myStack.size(); i++) {
            this.s.push(t.pop());
        }
        return x;
    } //big o of o(2n)
}
