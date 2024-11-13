package licoes;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        



Scanner sc = new Scanner(System.in);
System.out.print("digite a quandtidade de valores que deseja, para a sequência: ");
int qntd = sc.nextInt();

int n1 = 0;
int n2 = 1;
System.err.println(0);
System.out.println(1);
// int n3 = 1;
qntd = qntd - 2;
while(qntd>0){
    int n4 = n1+n2;
    System.out.println(n4);
    n1=n2;
    n2=n4;
    qntd--;
}










    }
}
