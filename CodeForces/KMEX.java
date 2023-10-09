/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class KMEX
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		/*  For input using Scanner
		    Scanner sc = new Scanner(System.in); 
		    int sc.nextInt(); 
		    String sc.nextLine(); 
		    sc.next().charAt(0);
		*/
		/*For input using BufferedReader
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    int = Integer.parseInt(br.readLine());
		    String stream[] = br.readLine().split(" ");
	    	*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- != 0)
		{
		    String[] stream;
		    int n,m,k;
		    stream = br.readLine().split(" ");
		    n = Integer.parseInt(stream[0]);
		    m = Integer.parseInt(stream[1]);
		    k = Integer.parseInt(stream[2]);
		    Arrays.fill(stream,null);
            stream = br.readLine().split(" ");
		    int[] a = new int[n];
		    int cnt = 0, cmin = 0;
		    for (int i = 0 ; i < n ; i++ ) {
		        a[i] = Integer.parseInt(stream[i]);
		        if(k==a[i]) cnt++;
		        if(a[i] == 0) cmin=1;
		    }
		    Arrays.sort(a);
		    int num = a[0],cm=1;
		    for (int i = 1 ;  i<n  ; i++ ) {
		        if(a[i] == num )
		        {
		              continue;
		        }
		        else {
		            num = a[i];
		            if(a[i] < k) {
		                cm++;
		            }
		        }
		    }
		    if(k==0){
		        if(cmin==0){
		            cmin=1;
		        }
		        cm=0;
		    }
		    if(cm<=m && cnt <=n-m && k==cm && cmin!=0)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
            System.out.println("cm "+cm);
            System.out.println("cmin "+cmin);
            System.out.println("cnt "+cnt);
            System.out.println("k "+k);
		}
	}
}
