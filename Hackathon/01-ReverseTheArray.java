import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        StringBuilder output = new StringBuilder();

        for (int i = n - 1; i >= 0; i--) {
            output.append(arr[i]);
            if (i > 0) {
                output.append(" ");
            }
        }

        System.out.println(output.toString());
    }
}