import java.util.Scanner;
public class ex6 {
    public static void main (String[] arg){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite um número inteiro: ");
        int a = teclado.nextInt();
        int resto = a%2;
        if (resto ==0){
            System.out.println("Par");
        } else{
            System.out.println("Ímpar");
        }teclado.close();
    }
    
}
