package tr.workintech.courses.s15d4;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class LIFOFIFO {

    public static void main(String[] args) {

        // FIFO -> First In First Out -> Ilk giren ilk cikar
        // <- [1] [2] [3]
        // Ilk kez eklediginiz eleman, ilk eleman get cagirisnda donecektir
        // Ornek: Queue (kuyruk)

        // LIFO -> Last In First Out -> Son gelen ilk cikar
        // <- [1] [2] [3]
        // Once 3 gelir
        // Ornek: Stack (yigin)

        // FIFO - Queue
        Queue<String> queue = new LinkedBlockingQueue<>();
        queue.add("Ezgi");
        queue.add("Ozan");
        queue.add("Osman");
        queue.add("Can");

        String firstValue = queue.poll();

//        System.out.println(queue);

        // LIFO - Stack
        Stack<String> stack = new Stack<>();
        stack.push("Ezgi");
        stack.push("Ozan");
        stack.push("Osman");
        stack.push("Can");

        firstValue = stack.pop();

//        System.out.println(stack);
    }
}
