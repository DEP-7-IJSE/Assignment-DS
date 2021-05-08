package ds;

public class SinglyLinkedList {
    Node front;

    public void add(int data){
        Node n1 = new Node(data);
        if(isEmpty()){
            front = n1;
        }else{
            Node lastNode = front;
            while (lastNode.next!=null){
                lastNode = lastNode.next;
            }
            lastNode.next = n1;
        }
    }
    public void add(int index, int data){

    }
    public void remove(int index){
        Node temp = front;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        Node temp1 = front;
        for (int i = 0; i < index; i++) {
            temp1 = temp1.next;
        }
        temp.next = temp1.next;
    }
    public int get(int index){
        Node temp = front;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
    public void print(){
        System.out.print("[");
        Node temp = front;
        while(temp!=null){
            System.out.print(temp.data+", ");
            temp = temp.next;
        }
        System.out.println("\b\b]");
    }
    public void clear(){
        front = null;
    }
    public int size(){
        int count = 0;
        Node temp = front;
        while (temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public boolean contains(int num){
        Node temp = front;
        while (temp!=null){
            if(num==temp.data){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public boolean isEmpty(){
        return front==null;
    }

    private class Node{
        private int data;
        private Node next;
        private Node(int data) {
            this.data = data;
        }
    }
}
