import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reorder {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>() ;
        queue.add(1);
        queue.add(-2);
        queue.add(4);
        queue.add(5);
        queue.add(-7);
        queue.add(-9);
        queue.add(-12);
        queue.add(28);
        queue.add(-34);

        reorder(queue);
        System.out.println(queue);
    }

    public static void reorder(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<Integer>();
        int size = queue.size();
        int count = 0;

        for(int i = 0;i < size;i++){
            int number = queue.remove();

            if(number < 0){
                stack.push(number);
            }
            else{
                queue.add(number);
                count++;
            }
        }
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }

        for (int i = 0; i < count; i++) {
            queue.add(queue.remove());
        }
    }

}
