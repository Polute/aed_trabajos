package aed.individual2;

import es.upm.aedlib.indexedlist.*;

public class IndexedListCheckSumUtils {

  // a no es null, podria tener tamaño 0, n>0
  public static IndexedList<Integer> indexedListCheckSum(IndexedList<Integer> list, int n) {
	//Creacion de la lista indexada resultado y numero de checksums
	  IndexedList<Integer> res = new  ArrayIndexedList<>();
	  int numChecksums = (int)(list.size() / n);
	  if(list.size() % n > 0) {
		 numChecksums++;
	  }
	
	 //Posicion de n en array que subdivide la lista indexada mediante incisos/checksums
	 int inciso = n;		 
	 int suma = 0;
	 
	 for(int i=0,j=0; i<numChecksums+list.size(); i++) { 
			 if(i!=inciso && j<list.size()) {		
				res.add(i,list.get(j));				//Lista igual a la dada antes del inciso
				suma += list.get(j);					//Sumar numeros anteriores al inciso
				j++;			
			}
			else {			
				res.add(i,suma);	//Agregar suma tras inciso
				suma=0;			//Resetear suma
				inciso+=1+n;	//Siguiente inciso en la lista
			}
		}
	 return res;
	  }

  // list no es null, podria tener tamaño 0, n>0
  public static boolean checkIndexedListCheckSum(IndexedList<Integer> list, int n) {
	  boolean checkSum = true;
	  
	  int valorEsperado = 0;
	  
	  int nextCheckSum = n;
	  
	  for(int i=0; i<list.size() && checkSum; i++) {
		  if(i==nextCheckSum || i==list.size()-1) {
			  checkSum = list.get(i)== valorEsperado;
			  valorEsperado = 0;
			  nextCheckSum += n+1; 
		  }
		  else {
			  valorEsperado += list.get(i);
		  }
	  }
    return checkSum;
  }
}

