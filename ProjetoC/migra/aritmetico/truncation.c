#include <cs50.h>
#include <stdio.h>

int main (void)
{
     // Pega os números do usuário
     long x = get_int("x: ");
     long y = get_int("y: ");

     // Divide x por y
     float z = (float) x / (float) y;
     printf("%li\n", x / y);
}