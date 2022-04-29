package hy4.day10;

/**
 * 代码过于多了
 * @author 胡阳
 * @ClassName Solution
 * @description: 427.建立四叉树
 * @date 2022年04月29日 10:09
 */
public class Solution {

    public Node construct(int[][] grid) {
        Node root = new Node();
        int n = grid.length;
        if (n == 1) {
            root.isLeaf = true;
            root.val = false;
            return root;
        }
        diGui(root, n, grid);
        return root;
    }

    private void diGui(Node root, int n, int[][] grid) {
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = true;
        boolean flag4 = true;
        for (int i = 1; i < 5; i++) {
            if (i == 1) {
                int[][] tmp = new int[n/2][n/2];
                int compare = grid[0][0];
                for (int x = 0; x < n/2; x++) {
                    for (int y = 0; y < n/2; y++) {
                        if (compare != grid[x][y]) {
                            flag1 = false;
                        }
                        tmp[x][y] = grid[x][y];
                    }
                }
                if (flag1) {
                    if (compare == 1) {
                        node1.val = true;
                        node1.isLeaf = true;
                    } else {
                        node1.val = false;
                        node1.isLeaf = true;
                    }
                }
                root.topLeft = node1;
                if (!flag1) {
                    diGui(node1, n/2, tmp);
                }
            }
            if (i == 2) {
                int[][] tmp = new int[n/2][n/2];
                int compare = grid[0][n/2];
                for (int x = 0, p = 0; x < n/2; x++, p++) {
                    for (int y = n/2, q = 0; y < n; y++, q++) {
                        if (compare != grid[x][y]) {
                            flag2 = false;
                        }
                        tmp[p][q] = grid[x][y];
                    }
                }
                if (flag2) {
                    if (compare == 1) {
                        node2.val = true;
                        node2.isLeaf = true;
                    } else {
                        node2.val = false;
                        node2.isLeaf = true;
                    }
                }
                root.topRight = node2;
                if (!flag2) {
                    diGui(node2, n/2, tmp);
                }
            }
            if (i == 3) {
                int[][] tmp = new int[n/2][n/2];
                int compare = grid[n/2][0];
                for (int x = n/2, p = 0; x < n; x++, p++) {
                    for (int y = 0, q = 0; y < n/2; y++, q++) {
                        if (compare != grid[x][y]) {
                            flag3 = false;
                        }
                        tmp[p][q] = grid[x][y];
                    }
                }
                if (flag3) {
                    if (compare == 1) {
                        node3.val = true;
                        node3.isLeaf = true;
                    } else {
                        node3.val = false;
                        node3.isLeaf = true;
                    }
                }
                root.bottomLeft = node3;
                if (!flag3) {
                    diGui(node3, n/2, tmp);
                }
            }
            if (i == 4) {
                int[][] tmp = new int[n/2][n/2];
                int compare = grid[n/2][n/2];
                for (int x = n/2, p = 0; x < n; x++, p++) {
                    for (int y = n/2, q = 0; y < n; y++, q++) {
                        if (compare != grid[x][y]) {
                            flag4 = false;
                        }
                        tmp[p][q] = grid[x][y];
                    }
                }
                if (flag4) {
                    if (compare == 1) {
                        node4.val = true;
                        node4.isLeaf = true;
                    } else {
                        node4.val = false;
                        node4.isLeaf = true;
                    }
                }
                root.bottomRight = node4;
                if (!flag4) {
                    diGui(node4, n/2, tmp);
                }
            }
        }
        if (flag1 && flag2 && flag3 && flag4) {
            if ((node1.val && node2.val && node3.val && node4.val) || (!node1.val && !node2.val && !node3.val && !node4.val)) {
                root.val = node1.val;
                root.isLeaf = true;
                root.bottomRight = null;
                root.bottomLeft = null;
                root.topRight = null;
                root.topLeft = null;
            }
        }
    }
}
