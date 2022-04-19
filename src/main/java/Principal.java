/*Creamos un array de 10 elementos
Lo rellenamos pidiendo números al US
El resultado es que me indique cuántas veces ha introducido los números
*/


import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        /**************DECLARACIÓN*************/
        int arrayUs[] = new int[10];
        int arrayOrdenado[] = new int[10];
        Scanner sc = new Scanner(System.in);
        int numUs = 0, i = 0;

        /*************PETICIÓN DATOS***************/
        System.out.println("Dime un número: ");
        for (i = 0; i < 10; i++) {
            arrayUs[i] = sc.nextInt();
        }

        Arrays.sort(arrayUs);

        /*************REPETICIONES***************/
        int num = 0, cont = 1, j = 0, aux=0;

        for (i = 0; i < 10; i++) {
            System.out.println(arrayUs[i]);
            if(arrayUs[i]==arrayUs[i+1]) {
                cont++;
            }
            else {
                System.out.println(arrayUs[i] + " - " + cont);
                cont=0;
            }
        }


        }
        /************ELIMINAR DUPLICADOS**********/

    } }




