/*Creamos un array de 10 elementos
Lo rellenamos pidiendo números al US
El resultado es que me indique cuántas veces ha introducido los números
*/


import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int arrayUs [] = new int [10];
        Scanner sc = new Scanner(System.in);
        int numUs = 0, i=0;

        System.out.println("Dime un número: ");
        for(i=0;i<10;i++) {
            arrayUs[i]= sc.nextInt();
        }

        for(i=0;i<10;i++) {
            System.out.print(arrayUs[i]+",");
        }

        int num=0,cont=0;
        for(i=0;i<10;i++){
            num=arrayUs[i];
            for (i=0;i<10;i++) {
                if(num==arrayUs[i])
                    cont++;
            }
            System.out.print("prueba");
            System.out.print(arrayUs[i]+" - "+cont);
        }

    }
}
