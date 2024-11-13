package licoes;

import java.util.Scanner;

public class leitorDenumeros {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("digite o numero que voce quer q conte: ");
        int contP = 0;
        int contI= 0;

        int numeroLido = sc.nextInt();
        
        for(int i = 0;i<=numeroLido;i++){
            System.out.print(i);
            
            if (i%2==0){
                System.out.println(" par");
               
               contP++;
               

               
            }else{
              
                contI++;
                System.out.println(" impar");
            }
       
        
    }
    System.out.println("par: " + contP);
    System.out.println("impar: " + contI);
}
}
        
     
      
        
        
        









    

