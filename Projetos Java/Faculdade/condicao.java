import java.util.Scanner;
public class condicao {
    public static void main (String [] args) {
        Scanner teclado=new Scanner(System.in);
        
        System.out.println ("Qual a sua idade?");
        int idade=teclado.nextInt();
        //entrada via teclado
         //estrutura de decisão
        if (idade >= 18 && idade<64) {
            System.out.println ("Adulto: " + idade + " anos");
        }  else if (idade >= 12 && idade<18) {
            System.out.println ("Adolescente: " + idade + " anos");
        }  else if (idade >= 64) {
                System.out.println ("Idoso: " + idade + " anos");
        }    else {
            System.out.println ("Criança: " + idade + " anos");
        }  
                
        teclado.close();
    }
}
