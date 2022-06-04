import java.util.Stack;

public class RemoveMin {
    public static void main(String[] args) {
        Stack<Integer> stackOfInts = new Stack<Integer>();
        stackOfInts.add(5);
        stackOfInts.add(6);
        stackOfInts.add(3);
        stackOfInts.add(4);
        System.out.println(stackOfInts);
        System.out.println(removeMin(stackOfInts));
        System.out.println(stackOfInts);
    }
    public static int removeMin(Stack<Integer> stackOfInts){
        Stack<Integer> tempStack = new Stack<Integer>();
        int min = stackOfInts.peek();

        while (!stackOfInts.isEmpty()){
            tempStack.add(stackOfInts.pop());
        }
        int size = tempStack.size();
        for (int i = 0; i < size; i++) {
            int number = tempStack.pop();

            if (number <= min) {
                min = number;
            }
            else{
                stackOfInts.add(number);
            }
        }
        return min;
    }
}
