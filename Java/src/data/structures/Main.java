package data.structures;

public class Main {
    public static void Main(String[] args) {
        int[] nums = {1, 2, 3, 5, 6};

        /* when index is known / no sorting */
        // O(1) -> constant running time
        System.out.println(nums[0]);

        /* sorted */
        // log N(1 = N/2^x) logarithmic running time
        /// note: in logarithmic search if an array grows by 4X(9X) then algorithm has 2X(3X) running time
        // e.g. binary search: cuts the array half each time

        /* when index is not known / no sorting*/
        // O(N) -> linear running time (if using for loop to find item with O(1) time complexity)
        // O(N*N) -> quadratic running time if (if using for loop to find item with O(N) time complexity)
        /// note: in linear search if an array grows by 4X then algorithm has 4X running time
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 10) {
                System.out.println();
            }
        }

        /* bubble sort */
        // O(N*N) -> quadratic running time
        /// note: in quadratic search if an array grows by 2X(3X) then algorithm has 4X(9X) running time(N * N)
        int[] bubbles = {1, 2, 6, 3, 7, 8, 4};
        for (int i = 0; i < bubbles.length; i++) {
            for (int j = 1; j < bubbles.length - 1 ; j++) {
                if (bubbles[j - 1] > bubbles[j]) {
                    int temp = bubbles[j - 1];
                    bubbles[j - 1] = bubbles[j];
                    bubbles[j] = temp;
                }
            }
        }
    }
}
