import java.util.*;
public class Array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i <n ; i++) {
             arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
       System.out.println(arr.length);
        int count=0;
        for (int j = 0; j < n; j++) {
        count++;
        }
        System.out.println("Length :- "+count);
        System.out.print("Enter element to search: ");
        int search = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == search) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found haaaa haaaa haaa ullu");
        }
        int max =Arrays.stream(arr).max().getAsInt();
        System.out.println("Maximum :- "+max);
       int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j <arr.length ; j++) {
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
        System.out.println("Second Max:-"+arr[arr.length -2]);
    }
}

