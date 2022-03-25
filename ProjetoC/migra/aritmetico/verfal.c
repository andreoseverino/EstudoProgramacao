#include <cs50.h>
#include <stdio.h>

int main(void)
{
     printf ("Você é hetero. \n");
     // Solicita um caracter para o usuário
     char c = get_char("Você concorda com essa afirmação?");

     // Verifica se concordou
     if (c == 'S' || c == 's')
     {
         printf("Concordo.\n");
     }
     else if (c == 'N' || c == 'n')
     {
        printf("Não concordo. \n");
     }
}