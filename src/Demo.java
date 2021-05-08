import ds.SinglyLinkedList;

public class Demo {
    public static void main(String[] args) {
        SinglyLinkedList s1= new SinglyLinkedList();
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.print();
        System.out.println(s1.size());
        s1.add(40);
        s1.add(50);
        s1.add(60);
        s1.add(70);
        s1.print();
        s1.remove(2);
        s1.print();
        System.out.println(s1.size());
        s1.add(2,30);
        s1.print();
        s1.remove(4);
        s1.print();
        System.out.println(s1.get(2));
        System.out.println(s1.contains(100));
        s1.add(100,100);
    }
}
