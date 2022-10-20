
package aed.individual1;

public class ArrayCheckSumUtils {

  // a no es null, podria tener tamaño 0, n>0
  public static int[] arrayCheckSum(int[] arr, int n) {
	  
	 //Numero de checksums
	 int numChecksums = (int)(arr.length / n);
	 if(arr.length % n > 0) {
		 numChecksums++;
	 }
	 //Creacion del array resultado
	 int[] array = new int[arr.length + numChecksums];
	 
	 //Posicion de n en array que subdivide el array mediante incisos/checksums
	 int inciso = n;
	 
	 int suma = 0;
	 for(int i=0,j=0; i<array.length; i++) { 
		 if(i!=inciso && j<arr.length) {		
			array[i] = arr[j];				//Array igual al dado antes del inciso
			suma += arr[j];					//Sumar numeros anteriores al inciso
			j++;			
		}
		else {			
			array[i]=suma;	//Agregar suma tras inciso
			suma=0;			//Resetear suma
			inciso+=1+n;	//Siguiente inciso en el array
		}
	}
    return array;
  }
}
