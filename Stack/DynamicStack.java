public class DynamicStack extends CustomStack {
    public DynamicStack() {
        super(); // it'll call CustomStack()
    }

    public DynamicStack(int size) {
        super(size); // it'll call CustomStack(int size)
    }

    @Override
    public boolean push(int item) {
        if (this.isFull()) {
            // double the array size
            int[] temp = new int[data.length * 2];

            // copy all previous items in new data
            for (int i=0; i<data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        // insert item
        return super.push(item);
    }
}
