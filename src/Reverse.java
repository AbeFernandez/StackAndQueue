import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Stack<Integer> stackOfInts = new Stack<Integer>();
        stackOfInts.add(1);
        stackOfInts.add(8);
        stackOfInts.add(4);
        stackOfInts.add(5);
        stackOfInts.add(3);
        stackOfInts.add(6);
        System.out.println(stackOfInts);
        reverse(stackOfInts);
        System.out.println(stackOfInts);
    }

    public static void reverse(Stack<Integer> stackOfInts){
        Queue<Integer> queue = new LinkedList<Integer>();
        while (!stackOfInts.isEmpty()){
            queue.add(stackOfInts.pop());
        }

        int size = queue.size();
        for (int i = 0; i < size; i++) {
            int number = queue.remove();
            stackOfInts.push(number);
        }
    }
}
