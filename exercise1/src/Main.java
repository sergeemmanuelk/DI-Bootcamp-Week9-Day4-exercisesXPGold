import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 36, 9, 8};

        // Using stream and forEach() method to traverse array elements
        Arrays.stream(arr).forEach(item -> System.out.println(item));

    }
}