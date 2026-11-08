import java.util.List;
import java.util.Map;

public class MidtermPractice {
    /**
     * Finds the longest word in an List of Strings.
     * If there are multiple words tied for longest, any of them can be returned.
     * @param list an ArrayList of words
     * @return the longest word in the list or an empty String if the list is empty
     * Example: input: ["apple", "banana", "kiwi"] -> output: "banana"
     */
    public static String findLongestWord(List<String> list) {
        String longest = "";

        for (String word : list) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    /**
     * Counts how many words are longer than 5 characters in the keys of a Map.
     * @param map a Map of strings to integers
     * @return the count of words longer than 5 characters
     * Example: input: ["why"=7, "hello"=8, "brilliant"=99, "world"=15, "amazing"=17] -> output: 2
     */
    public static int countLongWords(Map<String, Integer> map) {
        int count = 0;
        for (String word : map.keySet()) {
            if (word.length() > 5) {
                count++;
            }
        }
        return count;
    }

    /**
     * Finds the average of the floats in an array.
     * @param arr an array of floats
     * @return the average of the values or 0 if the array is empty
     * Example: input: [1.5, 3.5, 2.0, 3.0] -> output: 2.5
     */
    public static double findAverage(float[] arr) {
        if (arr.length == 0) {
            return 0.0;
        }
        double sum = 0.0;
        for (float num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    /**
     * Counts how many odd numbers there are in the values of a Map.
     * @param map a HashMap of String keys and Integer values
     * @return the count of odd numbers in the values
     * Example: input: {"a"=7, "x"=4, "z"=5} -> output: 2
     */
    public static int countOddNumbers(Map<String, Integer> map) {
        int count = 0;

        for (int num : map.values()) {

             if (num % 2 != 0) {
                count++;
        }
           
            }
        return count;
    }

    /**
     * Returns true if all values are divisible by 3 in an array.
     * Also returns true if the array is empty.
     * @param arr an array of integers
     * @return true if all values are divisible by 3, false otherwise
     * Example: input: [3, 6, 9] -> output: true
     * Example 2: input: [3, 4, 6, 9] -> output: false
     */
    public static boolean allDivisibleBy3(int[] arr) {
        for (int num : arr) {
            if (num % 3 != 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns true if all words start with 'a' or 'A' in an List of Strings.
     * Returns true if the list is empty.
     * @param list a List of words
     * @return true if all words start with 'a', false otherwise
     * Example: input: ["apple", "Apricot", "avocado"] -> output: true
     * Example: input: ["apple", "banana", "avocado"] -> output: false
     */
    public static boolean allStartWithA(List<String> list) {
        for (String word : list) {
            if (word.isEmpty() || (word.charAt(0) != 'a' && word.charAt(0) != 'A')) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns whether all nodes in a linked list contain positive (greater than 0) values.
     * Returns true if the head is null.
     * @param head the head of the linked list.
     */
    public static boolean allPositive(ListNode head) {
        ListNode current = head;
        while (current != null) {
            if (current.data <= 0) {
                return false;

            }
            current = current.next;
        }
        return true;
    }

    /**
     * Returns the product of all values in a linked list or 1 if the head is null.
     * @param head the head of the linked list
     * @return the product of all values in a linked list or 1 if the head is null.
     * Example Input: 5 -> 3 -> 4
     * Example output: 60
     * Explanation: 5 * 3 * 4 = 60
     */
    public static int product(ListNode head) {
        int result = 1;
        ListNode current = head;
        
        while (current != null) {
            result *= current.data;
            current = current.next;
        }
        return result;
    }

    /**
     * CHALLENGE PROBLEM: take extra time for this problem if needed
     * 
     * Removes all nodes with values strictly less than 10 and returns the new head.
     * Returns null if the resulting list is empty.
     * 
     * @param head the original head of the linked list
     * @return the new head of the linked list
     * Example Input: 6 -> 99 -> 2 -> 33 -> 10 -> 4
     * Example output: 99 -> 33 -> 10
     * Explanation: 6, 2, and 4 are each strictly less than 10, so they are removed from the list
     */
    public static ListNode removeSmall(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode current = dummy;
        
        while (current.next != null) {
            if (current.next.data < 10) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return dummy.next;
    }

}