import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {
        //Ordered collections of items (adding new items at "rear", removing at "front")
        //rear: last element or latest element added
        //front: the first element added or first in the queue

        //You add new elements at the rear (enqueue)
        //You remove existing elements from the front (dequeue)

        //FIFO first-in-first-out or first-come-first-served
        //E.g., Reservation (movie ticket/restaurant/grocery checkout line), waitlist (class)

        //PriorityQueue && LinkedList

        //add (enqueue) : adds an element at the rear
        //element: gets the head (front) of the queue
        //offer: inserts an element in the queue
        //peek: gets the head (front) of the queue, or return null if queue is empty
        //poll (dequeue): removes the element from the front, or return null if queue is empty
        //remove: removes the element from the front

        Queue<String> ticketReserve = new LinkedList<>();
        //add (enqueue) an element in the queue
        ticketReserve.add("Ticket #1"); //similar to offer()
        ticketReserve.add("Ticket #2"); //similar to offer()
        ticketReserve.add("Ticket #3"); //similar to offer()

        System.out.println("The head (front) element is: " + ticketReserve.element()); //similar to peek()
        System.out.println(ticketReserve);

        //add (enqueue)
        ticketReserve.add("Ticket #4");
        System.out.println("The head (front) element is: " + ticketReserve.element()); //similar to peek()
        System.out.println(ticketReserve);

        //remove (poll) (dequeue) an item
        System.out.println("This person got the ticket " + ticketReserve.poll()); //similar to remove()
        System.out.println("The head (front) element is: " + ticketReserve.element());
        System.out.println(ticketReserve);

//        if(ticketReserve.poll() != null) {
//            System.out.println("This person got the ticket.");
//        }
//        System.out.println("This person got the ticket " + ticketReserve.poll());
//        System.out.println("This person got the ticket " + ticketReserve.poll());
//        System.out.println("This person got the ticket " + ticketReserve.poll());
        System.out.println("This person got the ticket " + ticketReserve.remove());
        System.out.println("This person got the ticket " + ticketReserve.remove());
        System.out.println("This person got the ticket " + ticketReserve.remove());
        System.out.println(ticketReserve);

        //-------------------------------------------------------------------------------------------
        System.out.println("=========================PriorityQueue==========================");
        Queue<Integer> ticketReservePriority = new PriorityQueue<>();
        //add (enqueue) an element in the queue
        ticketReservePriority.add(10); //similar to offer()
        ticketReservePriority.add(5); //similar to offer()
        ticketReservePriority.add(3); //similar to offer()

        System.out.println("The head (front) element is: " + ticketReservePriority.element()); //similar to peek()
        System.out.println(ticketReservePriority);

        //add (enqueue)
        ticketReservePriority.add(1);
        System.out.println("The head (front) element is: " + ticketReservePriority.element()); //similar to peek()
        System.out.println(ticketReservePriority);

        //remove (poll) (dequeue) an item
        System.out.println("This person got the ticket " + ticketReservePriority.poll()); //similar to remove()
        System.out.println("The head (front) element is: " + ticketReservePriority.element());
        System.out.println(ticketReservePriority);

//        if(ticketReserve.poll() != null) {
//            System.out.println("This person got the ticket.");
//        }
//        System.out.println("This person got the ticket " + ticketReservePriority.poll());
//        System.out.println("This person got the ticket " + ticketReservePriority.poll());
//        System.out.println("This person got the ticket " + ticketReservePriority.poll());
        System.out.println("This person got the ticket " + ticketReservePriority.remove());
        System.out.println("This person got the ticket " + ticketReservePriority.remove());
        System.out.println("This person got the ticket " + ticketReservePriority.remove());
        System.out.println(ticketReservePriority);
    }
}
