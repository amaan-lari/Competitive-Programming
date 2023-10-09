/* package codechef; // don't place package name! */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
 * Codechef problem code : START45
 * Codechef problem code : ARRAYRET
 */
class ARRAYRET
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		/*For input using Scanner
		  Scanner sc = new Scanner(System.in); 
		  int sc.nextInt(); 
		  String sc.nextLine(); 
		  sc.next().charAt(0);*/
		/*For input using BufferedReader
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  int = Integer.parseInt(br.readLine());
		  String stream[] = br.readLine().split(" ");*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-- != 0)
		{
			int n,Sn=0,sum=0;
			List<Integer> a = new ArrayList<Integer>();
			List<Integer> b = new ArrayList<Integer>();
		    n = Integer.parseInt(br.readLine());
			String[] stream = br.readLine().split(" ");
			for (int i = 0; i < stream.length; i++) {
				int num = Integer.parseInt(stream[i]);
				b.add(num);
				Sn = Sn + num;
			}
			sum = Sn/(n+1);
			for (int i = 0; i < b.size(); i++) {
				a.add(b.get(i)-sum);
				System.out.print(a.get(i)+" ");
			}
			System.out.println();
		}
	}
}