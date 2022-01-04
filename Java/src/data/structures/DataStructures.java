package data.structures;

import java.util.Arrays;

public class DataStructures {
    public static void Structure() {
        /* ========= Data structures ========= */
        /* Arrays */
        // items are stored in the main memory(RAM)
        // each item has 4byte
        // optimized to find random item using indices -> O(1): constant / or to remove the last item
        // in other cases(such as the index is not known or removing item that is not the last) -> O(N): linear
        int[] input = {1, 2, 3};
        int[] output = reverse(input);
        System.out.println("Array examples: ");
        for (int i: output) {
            System.out.println(i);
        }

        /* Linked List */
        // every node stores the data itself and a reference the next node -> takes more memory
        // only the first item is accessible so inserting or removing an item to the first position is fast: O(1)
        // but other cases(middle or last) it is O(N)
        // no index
    }

    public static int[] reverse(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {
            result[j] = nums[i];
        }
        return result;
    }

    public static int[] reverseV2(int[] nums) {
        int startIndex = 0;
        int endIndext = nums.length - 1;

        while(endIndext > startIndex) {
            int temp = nums[startIndex];
            nums[startIndex] = nums[endIndext];
            nums[endIndext] = temp;
            startIndex++;
            endIndext++;
        }
        return nums;
    }

    public static boolean anagram(String value1, String value2) {
        char[] valueOne = value1.toCharArray();
        char[] valueTwo = value2.toCharArray();
        if (valueOne.length != valueTwo.length || valueOne == valueTwo) return false;
        Arrays.sort(valueOne);
        Arrays.sort(valueTwo);
        if (valueOne != valueTwo) return false;
        return true;
    }

    public static void duplicate(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[Math.abs(input[i])] > 0) {
                input[Math.abs(input[i])] = -input[Math.abs(input[i])];
            } else {
                System.out.println(Math.abs(input[i]) + " repetition");
            }
        }
    }
}
