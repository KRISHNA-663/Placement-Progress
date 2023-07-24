#include<stdio.h>
int main()
{
    int num,row,col;
    scanf("%d",&num);
    for(row=1;row<=num;row++,printf("\n")){
        for(col=1;col<=row;col++){
            printf("*");
        }
    }
    for(row=num;row>0;row--,printf("\n")){
        for(col=1;col<=row;col++){
            printf("*");
        }
    }
}