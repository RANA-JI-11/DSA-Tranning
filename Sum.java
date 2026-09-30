import java.util.*;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {20, 13, 45, 67, 43, 1};
        System.out.println("entre the num(target sum):\n");
        int X = sc.nextInt();
        int i = 0, j = arr.length - 1;
        boolean found = false;
        while (i < 1) {
            int sum = arr[i] + arr[j];
            if (sum == X) {
                System.out.println("pair found:" + arr[i] + "+" + arr[j] + "=" + X);
                found = true;
                break;
            } else if (sum > X) {
                j--;
            } else {
                i++;
            }
        }
        if (!found) {
            System.out.println("No pair found with sum" + X);
        }
        sc.close();
    }
}