package licoes;

import java.time.LocalDate;
import java.util.Scanner;

public class aniversario {
   public static void main(String[] args, int now) {

      Scanner sc = new Scanner(System.in);

      LocalDate data = LocalDate.now(); 
      int mes = data.getMonthValue();
      int dia = data.getDayOfMonth();

      System.out.println("dia de hoje: " + data);
      System.out.println("qual o dia do seu aniversario: ");
      int d = sc.nextInt();
      System.out.println("qual o mes do seu aniversario: ");
      int m = sc.nextInt();

      if(d == dia && m == mes){
         System.out.println("parabens");
      } if(d == 15
      
       && m == mes){
         System.out.println("parabens");
      }


    
   } 
}
