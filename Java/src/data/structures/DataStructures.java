package data.structures;

public class DataStructures {
    public static void Structure() {
        /* ========= Data structures ========= */
        /* Arrays */
        // items are stored in the main memory(RAM)
        // optimized to find random item using indices -> O(1): constant / or to remove the last item
        // in other cases(such as the index is not known or removing item that is not the last) -> O(N): linear
        int[] input = {1, 2, 3};
        int[] output = reverse(input);
        System.out.println("Array examples: ");
        for (int i: output) {
            System.out.println(i);
        }
    }

    public static int[] reverse(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {
            result[j] = nums[i];
        }
        return result;
    }
}
