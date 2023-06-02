package daily_practice.april_2023.day25.offer_37;

import daily_practice.april_2023.day25.offer_37.Codec;
import org.junit.Test;

import static org.junit.Assert.*;

public class CodecTest {

    @Test
    public void serialize() {
        Codec.TreeNode node1 = new Codec.TreeNode(1);
        Codec.TreeNode node2 = new Codec.TreeNode(2);
        Codec.TreeNode node3 = new Codec.TreeNode(3);
        Codec.TreeNode node4 = new Codec.TreeNode(4);
        Codec.TreeNode node5 = new Codec.TreeNode(5);
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;
        Codec codec = new Codec();
        String serialize = codec.serialize(node1);
        System.out.println(serialize);
    }
}