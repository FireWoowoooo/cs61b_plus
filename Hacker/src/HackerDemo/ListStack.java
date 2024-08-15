package HackerDemo;

public class ListStack {

    int value;
    int size;
    ListStack next;

    public ListStack (int add) {
        this.size = 1;
        this.value = add;
        this.next = null;
    }

    public void push (int add) {
        this.next = this;
        this.value = add;
        this.size++;
    }

    public int pop() {
        if (this.size == 0) {
            System.out.println("emptystack");
        }
        int i = this.value;
//        this = this.next;
        this.size--;
        return i;
    }

    public int size() {
        return this.size;
    }

    public int peek() {
        return this.value;
    }
}