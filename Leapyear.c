#include<stdio.h>
int main(){
    long long int year;
    scanf("%lld",&year);
    if(year%4==0 && year%100!=0 || year%400==0)
    printf("Leap year");
    else
    printf("Not a leap year");
    return 0;
}