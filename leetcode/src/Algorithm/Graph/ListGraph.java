package Algorithm.Graph;

import java.util.ArrayList;

/**
 * @author 胡阳
 * @ClassName ListGraph
 * @description: 通过链表实现一个一个树
 * @date 2022年04月06日 10:08
 */
public class ListGraph {

    ArrayList<ArrayList<Integer>> graphs;

    /**
     * @Description: 图的构造方式
     * @Param: [v] v表示顶点的个数
     * @return:
     * @Author: HuYang
     * @Date:2022/4/6 10:10
     */
    public ListGraph(int v) {
        graphs = new ArrayList<>(v);
        //为每个点添加链表
        for (int i = 0; i < v; i++) {
            graphs.add(new ArrayList<>());
        }
    }

    //加边
    public void addEdge(int start, int end) {
        graphs.get(start).add(end);
    }

    //删边
    public void removeEdge(int start, int end) {
        graphs.get(start).remove((Integer) end);
    }

}
