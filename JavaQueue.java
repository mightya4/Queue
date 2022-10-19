import java.util.Queue;
import java.util.PriorityQueue;

public class JavaQueue {
    public static void main(String[] args) {
        Queue<String> books = new PriorityQueue<String>();


        books.add("To Kill a Mockingbird");
        books.add("The Hunger Games");
        books.add("The Da Vinci Code");
        books.add("Water for Elephants");
        books.add("Lord of the Flies");

        System.out.println(books);

        //Remove First Element in Queue
        books.remove();

        System.out.println(books);

    }
}
