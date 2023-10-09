import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class BURGERS2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		/*
		Input space-separated values.
		String[] stream = br.readLine().split(" ");
		*/
		BufferedReader br = new BufferedReader
		(new InputStreamReader(System.in));

        Scanner sc = new Scanner(System.in);

        System.out.println("INPUT");
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0)
        {
            // Taking input.
            int x, y, n, r;
            String[] stream = br.readLine().split(" ");
            x = Integer.parseInt(stream[0]);
            y = Integer.parseInt(stream[1]);
            n = Integer.parseInt(stream[2]);
            r = Integer.parseInt(stream[3]);

            int a = r / x;
            int b = r / y;
            
            b = (r - n*x)/(y-x);
            a = n - b;
            
            if (b < 0)
            {    
                System.out.println(-1);
            }
            
            else if (b >= n)
            {
                a = 0;
                b = n;
                System.out.println(a + " "+ b);
            }
                
            else
            {
                System.out.println(a + " " + b);
            }
        }
	}

}

