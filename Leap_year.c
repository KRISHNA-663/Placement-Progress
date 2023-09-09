#include<stdio.h>
int main()
{
    int num=400;
    if(num%4==0 && num%100!=0 || num%400==0)
        printf("Leap year");
    else
        printf("Not leap year");
    return 0;
}
