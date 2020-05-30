#include <stdio.h>
int main()
{
   int x, y, *a, *b, temp;

   
   scanf("%d%d", &x, &y);

   printf("Before swapping a= %d ""and"" b=%d\n", x, y);
   
   a = &x;
   b = &y;
   
   temp = *b;
   *b   = *a;
   *a   = temp;

   printf("After swapping a= %d ""and" " b=%d\n", x, y);
   
   return 0;
}