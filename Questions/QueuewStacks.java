import java.util.Stack;

public class QueuewStacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        System.out.println(stack.peek());    
    }
    
    class QueueusingStacks {
        private Stack<Integer> first;
        private Stack<Integer> second;

        public QueueusingStacks() {
            first = new Stack<>();
            second = new Stack<>();
        }

        public void add(int item) {
            first.push(item);
        }

        public void add2(int item) {
            while(!first.isEmpty()) {
                second.push(first.pop());
            }

            first.push(item);

            while (!second.isEmpty()) {
                first.push(second.pop());
            }
        }

        public int remove() throws Exception{
            while(!first.isEmpty()) {
                second.push(first.pop());
            }

            int removed = second.pop();

            while (!second.isEmpty()) {
                first.push(second.pop());
            }

            return removed;
        }

        public int remove2() throws Exception {
            return first.pop();
        }

        public int peek() throws Exception {
            while(!first.isEmpty()) {
                second.push(first.pop());
            }

            int peeked = second.peek();

            while (!second.isEmpty()) {
                first.push(second.pop());
            }

            return peeked;
        }

        public int peek2() throws Exception {
            return first.peek();
        }

        public boolean isEmpty() {
            return first.isEmpty();
        }
    }

}
