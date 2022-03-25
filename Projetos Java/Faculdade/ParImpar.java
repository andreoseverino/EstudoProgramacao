import java.util.Scanner;
public class ParImpar {
    public static void main (String [] args) {
        Scanner teclado=new Scanner (System.in);
        System.out.println ("Digite um numero inteiro");
        int n=teclado.nextInt();
        int resto=n%2;
        if (resto==0) {
         System.out.println ("Par");
       }else {
         System.out.println ("Ímpar");
    }
           
        teclado.close();
    }
}
