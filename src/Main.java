
import java.util.*;

public class Main {
    public static void main(String[] args) {


//----------------------------------------------------------------------------------------------------------------------//

        // --> Stack Data Structure
            // this is the "last in first out"
            // in stack data structure, if we need to add a new value to stack, we used push function
            // and we use pop function to remove a value from the stack

            // create a stack
        Stack<String> stackOfBooks = new Stack<>();
            // check stack is empty or not
        System.out.println("before pushing "+stackOfBooks.empty());
        System.out.println("is Stack empty ? "+stackOfBooks.isEmpty());
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
        // or
        System.out.println(stackOfBooks.peek());

//----------------------------------------------------------------------------------------------------------------------//

        // --> Queue Data Structure
            // this is the "first in first out"
            // in queue data structure, if we need to add a new value to queue, we used offer command
            // and we used poll command to remove a value from queue

        Queue<String> newQueue = new LinkedList<>();
        newQueue.offer("sanchitha");
        newQueue.offer("udana");
        newQueue.offer("wijesundara");
        newQueue.offer("vilayaya");

            // we can check queue is empty or not
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
            // clear alla data included in Queue
        newQueue.clear();
        System.out.println(newQueue);


//----------------------------------------------------------------------------------------------------------------------//

        // --> Priority Queue
            // in the queue, when used while loop to poll values ,
            // the output show small value to large value  A to Z
            // to reverse the order   Z to A
            // Queue<Integer> nameOfNewObject = new PriorityQueue<>(Collections.reverseOrder());  <--  this code
            // in PriorityQueue calling Constructor inside Collections.reverseOrder()

        Queue<Integer> queuep = new PriorityQueue<>(Collections.reverseOrder());

        queuep.offer(100);
        queuep.offer(50);
        queuep.offer(70);
        queuep.offer(10);
        queuep.offer(15);

            // when the queue empty, while loop is running when the queue is empty
        while (!queuep.isEmpty()){
            System.out.println(queuep.poll());
        }

//----------------------------------------------------------------------------------------------------------------------//

        //--> LinkedList

        LinkedList<String> linked1 = new LinkedList<String>();

            // we can use this LinkedList as Stack
        /*
        linked1.push("A");
        linked1.push("B");
        linked1.push("C");
        linked1.push("D");
        linked1.push("F");
        System.out.println("before pop "+linked1);
        linked1.pop();
        System.out.println("after pop "+linked1);
        */
            // using as a Queue

        linked1.offer("A");
        linked1.offer("B");
        linked1.offer("C");
        linked1.offer("D");
        linked1.offer("F");
        //System.out.println(linked1);
        //linked1.poll();
            // ada new values
        System.out.println(linked1);
        linked1.add(4,"E");
        System.out.println(linked1);
        linked1.add(6,"G");
        System.out.println(linked1);
            // remove value
        linked1.remove("G");
        System.out.println(linked1);
            // add a value to first
        linked1.addFirst("1");
        System.out.println(linked1);
            // add a value to last
        linked1.addLast("Z");
        System.out.println(linked1);
            // remove last and first value
        linked1.removeFirst();
        linked1.removeLast();
        System.out.println(linked1);
































    }
}