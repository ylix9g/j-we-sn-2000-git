import java.util.Arrays;

public class ApplicationMain {

    public static void main(String[] args) {
        System.out.println("Java Sort Application");

        int[] array = new int[]{5, -8, 9, 15};
        Sort sort = new InsertionSort();
        sort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
