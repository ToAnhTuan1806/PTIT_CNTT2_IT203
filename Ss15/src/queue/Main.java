package queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
//        Queue<String> queue = new ArrayDeque<String>();
//        queue.add("Apple"); // thêm
//        queue.offer("Banana");// thêm
//
//        queue.remove(); //lấy và xoá ptu đầu
//        queue.poll(); // lấy và xoá
//
//        queue.peek(); // lấy nhưng ko xoá
//        queue.element(); // lấy nhưng ko xoá

        // Hàng doi 2 dau
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("apple");
        linkedList.getFirst();

        linkedList.addLast("orange");
        linkedList.getLast();

    }
}
