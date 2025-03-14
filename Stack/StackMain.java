public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new DynamicStack(5);
        stack.push(43);
        stack.push(34);
        stack.push(17);
        stack.push(2);
        stack.push(1);
        stack.push(1);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        
    }
    
    
}
