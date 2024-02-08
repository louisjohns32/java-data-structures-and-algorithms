package main.datastructures.queue;

public class Queue {
    private int length;
    private Node front;

    public Queue(){
        length = 0;
        front = null;
    }

    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public void enqueue(int value){
        Node newNode = new Node(value);
        newNode.next = front;
        front = newNode;
        length++;
    }

    public Node dequeue() {
        if(length == 0){
            return null;
        }
        Node temp = front;
        front = front.next;
        length--;
        return temp;
    }

}
