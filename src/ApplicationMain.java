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

        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();

        System.out.println("Change #1");
        System.out.println("Change #2");
    }
}
