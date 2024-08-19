package kodekraftcodechallenge;

import org.testng.Assert;
import org.testng.annotations.Test;
//package kodekraftcodechallenge;
import org.kodekraftcodechallenge.reverseArray;
import java.util.Arrays;

import static org.kodekraftcodechallenge.reverseArray.revArr;

public class revArrayTest {
    @Test
    public void testReverseArray() {
        int[] inputArr = new int[] {1, 2, 3, 4, 5};
        int[] expectedArr = new int[] {5, 4, 3, 2, 1};

        // Print the original array (for demonstration purposes)
        System.out.println("Original Array: " + Arrays.toString(inputArr));

        // Reverse the array
        revArr(inputArr);

        // Print the reversed array (for demonstration purposes)
        System.out.println("Reversed Array: " + Arrays.toString(inputArr));

        // Assert that the reversed array is as expected
        Assert.assertEquals(inputArr, expectedArr, "The array was not reversed correctly.");
    }

    // Big O(n) linear
   /*
    public static void revArr(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }
    }*/

}
