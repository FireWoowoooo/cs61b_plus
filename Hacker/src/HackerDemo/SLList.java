package HackerDemo;

public class SLList {
//    private class IntNode{
//        public int item;
//        public IntNode next;
//
//        public IntNode(int i,IntNode n){
//            item=i;
//            next=n;
//        }
//    }

    private IntNode setinel;
    private IntNode last;
    private int size;

    public SLList(){
        setinel=new IntNode(11,null);
        last=setinel;
        size=0;
    }

    public SLList(int x){
        setinel=new IntNode(11,null);
        setinel.next=new IntNode(x,null);
        last=setinel.next;
        size=1;
    }

    public void addFirst(int x){
        setinel.next=new IntNode(x,setinel.next);
        size+=1;
    }

    public int getFirst(){
        return setinel.next.item;
    }

    public int getLast(){
        return last.item;
    }

    public void addLast(int x){
       last.next=new IntNode(x,null);
       last=last.next;

       size+=1;
    }

    public int size(){
        return size;
    }

    private void forprint(){
        IntNode temp=setinel.next;
        while (temp.next!=null){
            System.out.print(temp.item+" ");
            temp=temp.next;
        }
        System.out.print(temp.item+" ");
    }

    public static void main(String[] args) {
        SLList L=new SLList();
        L.addLast(5);
        L.addFirst(10);
        L.addLast(15);
        L.addLast(333);
        System.out.println(L.size);
        System.out.println(L.getLast());
        L.forprint();
//        int x=L.getLast();
//        System.out.println(x);
    }
}
