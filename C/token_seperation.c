#include<stdio.h>
#include<ctype.h>

int isOperator(char ch){
    return (ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%');
}

int main(){
    char str[15];
    scanf("%s",str);
    for(int i=0;str[i];i++){
        if(isalpha(str[i])){
            printf("%c is a Identifier\n",str[i]);
        }
        else if(str[i]=='='){
            printf("%c is an Assignment operator\n",str[i]);
        }
        else if(isOperator(str[i])){
            printf("%c is an Arithmetic  Operator\n",str[i]);
        }
        else if(isdigit(str[i])){
            int start=i;
            while(isdigit(str[++i])){
                printf("%.s is a constant \n",i-start,&str[start]);
            }
        }
        else{
            printf("%c is a delimiter",str[i]);
        }
    }
    return 0;
}
