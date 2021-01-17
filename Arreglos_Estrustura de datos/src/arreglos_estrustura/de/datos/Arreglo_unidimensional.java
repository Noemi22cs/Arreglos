package arreglos_estrustura.de.datos;
/**
 *
 * @author Noemi
 */
public class Arreglo_unidimensional {
    public static void main (String [] args){
  
    String[] Articulo={"Libro","Libreta","Lápiz","Boligrafo","Corrector","Marcatexto","Borrador","Zacapunta","Juego geométrico","Notas"};
        //Se ha declarado un arreglo de tipo String denominado articulo, y le fue almacenado el nombre de diferentes articulos
    System.out.println("Cantidad de articulos: "+Articulo.length);
        //Esta sintaxis permitira imprimir en pantalla el mensaje escrito en color naranja y length realizará el conteo de los datos almacenados en el arreglo articulo e imprimirá la cantidad junto al mensaje
        System.out.println("Lo siguiente es la lista de nombres de articulos almacenados en el arreglo");//Mensaje
    for (int indice=0;indice<Articulo.length;indice++){//La sentencia for permitirá imprimir la lista de articulos 
        System.out.println("Posición: "+indice+" Articulo: "+Articulo[indice]); 
    }
    }
 }
