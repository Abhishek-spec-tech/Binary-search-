import java.util.Arrays;
import java.util.Scanner;

public class BookFinder {

    // Binary search method
    public static int binarySearch(int[] books, int target) {
        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (books[mid] == target) {
                return mid; // found at index mid
            } else if (books[mid] < target) {
                left = mid + 1; // search in right half
            } else {
                right = mid - 1; // search in left half
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sample sorted book IDs
        int[] bookIDs = {101, 203, 304, 405, 506, 607, 708, 809};

        System.out.println("Available Book IDs: " + Arrays.toString(bookIDs));
        System.out.print("Enter Book ID to search: ");
        int targetID = sc.nextInt();

        int index = binarySearch(bookIDs, targetID);

        if (index != -1) {
            System.out.println("Book with ID " + targetID + " found at index " + index + ".");
        } else {
            System.out.println("Book with ID " + targetID + " not found.");
        }

        sc.close();
    }
}
