import java.util.*;
import java.lang.*;
import java.io.*;

class Exerciserest
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
        int rest = 0;
        int days = 0;

        for (int i = 1; rest < N; i++) {
            days++;

            if (i % 3 == 0) {
                rest++;
            }
        }

        System.out.println(days);
 }
}
    

