import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SplitStack {
    public static void main(String[] args) {
        Stack<Integer> stackInt = new Stack<Integer>();
        stackInt.add(4);
        stackInt.add(0);
        stackInt.add(-1);
        stackInt.add(5);
        stackInt.add(-6);
        stackInt.add(-3);
        stackInt.add(2);
        stackInt.add(7);
        System.out.println(stackInt);
        splitStack(stackInt);
        System.out.println(stackInt);
    }

    public static void splitStack(Stack<Integer> stackInt){
        Queue<Integer> queue = new LinkedList<Integer>();
        while (!stackInt.isEmpty()){
            queue.add(stackInt.pop());
        }
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            int number = queue.remove();

            if (number < 0) {
                stackInt.push(number);
            }
            else{
                queue.add(number);
            }
        }
        while(!queue.isEmpty()){
            stackInt.push(queue.remove());
        }

    }
}
