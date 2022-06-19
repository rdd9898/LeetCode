package Algorithm.Introduction_to_algorithms.tenth_chapter;

/**
 * @author 胡阳
 * @ClassName Stack
 * @description: 栈的实现
 * @date 2022年06月19日 10:26
 */
public class Stack {

    int top = -1;
    int[] arr = new int[10];

    public Stack() {
    }

    public Stack (int[] arr) {
        this.top = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            this.arr[i] = arr[i];
        }
    }

    /**
     * @Description: 判断栈是否为空
     * @Param: [stack]
     * @return: boolean
     * @Author: HuYang
     * @Date:2022/6/19 10:37
     */
    public boolean stackEmpty (Stack stack) {
        if (stack.top == -1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @Description: 压入操作
     * @Param: [stack, x]
     * @return: void
     * @Author: HuYang
     * @Date:2022/6/19 10:37
     */
    public void push (Stack stack, int x) {
        stack.top++;
        stack.arr[top] = x;
    }

    /**
     * @Description: 弹出操作
     * @Param: [stack]
     * @return: int
     * @Author: HuYang
     * @Date:2022/6/19 10:36
     */
    public int pop (Stack stack) {
        if (stackEmpty(stack)) {
            System.out.println("栈下溢");
            throw new ArrayIndexOutOfBoundsException();
        } else {
            stack.top--;
            return stack.arr[stack.top + 1];
        }
    }

}
