package Algorithm.Tire.Graph;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 * @author 胡阳
 * @ClassName GraphTraversal
 * @description: 图的遍历
 * @date 2022年04月06日 10:28
 */
public class GraphTraversal {

    //图
    ListGraph graph;
    //记录哪些顶点被访问过了
    boolean[] visited;

    public GraphTraversal(ListGraph listGraph) {
        graph = listGraph;
        visited = new boolean[listGraph.graphs.size()];
    }

    public void BFS() {
        for (int i = 0; i < graph.graphs.size(); i++) {
            if (!visited[i]) {
                BFSTraversal(i);
            }
        }
    }

    private void BFSTraversal(int v) {
        //双端队列接口
        Deque<Integer> queue = new ArrayDeque<>();
        visited[v] = true;
        //在头部插入一个元素
        queue.offerFirst(v);
        //当队列不为空执行，
        while (queue.size() != 0) {
            //抛出第一个元素返回给cur
            Integer cur = queue.pollFirst();
            System.out.println(cur + "->");
            //迭代器迭代，找cur的所有邻接点
            Iterator<Integer> neighbors = graph.graphs.get(cur).listIterator();
            while (neighbors.hasNext()) {
                int nextNode = neighbors.next();
                if (!visited[nextNode]) {
                    //在头部依次插入cur的所有邻接点，并将visited值设为true
                    queue.offerFirst(nextNode);
                    visited[nextNode] = true;
                }
            }
        }
    }

    public void DFS() {
        //进行遍历
        for (int i = 0; i < graph.graphs.size(); i++) {
            //该点未被访问过，进入函数
            if (!visited[i]) {
                DFSTraversal(i);
            }
        }
    }

    public void DFSTraversal(int v) {
        //如果该点被访问过，回溯
        if (visited[v]) {
            return;
        }
        //进入该点，该点被访问，做标记
        visited[v] = true;
        System.out.println(v + "->");
        //拿到该顶点的所有连接点进行迭代
        Iterator<Integer> neighbors = graph.graphs.get(v).listIterator();
        while (neighbors.hasNext()) {
            int nextNode = neighbors.next();
            if (!visited[nextNode]) {
                //递归遍历
                DFSTraversal(nextNode);
            }
        }
    }

}
