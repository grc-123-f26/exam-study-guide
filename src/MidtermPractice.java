
import java.util.List;
import java.util.Map;

public class MidtermPractice {

    public static String findLongestWord(List<String> list) {
        String longest = "";

        for (String word : list) {
            if (word.length() > longest.length()) {
                longest = word;
            }
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

        float sum = 0;

        for (float num : arr) {
            sum += num;
        }

        return sum / arr.length;
    }

    public static int countOddNumbers(Map<String, Integer> map) {
        int count = 0;

        for (int num : map.values()) {
            if (num % 2 != 0) {
                count++;
            }
        }

        return count;
    }

    public static boolean allDivisibleBy3(int[] arr) {
        for (int num : arr) {
            if (num % 3 != 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean allStartWithA(List<String> list) {
        for (String word : list) {
            if (!word.toLowerCase().startsWith("a")) {
                return false;
            }
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
        int product = 1;
        ListNode current = head;

        while (current != null) {
            product *= current.data;
            current = current.next;
        }

        return product;
    }

    public static ListNode removeSmall(ListNode head) {
        while (head != null && head.data < 10) {
            head = head.next;
        }

        ListNode current = head;

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
