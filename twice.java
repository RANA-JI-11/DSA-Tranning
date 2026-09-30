import java.util.*;

public class twice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = 0;

        for (int num : arr) {
            ans = ans ^ num;
        }

        System.out.println(ans);
    }
}
