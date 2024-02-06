package testing.datastructures.linkedlist;

import main.datastructures.linkedlist.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    // append tests
    @Test
    void appendToEmptyList(){
        LinkedList linkedList = new LinkedList();
        linkedList.append(2);
        assertTrue("2, ".equals( linkedList.toString()) && linkedList.getLength() == 1 );
    }
    @Test
    void appendToList1(){
        LinkedList linkedList = new LinkedList();
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.append(6);
        assertTrue("2, 3, 4, 5, 6, ".equals( linkedList.toString()) && linkedList.getLength() == 5 );
    }

    // prepend tests
    @Test
    void prependToEmptyList(){
        LinkedList linkedList = new LinkedList();
        linkedList.prepend(2);
        assertTrue("2, ".equals( linkedList.toString()) && linkedList.getLength() == 1 );
    }
    @Test
    void prependToList1(){
        LinkedList linkedList = new LinkedList();
        linkedList.prepend(2);
        linkedList.prepend(3);
        linkedList.prepend(4);
        linkedList.prepend(5);
        linkedList.prepend(6);
        assertTrue("6, 5, 4, 3, 2, ".equals( linkedList.toString()) && linkedList.getLength() == 5 );
    }

    // clear list tests

    // getNode tests
    @Test
    void getNodeValidIndex1(){
        LinkedList linkedList = new LinkedList();
        linkedList.append(2);
        linkedList.append(1);
        assertEquals(2, linkedList.getNode(0).getValue());
    }
    @Test
    void getNodeValidIndex2(){
        LinkedList linkedList = new LinkedList();
        linkedList.append(2);
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(1);
        assertEquals(1, linkedList.getNode(5).getValue());
    }
    @Test
    void getNodeValidIndex3(){
        LinkedList linkedList = new LinkedList();
        linkedList.append(2);
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(1);
        assertEquals(1, linkedList.getNode(3).getValue());
    }

    @Test
    void getNodeInvalidIndex1(){
        LinkedList linkedList = new LinkedList();
        assertNull(linkedList.getNode(0));
    }

    @Test
    void getNodeInvalidIndex2(){
        LinkedList linkedList = new LinkedList();
        linkedList.append(2);
        linkedList.append(1);
        assertNull(linkedList.getNode(2));
    }
    @Test
    void getNodeInvalidIndex3(){
        LinkedList linkedList = new LinkedList();
        linkedList.append(2);
        linkedList.append(1);
        assertNull(linkedList.getNode(-1));
    }

    // set node tests

    // remove first tests

    // remove last tests
    @Test
    void removeLastEmptyList(){

    }
    @Test
    void removeLastValidCase1(){

    }

    // insert tests

    // remove tests

    // reverse tests
    @Test
    void reverseLengthTwo(){
        LinkedList linkedList = new LinkedList();
        linkedList.append(2);
        linkedList.append(1);
        linkedList.reverse();

        assertEquals(linkedList.toString(), "1, 2, ");
    }
    @Test
    void reverseLengthZero(){
        LinkedList linkedList = new LinkedList();
        linkedList.reverse();

        assertEquals(linkedList.toString(), "");
    }
    @Test
    void reverseLengthOne(){
        LinkedList linkedList = new LinkedList();
        linkedList.append(2);
        linkedList.reverse();

        assertEquals(linkedList.toString(), "2, ");
    }

    @Test
    void reverseLengthTen(){
        LinkedList linkedList = new LinkedList();
        linkedList.append(10);
        linkedList.append(9);
        linkedList.append(8);
        linkedList.append(7);
        linkedList.append(6);
        linkedList.append(5);
        linkedList.append(4);
        linkedList.append(3);
        linkedList.append(2);

        linkedList.reverse();

        assertEquals(linkedList.toString(), "2, 3, 4, 5, 6, 7, 8, 9, 10, ");
    }

    @Test
    void doubleReverseLengthTen(){
        LinkedList linkedList = new LinkedList();
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.append(6);
        linkedList.append(7);
        linkedList.append(8);
        linkedList.append(9);
        linkedList.append(10);

        linkedList.reverse();
        linkedList.reverse();

        assertEquals(linkedList.toString(), "2, 3, 4, 5, 6, 7, 8, 9, 10, ");
    }

    // get middle node tests
    @Test
    void getMiddleNodeEmptyList(){
        LinkedList linkedList = new LinkedList();
        assertNull(linkedList.getMiddleNode());
    }

    @Test
    void getMiddleNodeLengthThree(){
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        assertEquals(linkedList.getMiddleNode().getValue(), 2);
    }
    @Test
    void getMiddleNodeLengthSix(){
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.append(6);
        assertEquals(linkedList.getMiddleNode().getValue(), 4);
    }

    @Test
    void getMiddleNodeLengthOne() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        assertEquals(linkedList.getMiddleNode().getValue(), 1);
    }

    // hasLoop tests
    @Test
    void hasLoopReturnsFalseWhenEmpty(){
        LinkedList linkedList = new LinkedList();
        assertFalse(linkedList.hasLoop());
    }

    // getKthNodeFromEnd tests
    @Test
    void getKthNodeFromEndEmptyList(){
        LinkedList linkedList = new LinkedList();
        assertNull(linkedList.getKthNodeFromEnd(0));
    }
    @Test
    void getKthNodeFromEndListLengthOne(){
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        assertEquals(linkedList.getKthNodeFromEnd(0).getValue(), 1);
    }
    @Test
    void getKthNodeFromEndListLengthOneInvalidIndex(){
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        assertNull(linkedList.getKthNodeFromEnd(1));
    }

    @Test
    void getKthNodeFromEndListLengthThree(){
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        assertEquals(linkedList.getKthNodeFromEnd(1).getValue(), 2);
    }

    // binary to decimal test
    @Test
    void binaryToDecimalFourBitValueFive(){
        LinkedList linkedList = new LinkedList();
        linkedList.append(0);
        linkedList.append(1);
        linkedList.append(0);
        linkedList.append(1);
        assertEquals(linkedList.binaryToDecimal(), 5);
    }
    @Test
    void binaryToDecimalFourBitValueOne(){
        LinkedList linkedList = new LinkedList();
        linkedList.append(0);
        linkedList.append(0);
        linkedList.append(0);
        linkedList.append(1);
        assertEquals(linkedList.binaryToDecimal(), 1);
    }
    @Test
    void binaryToDecimalFourBitValueThirtyOne(){
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(1);
        linkedList.append(1);
        linkedList.append(1);
        assertEquals(linkedList.binaryToDecimal(), 15);
    }
    @Test
    void binaryToDecimalFourBitValueZero(){
        LinkedList linkedList = new LinkedList();
        linkedList.append(0);
        linkedList.append(1);
        linkedList.append(0);
        linkedList.append(1);
        assertEquals(linkedList.binaryToDecimal(), 5);
    }
    @Test
    void binaryToDecimalEmptyList(){
        LinkedList linkedList = new LinkedList();
        assertEquals(linkedList.binaryToDecimal(), 0);
    }








}