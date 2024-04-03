import java.util.Arrays;

public class ApplicationMain {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Java Sort Application");
        }
        int[] array = new int[]{5, -8, 9, 15};
        Sort sort = new InsertionSort();
        sort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
