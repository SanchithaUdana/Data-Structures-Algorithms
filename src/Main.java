
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {

        // --> Stack Data Structure
        // this is the "last in first out"

            // create a stack
        Stack<String> stackOfBooks = new Stack<>();
            // check stack is empty or not
        System.out.println("before pushing "+stackOfBooks.empty());

            // pushing data to the Stack
        stackOfBooks.push("python notes");
        stackOfBooks.push("java notes");
        stackOfBooks.push("spring notes");
        stackOfBooks.push("php notes");
        stackOfBooks.push("bootstrap notes");

            // to view the stack
        System.out.println(stackOfBooks);

            // pop the stack and view the stack
        stackOfBooks.pop();
        System.out.println(stackOfBooks);
        stackOfBooks.pop();
        System.out.println(stackOfBooks);

        stackOfBooks.push("java fx notes");
        System.out.println(stackOfBooks);

            // view the value in top of the stack
        String topOfItem = stackOfBooks.peek();
        System.out.println("the top of value : " + topOfItem);


        // --> Queue Data Structure
        // this is the "first in first out"

        Queue<String> newQueue = new LinkedList<>();

        newQueue.offer("sanchitha");
        newQueue.offer("udana");
        newQueue.offer("wijesundara");
        newQueue.offer("vilayaya");

        System.out.println(newQueue.isEmpty());
            // we can check size of the queue
        System.out.println(newQueue.size());
            // we can search the value, if available or not
        System.out.println(newQueue.contains("udana"));
            // we can get first value of the queue
        System.out.println(newQueue.peek());
            // we can get out value from Queue using poll
        System.out.println(newQueue);
        newQueue.poll();
        System.out.println(newQueue);















    }
}