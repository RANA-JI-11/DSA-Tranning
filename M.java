import java.util.*;
public class M{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int w=sc.nextInt();
        int i=1;
        int total=0;
        while(i<=w){
            total=total+(i*k);
            i++;
        }
        if(total>n){
            System.out.println(total-n);
        }else{
            System.out.println(0);
        }
    }
}