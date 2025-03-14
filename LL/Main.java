public class Main {
    public static void main(String[] args) {
        // LL list = new LL();
        // list.insertFirst(3);
        // list.insertFirst(2);
        // list.insertFirst(8);
        // list.insertFirst(17);
        // list.insertLast(99);
        // list.insert(100, 3);
        // list.display();
        // System.out.println(list.deleteFirst());
        // list.display();
        // System.out.println(list.deleteLast());
        // list.display();
        // System.out.println(list.delete(2));
        // list.display();
        // list.insertRec(88, 2);
        // list.display();
        // list.insertFirst(4);
        // list.insertFirst(4);
        // list.insertFirst(2);
        // list.insertFirst(1);
        // list.insertFirst(1);
        // list.insertFirst(1);
        // list.display();
        // // list.duplicates();
        // list.display();
        

        // DLL list = new DLL();
        // list.insertFirst(3);
        // list.insertFirst(2);
        // list.insertFirst(8);
        // list.insertFirst(17);
        // list.insert(8, 65);

        // list.display();

        // CLL list = new CLL();
        // list.insert(23);
        // list.insert(3);
        // list.insert(19);
        // list.insert(75);
        // list.delete(19);
        // list.display();
        
        LL first = new LL();
        LL second = new LL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        LL ans = LL.merge(first, second);
        ans.display();
    }
}