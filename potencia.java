package licoes;

import java.util.Scanner;

public class potencia {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
    System.out.print("digite um valor: ");
    double a = sc.nextDouble();
for(double i = 0; i<=15; i++){
    double r = Math.pow(a,i);
    System.out.println(r);


}






    }
}
