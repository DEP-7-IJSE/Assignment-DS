package ds;

public class Stack {
    Node top;

    public void add(int data){

    }
    public void add(int index, int data){

    }
    public void remove(int index){

    }
    public int get(int index){
        return 0;
    }
    public void print(){

    }
    public void clear(){

    }
    public void size(){

    }
    public boolean contains(int num){
        return false;
    }
    public boolean isEmpty(){
        return false;
    }

    private class Node{
        private int data;
        private Node next;
        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
