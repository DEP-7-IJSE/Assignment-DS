package ds;

public class SinglyLinkedList {
    Node top;

    public void add(int data){
        Node n1 = new Node(data);
        n1.next = top;
        top = n1;
    }
    public void add(int index, int data){

    }
    public void remove(int index){

    }
    public int get(int index){
        return 0;
    }
    public void print(){
        System.out.print("[");
        Node temp = top;
        while(temp!=null){
            System.out.print(temp.data+", ");
            temp = temp.next;
        }
        System.out.println("\b\b]");
    }
    public void clear(){
        top = null;
    }
    public int size(){
        int count = 0;
        Node temp = top;
        while (temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public boolean contains(int num){
        return false;
    }
    public boolean isEmpty(){
        return top==null;
    }

    private class Node{
        private int data;
        private Node next;
        public Node(int data) {
            this.data = data;
        }
    }
}
