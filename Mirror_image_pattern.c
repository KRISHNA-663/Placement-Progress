#include<stdio.h>
int main()
{
    int num,row,col;
    scanf("%d",&num);
    for(row=1;row<=num;row++,printf("\n")){
      for(col=1;col<=num-row;col++){
        printf(" ");
      }
      for(col=1;col<=row;col++){
        printf("*");
      }
}
}