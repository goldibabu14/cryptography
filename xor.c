#include<stdio.h>
#include<string.h>
int main (){
    char c;
    char *str = "Hello world";
    printf("Original String: %s\n", str);
    int l = strlen(str);
    printf("Encrypted text :");
    for (int i = 0; i < l; i++)
    {
        c =str[i]^0;
        printf("%c -> %d\n" , c ,str[i]^0);

    }
}

                      // or
// #include<stdio.h>
// #include<string.h>
// #include<stdlib.h>
// int main (){
//     char c;
//     int key ;
//     char *str ;
//     str = (char *)malloc(100 * sizeof(char)); 
//      printf("Enter a string: ");
//     fgets(str, sizeof(str), stdin);   
//     str[strcspn(str, "\n")] = 0;       

//     printf("Enter key (number): ");
//     scanf("%d", &key);
//     printf("Original String: %s\n", str);
//     int l = strlen(str);
//     printf("Encrypted text :");
//     for (int i = 0; i < l; i++)
//     {
//         c =str[i]^key;
//         printf("%c -> %d\n" , c ,str[i]^0);

//     }
// }