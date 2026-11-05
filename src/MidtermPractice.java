import java.util.List;
import java.util.Map;

public class MidtermPractice {
    /**
     * Finds the longest word in an List of Strings.
     * If there are multiple words tied for longest, any of them can be returned.
     * @param list an ArrayList of words
     * @return the longest word in the list or an empty String if the list is empty
     * Example: input: ["apple", "banana", "kiwi"] -> output: "banana"
     * 
     * TIME LEFT: 4:01
     * TIME COMPLEXITY: O(n), n = list.size()
     */
    public static String findLongestWord(List<String> list) {
        String longestWord = "";
        for (String word : list) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    /**
     * Counts how many words are longer than 5 characters in the keys of a Map.
     * @param map a Map of strings to integers
     * @return the count of words longer than 5 characters
     * Example: input: ["why"=7, "hello"=8, "brilliant"=99, "world"=15, "amazing"=17] -> output: 2
     * 
     * TIME LEFT: 4:13
     * TIME COMPLEXITY: O(a * b), a = number of keys, b = length of characters
     */
    public static int countLongWords(Map<String, Integer> map) {
        int longWords = 0;

        for (String word : map.keySet()) {
            char[] characters = word.toCharArray();
            
            int charCount = 0;
            for (int i = 0; i < characters.length; i++) {
                charCount++;    
            }

            if (charCount > 5) {
                longWords++;
            }
        }

        return longWords;
    }

    /**
     * Finds the average of the floats in an array.
     * @param arr an array of floats
     * @return the average of the values or 0 if the array is empty
     * Example: input: [1.5, 3.5, 2.0, 3.0] -> output: 2.5
     * 
     * TIME LEFT: RAN OUT OF TIME
     * TIME COMPLEXITY: O(n) n = arr.length
     * 
     * NOTE: Couldn't make last test case pass for empty array.
     * FIX: Changed first if statement to check if arr.length == 0 instead of arr == null
     */
    public static double findAverage(float[] arr) {
        if (arr.length == 0) {
            return 0.0;
        }

        int doubleCount = 0;
        double sum = 0.0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            doubleCount++;
        }

        double average = 1.0 * sum / doubleCount;

        return average;
    }

    /**
     * Counts how many odd numbers there are in the values of a Map.
     * @param map a HashMap of String keys and Integer values
     * @return the count of odd numbers in the values
     * Example: input: {"a"=7, "x"=4, "z"=5} -> output: 2
     * 
     * TIME LEFT: 7:17
     * TIME COMPLEXITY: O(n), n = map.values()
     */
    public static int countOddNumbers(Map<String, Integer> map) {
        int oddNumberCount = 0;

        for (int number : map.values()) {
            if (number % 2 != 0) {
                oddNumberCount++;
            }
        }

        return oddNumberCount;
    }

    /**
     * Returns true if all values are divisible by 3 in an array.
     * Also returns true if the array is empty.
     * @param arr an array of integers
     * @return true if all values are divisible by 3, false otherwise
     * Example: input: [3, 6, 9] -> output: true
     * Example 2: input: [3, 4, 6, 9] -> output: false
     * 
     * TIME LEFT: 8:32
     * TIME COMPLEXITY: O(n), n = arr.length
     */
    public static boolean allDivisibleBy3(int[] arr) {
        if (arr.length == 0) {
            return true;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 != 0) {
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
     * 
     * TIME LEFT: 5:05
     * TIME COMPLEXITY: O(n), n = list.size()
     */
    public static boolean allStartWithA(List<String> list) {
        if (list.isEmpty()) {
            return true;
        }

        for (String word : list) {
            String wordLowerCase = word.toLowerCase();
            char[] chars = wordLowerCase.toCharArray();

            if (chars[0] != 'a') {
                return false;
            }
        }

        return true;
    }

    /**
     * Returns whether all nodes in a linked list contain positive (greater than 0) values.
     * Returns true if the head is null.
     * @param head the head of the linked list.
     * 
     * TIME LEFT: 7:30
     * TIME COMPLEXITY: O(n), n = the length of the LinkedList
     */
    public static boolean allPositive(ListNode head) {
        if (head == null) {
            return true;
        }

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
     * 
     * TIME LEFT: 8:03
     * TIME COMPLEXITY: O(n), n = the length of the LinkedList
     */
    public static int product(ListNode head) {
        if (head == null) {
            return 1;
        }

        ListNode current = head;

        int product = 1;
        while (current != null) {
            product *= current.data;
            current = current.next;
        }

        return product;
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
     * 
     * TIME TAKEN: approx. a little under an hour
     * TIME COMPLEXITY: O(n), n = the length of the LinkedList
     */
    public static ListNode removeSmall(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode current = head;

        boolean hasFoundNewHead = false;
        while (!hasFoundNewHead) {
            if (current.data < 10) {
                if (head.next != null) {
                    head = head.next;
                    current = head;
                } else {
                    return null;
                }
            } else {
                hasFoundNewHead = true;
                current = current.next;
            }
        }

        current = head;
        while (current != null) {
            if (current.next == null) {
                break;
            }

            if (current.next.data < 10) {
                current.next = current.next.next;
            }

            current = current.next;
        }

        current = head;

        return current;
    }
}