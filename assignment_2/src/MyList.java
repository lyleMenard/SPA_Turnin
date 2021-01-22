package src;

public class MyList {
    int[] currentList;

    public MyList(int[] inputArray) {
        this.currentList = inputArray;
    }

    public void append(int n) {
        int[] newList = new int[currentList.length+1];
        for(int i = 0; i < currentList.length; i++) {
                newList[i] = currentList[i];
        }
        newList[currentList.length] = n;
        this.currentList = newList;
    } //big o complexity of o(n)

    public void pop() {
        int[] newList = new int[currentList.length-1];
        for(int i = 0; i < newList.length; i++) {
            newList[i] = currentList[i];
        }
        this.currentList = newList;
    } //big o complexity of o(n)

    public void insert(int n, int index) {
        int[] newList = new int[currentList.length+1];
        for(int i = 0; i < newList.length; i++) {
            if (i < index) {
                newList[i] = currentList[i];
            } else if (i == index) {
                newList[i] = n;
            } else if (i > index) {
                newList[i] = currentList[i - 1];
            }
        }
        this.currentList = newList;
    } //big o complexity of o(n)

    public void remove(int index) {
        int[] newList = new int[currentList.length-1];
        for(int i = 0; i < newList.length; i++) {
            if(i < index) {
                newList[i] = currentList[i];
            } else if(i >= index) {
                newList[i] = currentList[i+1];
            }
        }
        this.currentList = newList;
    } // big o complexity of o(n)

    public void printList() {
       System.out.print("[");
       for(int i = 0; i < currentList.length; i++) {
           System.out.print(currentList[i] + " ,");
       }
       System.out.println("]");
    }
}


