import java.util.*;
public class As {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]==arr[j]&&i!=j){
                    System.out.println("Duplicate element :-  "+arr[i]);
                    return;
                }
            }

        }
        int[]a=new int[n];
        int lnz=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                int temp=arr[lnz];
                arr[lnz]=arr[i];
                arr[i]=temp;
                lnz++;
            }

        }
    }
}
