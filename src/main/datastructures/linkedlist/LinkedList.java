package main.datastructures.linkedlist;

import java.beans.beancontext.BeanContextChild;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(){
        length = 0;
        head = tail = null;
    }

    public class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }

        @Override
        public String toString() {
            return Integer.toString(value);
        }

        public int getValue() {return value;}


    }

    @Override
    public String toString() {
        // return a string containing all values of list in order
        String res = "";
        Node temp = head;
        for(int i=0; i<length;i++){
            res = res + temp.value + ", ";
            temp = temp.next;
        }
        return res;
    }

    public int getLength(){return length;}

    public void clearList(){
        head = tail = null;
        length = 0;
    }

    public Node getNode(int index){
        if(index < 0 || index >= length){
            return null;
        }
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp;
    }

    public void append(int value){  //append to end of list
        if(length == 0) {
            head = tail = new Node(value);
            length++;
            return;
        }
        tail.next = new Node(value);
        tail = tail.next;
        length++;
    }

    public Node removeFirst(){
        if(length == 0) {
            return null;
        }
        if(length == 1){
            Node temp = head;
            clearList();
            return temp;
        }
        Node temp = head;
        head = head.next;
        return temp;
    }

    public Node removeLast(){
        if(length == 0){
            return null;
        }
        if(length == 1){
            Node temp = head;
            head = tail = null;
            return temp;
        }
        Node temp = getNode(length - 2); //get node before last
        tail = temp;
        temp = temp.next;
        tail.next = null;
        length--;
        return temp;

    }

    public void prepend(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        length++;
    }

    public boolean setNode(int index, int value){
        Node temp = getNode(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value){
        Node pre = getNode(index-1); // get node before target index
        if(pre == null){
            return false;
        }
        Node post = pre.next;
        pre.next = new Node(value);
        pre.next.next = post;
        length++;
        return true;
    }

    public Node remove(int index){
        if(index < 0 || index >= length){
            return null;
        }
        if(index == 1){
            return removeFirst();
        }
        Node pre = getNode(index-1);
        Node temp = pre.next;
        pre.next = temp.next;
        length--;
        return temp;
    }

    public void reverse(){
        if(length < 2){
            return;
        }
        Node pre = null;
        Node temp = head;
        Node after = head.next;
        head = tail;
        tail = temp;
        while(temp != null){
            after = temp.next;
            temp.next = pre;
            pre = temp;
            temp = after;
        }

    }

    // coding challege methods
    public Node getMiddleNode(){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean hasLoop(){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    public Node getKthNodeFromEnd(int k){
        if(k >= length || k < 0){
            return null;
        }
        // two pointers,both start at head
        Node left = head;
        Node right = head;
        for(int i=0;i<k;i++){
            right = right.next;
        }
        while(right.next != null){
            right = right.next;
            left = left.next;
        }

        return left;


        // first pointer moves until the kth node
        // both pointers then move until right pointer is null
        // return left pointer
    }

    public int binaryToDecimal(){
        // each node represets 1 or 0, convert the list to decimal and return the int
        // if non base 2 values exist, we take the modulo2 of the value
        int res = 0;
        Node temp = head;
        for(int place = length-1; place >= 0; place--){
            res += temp.getValue() *(int)(Math.pow(2, place));
            temp = temp.next;
        }
        return res;
    }











}
