/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CONCATSORT
{
    static boolean isSorted(ArrayList<Integer> arr, int n)
    {
        if (n == 1 || n == 0)
            return true;
 
        if (arr.get(n - 1) < arr.get(n - 2))
            return false;

        return isSorted(arr, n - 1);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- != 0)
		{
		    int n = Integer.parseInt(br.readLine());
		    ArrayList<Integer> A = new ArrayList<Integer>();
		    ArrayList<Integer> B = new ArrayList<Integer>();
		    ArrayList<Integer> Q = new ArrayList<Integer>();
		    ArrayList<Integer> P = new ArrayList<Integer>();
		    String[] stream = br.readLine().split(" ");
		    
		    /*
		    Loop for taking input the arraylist A's elements.
		    and store copy of the A in arraylist A and Q.
		    */
		    for(int i = 0; i < n; i++)
		    {
		        A.add(Integer.parseInt(stream[i]));
		        B.add(A.get(i));
		        Q.add(A.get(i));
		    }
			// To store the sorted array.
		    Collections.sort(B);
			System.out.println("WORKING");
            System.out.println("i\tj\tk\tA[i]\tB[j]\tA[i]==B[j]");
		    for(int i = 0, j = 0, k = 0; i < stream.length; i++,k++ )
		    {
                boolean cond = false;
                System.out.print(i+"\t"+j+"\t"+k+"\t"+A.get(i) + "\t"+ B.get(j)+"\t");
                int ai = A.get(i);
                int bj = B.get(j);
		        if(ai == bj)
		        {
                    cond = true;
		            P.add(B.get(j++));
		            Q.remove(k--);
		        }
                System.out.println(cond);
		    }
			System.out.println("OUTPUT "+"\033[0;m"+"OUTPUT:"+"\033[0;m");
            if(n == 2 || (isSorted(P, P.size()) && isSorted(Q, Q.size())))
		    System.out.println("YES");
		    else
		    System.out.println("NO");
            
            System.out.println("\n");
		    System.out.println("A -> " + A);
            System.out.println("B -> " + B);
            System.out.print("P -> " + P);System.out.println("\t"+isSorted(P, P.size())+">"); 
            System.out.print("Q -> " + Q);System.out.println("\t"+isSorted(Q, Q.size())+">");
            P.addAll(Q);
            System.out.println("\nP concat Q -> "+P + "\n");
		}
		br.close();
	}
}

// 310 32 313 306 977 310
// ArrayList is array of objects and it checks the address of the element when == operator is ussed as
// in the above program I used == and when 2nd 310 in B was compared to 2nd 310 of A then it was giving 
// false output.