package add.console;

import data.structures.*;
import data.structures.stack.Stack;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String[] participant = new String[] {"leo", "kiki", "eden"};
        String[] participant1 = new String[] {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] participant2 = new String[] {"mislav", "stanko", "mislav", "ana"};
        String[] completion = new String[] {"eden", "kiki"};
        String[] completion1 = new String[] {"josipa", "filipa", "marina", "nikola"};
        String[] completion2 = new String[] {"stanko", "ana", "mislav", "ana"};

//        System.out.println(Maraton.solution(participant2, completion2));
        int[] stones = new int[] {1, 3, 2};
        int k = 3;

        System.out.println(Stone.stone(stones, k));

//        String[] input = new String[] {"119", "97674223", "12","13","15","567","88", "1195524421"};
//        System.out.println(PhoneBook.phone(input));
        int[] nums = {1, 4, 2, 5};
        System.out.println(nums[0]);
        LinkedList<String> names = new LinkedList<>();
        names.insert("tom");
        names.insert("jack");
        names.insert("wang");
        names.reverse();
        names.traverse();
        System.out.println("middel value: " + names.getMiddleNode());

        // doubly linked list
        DoublyLinkedList<String> dNames = new DoublyLinkedList<>();
        dNames.insert("a");
        dNames.insert("v");
        dNames.insert("e");
        dNames.insert("e");
        dNames.traverseBackward();
        dNames.traverseBackward();

        // Java LinkedList is doubly linked
        java.util.LinkedList<String> dll = new java.util.LinkedList<>();
        dll.addLast("wha");
        dll.addLast("hll");
        dll.removeFirst();
        dll.removeLast();

        // speed test
        java.util.ArrayList<Integer> tArray = new ArrayList<>();
        long now = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) tArray.add(0, i);
        System.out.println("Time taken for ArrayList: " + (System.currentTimeMillis() - now));

        java.util.LinkedList<Integer> tList = new java.util.LinkedList<>();
        now = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) tList.addFirst(i);
        System.out.println("Time taken for LinkedList: " + (System.currentTimeMillis() - now));

        // stack
        Stack<String> stackNames = new Stack<>();
        stackNames.push("a");
        stackNames.push("v");
        stackNames.push("e");
        stackNames.push("e");

        while (!stackNames.isEmpty()) {
            System.out.println("stack: "+ stackNames.pop());
        }
    }
}
