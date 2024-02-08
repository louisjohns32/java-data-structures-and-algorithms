package main.datastructures.stack;

public class Stack {
    private int length;
    private Node top;

    public Stack(int value){
        top = null;
        length = 0;
    }


    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    public int getLength(){ return length;}
    public Node getTop(){return top;}

    @Override
    public String toString() {
        String res = "";
        Node temp = top;
        while(temp != null){
            res += temp.value;
            temp = temp.next;
        }
        return res;
    }

    public void push(int value){
        Node temp = top;
        top = new Node(value);
        top.next = temp;
        length++;
    }

    public Node pop(){
        if(length == 0){
            return null;
        }
        Node temp = top;
        top = top.next;
        length--;
        return temp;
    }

}
