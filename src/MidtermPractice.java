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
        if (list.size() == 0)
        {
            return "";
        }
        int topSize = 0;
        String topWord = "";
        for (int i = 0; i < list.size(); i++)
        {
            String wordSizeCheck = list.get(i);
            if (wordSizeCheck.length() > topSize)
            {
                topSize = wordSizeCheck.length();
                topWord = wordSizeCheck;
            }
            
        }
        return topWord;
        // Passed with 3:52 left
    }

    /**
     * Counts how many words are longer than 5 characters in the keys of a Map.
     * @param map a Map of strings to integers
     * @return the count of words longer than 5 characters
     * Example: input: ["why"=7, "hello"=8, "brilliant"=99, "world"=15, "amazing"=17] -> output: 2
     */
    public static int countLongWords(Map<String, Integer> map) {
        int count = 0;
        for (Map.Entry<String, Integer> currentMap : map.entrySet())
        {
            String currentWord = currentMap.getKey();
            if (currentWord.length() > 5)
            {
                count++;
            }
        }
        return count;
    }
    // Forgot how to iterate over a map. Once I found the general for loop for maps, it is straightforward. Just have to remember the syntax.

    /**
     * Finds the average of the floats in an array.
     * @param arr an array of floats
     * @return the average of the values or 0 if the array is empty
     * Example: input: [1.5, 3.5, 2.0, 3.0] -> output: 2.5
     */
    public static double findAverage(float[] arr) {
        if (arr.length == 0)
            return 0.0;
        double total = 0.0;
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++)
        {
            double currentNum = arr[i];
            sum += currentNum;
            total++;
        }
        return sum / total;
    }
    // Finished with 5:17 left. No issues.

    /**
     * Counts how many odd numbers there are in the values of a Map.
     * @param map a HashMap of String keys and Integer values
     * @return the count of odd numbers in the values
     * Example: input: {"a"=7, "x"=4, "z"=5} -> output: 2
     */
    public static int countOddNumbers(Map<String, Integer> map) {
        int count = 0;
        for (Map.Entry<String, Integer> currentMap : map.entrySet())
        {
            int currentNum = currentMap.getValue();
            if(currentNum % 2 != 0)
            {
                count++;
            }
        }
        return count;
    }
    // Finished with 6:31 left. accidently did currentNum % 0 which was throwing errors but quickly fixed it.

    /**
     * Returns true if all values are divisible by 3 in an array.
     * Also returns true if the array is empty.
     * @param arr an array of integers
     * @return true if all values are divisible by 3, false otherwise
     * Example: input: [3, 6, 9] -> output: true
     * Example 2: input: [3, 4, 6, 9] -> output: false
     */
    public static boolean allDivisibleBy3(int[] arr) {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 3 != 0)
            {
                return false;
            }
        }
        return true;
    }
    // Finished with 8:49 remaining. EZ PZ.

    /**
     * Returns true if all words start with 'a' or 'A' in an List of Strings.
     * Returns true if the list is empty.
     * @param list a List of words
     * @return true if all words start with 'a', false otherwise
     * Example: input: ["apple", "Apricot", "avocado"] -> output: true
     * Example: input: ["apple", "banana", "avocado"] -> output: false
     */
    public static boolean allStartWithA(List<String> list) {
        for (int i = 0; i < list.size(); i ++)
        {
            String check = list.get(i).toLowerCase();
            char firstLetter = check.charAt(0);
            if(firstLetter != 'a')
            {
                return false;
            }
        }
        return true;
    }

    // Finished with 5:53 left. I tried to put to lowerCase in char instead of string. Swapped it and tests good.

    /**
     * Returns whether all nodes in a linked list contain positive (greater than 0) values.
     * Returns true if the head is null.
     * @param head the head of the linked list.
     */
    public static boolean allPositive(ListNode head) {
        if (head == null)
        {
            return true;
        }
        while (head != null)
        {
            if (head.data  < 0 || head.data == 0)
            {
                return false;
            }
            head = head.next;
        }
        return true;
    }

    // Finished with 8:32 left.

    /**
     * Returns the product of all values in a linked list or 1 if the head is null.
     * @param head the head of the linked list
     * @return the product of all values in a linked list or 1 if the head is null.
     * Example Input: 5 -> 3 -> 4
     * Example output: 60
     * Explanation: 5 * 3 * 4 = 60
     */
    public static int product(ListNode head) {
        int product = 1;
        if (head == null)
        {
            return 1;
        }
        while (head != null)
        {
            product = product * head.data;
            head = head.next;
        }
        return product;
    }

    // Finished with 7:49 left.

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
        if (head == null)
        {
            return null;
        }
        ListNode current = head;
        while (current.data < 10)
        {
            current = head.next;
            head = current;
            if (head == null)
            {
                return null;
            }
        }
        while (current.next != null)
        {
            if (current.next.data < 10)
            {
                current.next = current.next.next;
            }
            else
            {
                current = current.next;
            }
        }
        return head;
    }

}