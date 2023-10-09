/*
 * @author: Amaan Lari
 * @version: START47
 */
import java.io.*;
class CodeChef
{
	public static void main (String[

	] args)throws Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
		int a,b,c,d,k,dist;
		while(t-- != 0)
		{
			String[] s = br.readLine().split(" ");
		    a = Integer.parseInt(s[0]);
		    b = Integer.parseInt(s[1]);
		    c = Integer.parseInt(s[2]);
		    d = Integer.parseInt(s[3]);
		    k = Integer.parseInt(s[4]);
		    dist = Math.abs(a-c) + Math.abs(b-d);
		    if(k >= dist && (k-dist)%2 == 0)
		    System.out.println("Yes");
		    else
		    System.out.println("No");
		}
	}
}
