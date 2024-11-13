package licoes;

import java.util.Random;
import java.util.Scanner;

public class leitorDeMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
    Random a = new Random();
    double g = 10;
      int f= 10;
      int numero1 = a.nextInt(10);
      int numero = a.nextInt(10);
   
      


      for(int i = 0; i<g ; i++){
        System.out.println(a.nextInt(10)+1);
      
       
        
        

        if(numero>g){
            numero=(int)g;
          
        }else{
           
            if(f>numero1){
            numero1 = f;
           
            }

        }
        

        }
        System.out.println("menor numero: " +numero1);
        System.out.println("esse é o numero maior: " + numero);


      }
     

    }

