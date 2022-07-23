//package ClassWork;
//
//import org.w3c.dom.Node;
//class Node<T>{
//    public  T data;
//    private Node<T> next;
//
//
//    public boolean addNext(Node<T> node) {
//        next = node;
//        return true;
//    }
//
//    public Node<T> next() {
//        return next;
//    }
//}
//public class SinglyLinkedList {
//    private  Node<T> head;
//    private int size;
//
//    public  SinglyLinkedList(){
//        head = null;
//        size = 0;
//    }
////    public void setNext(T/)
//    public  SinglyLinkedList(T data){
//        this.head = new Node<>();
//        this.size = this.size + 1;
//    }
//    public void insert(T data){
//        Node<T> newNode = new Node<>();
//    }
//    public void insert(T data, int position) throws IllegalAccessException {
//        if (position < 0 || position > size) {
//            throw new IllegalAccessException(String.format("position is less than size or Greater than size "));
//
//        }
//        Node<T> newNode = new Node<>(data):
//        int count = 0;
//        Node<T> current = head;
//        while (count < position){
//            current = current.next();
//            count++;
//        }
//
//    }
//
//}