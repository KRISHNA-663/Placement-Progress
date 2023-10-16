#include<stdio.h>
#include<stdlib.h>

int main(){
    int n,rot;
    scanf("%d%d",&n,&rot);
    if(rot>n){
        rot=rot%n;
    }
    int c=0;
    int *arr=malloc(sizeof(int)*n);
    int *arr1=malloc(sizeof(int)*n);
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    for(int i=rot;i<n;i++){
        arr1[c]=arr[i];
        c++;
    }
    for(int i=0;i<rot;i++){
        arr1[c]=arr[i];
        c++;
    }
    for(int i=0;i<n;i++){
        printf("%d ",arr1[i]);
    }
}
