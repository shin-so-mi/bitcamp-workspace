      #include <stdio.h>
      #include <stdlib.h>
      
      
      int main() {
 
      
      int* p;
         
        // p = &i[0];
         p = i;
      printf("%d\n",*(p + 2));
      
      
      
   int* p2 = (int*)malloc(sizeof(int) * 3);
      
       *p2 = 110;
       *(p2 + 1) = 220;
       *(p2 + 2) = 330;
       printf("%d, %d, %d\n", *p2, *(p2 + 1), *(p2 + 2));
        printf("%d, %d, %d\n", p2[0], p2[1], p2[2]);
       
       
       
       
       free(p2);
       
        printf("%d, %d, %d\n", *p2, *(p2 + 1), *(p2 + 2));
         return 0;
    }
          
