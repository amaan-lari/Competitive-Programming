/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SUMOFPROD1
{
    // FastReader for taking input.
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
  
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
  
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
  
        int nextInt() { return Integer.parseInt(next()); }
  
        long nextLong() { return Long.parseLong(next()); }
  
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
  
        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		
		/*
		Input space-separated values.
		String[] stream = br.readLine().split(" ");
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		*/
		
		BufferedReader br = new BufferedReader
		(new InputStreamReader(System.in));
        
        FastReader fr = new FastReader();
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0)
        {
            int n = fr.nextInt();
            String a = "";
            for (int i = 0; i < n; i++)
            {
                int A = fr.nextInt();
                a = a + A;
            }
            int sum = 0;
            for (int i = 0; i < n; i++)
            {
                for (int j = i; j < n; j++)
                {
                    if(a.substring(i,j+1).indexOf('0')==-1)
                    {
                        sum = sum + 1;
                    }
                }
            }        
        }
	}
}
