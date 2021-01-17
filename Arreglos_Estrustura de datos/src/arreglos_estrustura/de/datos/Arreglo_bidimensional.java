package arreglos_estrustura.de.datos;
/**
 *
 * @author Noemi
 */
public class Arreglo_bidimensional {
    public static void main (String [] args){
        int Numeros [][] = new int [2][2];
            /*El arreglo se denomina Numeros y para especificar que el arreglo será una matriz se agregan dos corchetes despues del nombre, después de la
             instanciación se agregan dos nuevos corchetes, en el primer par se indica el número de columnas y en el segundo par 
             se indica el número de filas*/
        Numeros [0][0] = 1;//Se agregará el número 1 cuando la posición sea columna=0 y fila=0
        Numeros [0][1] = 2;//Se agregará el número 2 cuando la posición sea columna=1 y fila=0
        Numeros [1][0] = 3;//Se agregará el número 3 cuando la posición sea columna=0 y fila=1
        Numeros [1][1] = 4;//Se agregará el número 4 cuando la posición sea columna=1 y fila=1 
    System.out.print("[" +Numeros [0][0] + "]");//Permitirá imprimir los números colocados en las posiciones que son indicados dentro de los corchetes
    System.out.println("[" +Numeros [0][1] + "]");
    System.out.print("[" +Numeros [1][0] + "]");
    System.out.print("[" +Numeros [1][1] + "]");
      }
}
