#include<stdio.h>
int main()
{
    int num,row,col;
    scanf("%d",&num);
    for(row=1;row<=num;row++,printf("\n")){
        for(col=1;col<=num;col++){
            if(row==1||row==num||col==1||col==num)
            printf("*");
            else
            printf(" ");
        }
    }
}