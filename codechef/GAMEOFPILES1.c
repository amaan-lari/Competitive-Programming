#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

int main(void) 
{
	int t;
	scanf("%d", &t);
	while(t-- != 0) 
	{
	    int n;
	    scanf("%d", &n);
	    int a[n];
	    int min = ;
        for (int i = 0; i < n; i++) 
	    {
	        scanf("%d", &a[i]);
            if(a[i] < min)
            {
                min = a[i];
            }
	    }
	    
        // int cnt = 0, i = 0;
	    // while(1)
	    // {
        //     a[i]--;
        //     cnt++;
        //     if(a[i] == 0)
        //     {
        //         break;
        //     }
        //     i++;
        //     if(i == n-1)
        //     {
        //         i = 0;
        //     }
	    // }
	    if(min % 2 == 0)
	    {
	        printf("CHEFINA\n");
	    }
	    else
	    {
	        printf("CHEF\n");
	    }
	}
	return 0;
}

