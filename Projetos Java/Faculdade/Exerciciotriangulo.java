import java.util.Scanner;
public class Exerciciotriangulo {
    public static void main(String[] args) {
    Scanner teclado=new Scanner (System.in);
    System.out.println("Informar as medidas do triângulo");
    
    float a=teclado.nextFloat();    
    float b=teclado.nextFloat();    
    float c=teclado.nextFloat();    
    if (a>0 && b>0 && c>0){
        if(a+b>c && a+c>b && b+c>a){
            if(a==b && b==c){
                System.out.println("Triângulo equilátero");
            }else if (a==b || a==c || c==b){
                System.out.println("Triângulo Isóceles");
            }else{
            System.out.println("Escaleno");
        }
        }else{
            System.out.println("Não forma triângulo");
        }
    }else {
        System.out.println("Medidas inválidas!!");
    }teclado.close();
    }
}
