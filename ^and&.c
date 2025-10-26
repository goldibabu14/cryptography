#include<stdio.h>
#include<string.h>
int main (){
    char c;
    char *str = "Hello world";
    printf("Original String: %s\n", str);
    int l = strlen(str);
    printf("XOR with 127 :\n");
    for (int i = 0; i < l; i++)
    {
       
        printf("%c " , str[i]^127 );

    }
    printf("\n");
    printf("XOR with 127 (ASCII) :\n");
     for (int i = 0; i < l; i++)
    {
        printf("%d " , str[i]^127);

    }
    printf("\n");

    printf("\n");
    printf("AND with 127 :\n");
        for (int i = 0; i < l; i++)
        {
        
            printf("%c " , str[i]&127 );
    
        }
     
}