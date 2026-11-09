import java.util.List;
import java.util.Map;

public class MidtermPractice {

    public static String findLongestWord(List<String> list) {
        String longest = "";
        int i = 0;

        while (i < list.size()) {
            String word = list.get(i);

            if (word.length() > longest.length()) {
                longest = word;
            }

            i++;
        }

        return longest;
    }

    public static int countLongWords(Map<String, Integer> map) {
        int count = 0;

        for (String word : map.keySet()) {
            if (word.length() > 5) {
                count++;
            }
        }

        return count;
    }

    public static double findAverage(float[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        double sum = 0;
        int i = 0;

        while (i < arr.length) {
            sum += arr[i];
            i++;
        }

        return sum / arr.length;
    }

    public static int countOddNumbers(Map<String, Integer> map) {
        int count = 0;

        for (int number : map.values()) {
            if (number % 2 != 0) {
                count++;
            }
        }

        return count;
    }

    public static boolean allDivisibleBy3(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            if (arr[i] % 3 != 0) {
                return false;
            }

            i++;
        }

        return true;
    }

    public static boolean allStartWithA(List<String> list) {
        int i = 0;

        while (i < list.size()) {
            String word = list.get(i);

            if (!word.startsWith("a") && !word.startsWith("A")) {
                return false;
            }

            i++;
        }

        return true;
    }

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

    public static int product(ListNode head) {
        int total = 1;
        ListNode current = head;

        while (current != null) {
            total *= current.data;
            current = current.next;
        }

        return total;
    }

    public static ListNode removeSmall(ListNode head) {
        // Remove small values at the beginning.
        while (head != null && head.data < 10) {
            head = head.next;
        }

        ListNode current = head;

        // Check the node after current.
        while (current != null && current.next != null) {
            if (current.next.data < 10) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}