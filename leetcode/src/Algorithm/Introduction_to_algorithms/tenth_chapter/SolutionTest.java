package Algorithm.Introduction_to_algorithms.tenth_chapter;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void listSearch() {

        Node node1 = new Node(9);
        Node node2 = new Node(16);
        Node node3 = new Node(4);
        Node node4 = new Node(1);
        node1.next = node2;
        node2.next = node3;
        node2.prev = node1;
        node3.next = node4;
        node3.prev = node2;
        node4.prev = node3;
        ListSentinel list = new ListSentinel(node1);


    }
}