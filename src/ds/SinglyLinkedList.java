package ds;

public class SinglyLinkedList {
    private Node front;

    public void add(int data){
        Node n1 = new Node(data);
        if(isEmpty()){
            front = n1;
        }else{
            add(size(),data);
        }
    }
    public void add(int index, int data){
        if(size()<index || index<0){
            System.err.println("Invalid Index");
        }else if(index==0){
            add(data);
        }else{
            Node n1 = new Node(data);
            Node temp = front;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            Node temp1 = front;
            for (int i = 0; i < index; i++) {
                temp1 = temp1.next;
            }
            temp.next=n1;
            temp.next.next = temp1;
        }
    }
    public void remove(int index){
        if(size()<=index || index<0 || isEmpty()){
            System.err.println("Invalid Index");
        }else{
            Node temp = front;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            temp.next  = searchNode(index).next;
        }
    }
    public int get(int index){
        if(size()<index || index<0){
            throw new RuntimeException("Invalid Index");
        }
        return searchNode(index).data;
    }
    public void print(){
        System.out.print("[");
        Node temp = front;
        while(temp!=null){
            System.out.print(temp.data+", ");
            temp = temp.next;
        }
        System.out.println(isEmpty() ? "Empty]":"\b\b]");
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
    public boolean contains (int num){
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

    private Node searchNode(int index){
        Node temp = front;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    private class Node{
        private int data;
        private Node next;
        private Node(int data) {
            this.data = data;
        }
    }
}
