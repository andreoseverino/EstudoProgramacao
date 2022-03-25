import java.util.Scanner;

public class ex5 {
    public static void main (String[] args) {
    Scanner teclado=new Scanner (System.in);
        System.out.println("Qual a sua idade? ");
    int idade = teclado.nextInt();
    if (idade>=18 && idade<=63){
        System.out.println("Você é maior de idade");
    } else if (idade<18){ 
        System.out.println("Você é menor de idade");
    }
    else {
        System.out.println("Você é idoso");
    }
    teclado.close(); 
}
}
