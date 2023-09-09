//#include<stdio.h>
int main()
{
    int num=123,power,nod;
    //scanf("%d",&num);
    for(nod=0,power=1;num/power;nod++,power*=10);
    printf("%d",nod);
    return 0;
}
