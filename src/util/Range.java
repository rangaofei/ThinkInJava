package util;

public class Range {

    public static int[] range(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i;
        }
        return result;
    }

    public static int[] range(int start, int end) {
        int[] result = new int[end - start];
        for (int i = start; i < end; i++) {
            result[i] = start;
        }
        return result;
    }
}
