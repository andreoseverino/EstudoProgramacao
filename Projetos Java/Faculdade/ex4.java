import java.util.Scanner;
public class ex4 {
    public static void main (String[] args){
    Scanner teclado=new Scanner (System.in);
    
    System.out.println("Digite um número inteiro para A: ");
    int a=teclado.nextInt();
    System.out.println("Digite um número inteiro para B: ");
    int b=teclado.nextInt();    
     if (a>b){
            System.out.println("A difereça entre eles é de :"+ (a-b));
     } else if (b>a) {
         System.out.println("A diferença entre eles é de: "+ (b-a));         
     } else {
         System.out.println("A diferença entre eles é 0!!");
     }teclado.close();
    }
}