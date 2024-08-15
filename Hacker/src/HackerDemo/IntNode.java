package HackerDemo;

import com.sun.org.apache.xpath.internal.operations.Neg;

public class IntNode {
    public int item;
    public IntNode next;

    public IntNode(int i,IntNode n){
        item=i;
        next=n;
    }

    public static void main(String[] args) {
        IntNode l=new IntNode(15,null);
    }
}

