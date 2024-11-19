package Collection.Queue.PriorityQueue;

import java.util.Queue;
import java.util.PriorityQueue;
public class priorityQueue {
    public static void main(String[] args) {
        Queue <Integer>q1 = new PriorityQueue<>();
        q1.add(9);
            q1.add(43);
            // q1.add(null);//NulPointerException
            q1.add(7);
            q1.offer(1);
            q1.add(8);
            // q1.add("74");//ClassCastException
            // System.out.println(q1);
            System.out.println("before Any meyhod "+ q1);
            System.out.println(q1.peek());// It will point to the first element and if the queue is empty it will return null
            System.out.println(q1.element());//It will point to the first element and if the queue is empty it will return NoSuchElementException
            System.out.println("before removing "+ q1);
            System.out.println(q1.poll());//It will remove the first element and if the queue is empty it will return null
            System.out.println(q1.remove());//It will remove the first element and if the queue is empty it will return NoSuchElementException
            System.out.println("after removing "+ q1);//
        };
    }
    // create a student class with name  and implement the priority queue with the help of name hint : use comparator
