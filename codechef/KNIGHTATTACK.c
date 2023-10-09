#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

// Searching an element in array
int indexof(int[], int);

int main(void) 
{
	int t;
	scanf("%d", &t);
	while(t-- != 0) 
	{
	    int dx[8], dy[8], p1[8], p2[8];
        // p[3]= 34 43 12//
        // print(p+1)
	    int x, y, x1, y1, x2, y2;
	    scanf("%d %d", &x1, &y1);
	    scanf("%d %d", &x2, &y2);
	    for (int i = 0; i < 8; i++) {
	        x = x1 + dx[i];
	        y = y1 + dy[i];
	        if(x >= 0 && y >= 0)
	        {
	            p1++ = 10 * x + y;
	        }
            x = x2 + dx[i];
	        y = y2 + dy[i];
	        if(x >= 0 && y >= 0)
	        {
	            p2++ = 10 * x + y;
	        }
	    }

	}
	return 0;
}

int indexof(int[] a, int key)
{
    int l = sizeof(a)/sizeof(int);
    for(int i = 0; i < l; i++)

}