package arreglosMultidimensionales;

public class ManejoGolosinas {
	

    private int total = 0;

    
        
    public void mostrarMatriz(String golosinas[], int matriz[][]) {
		for(int i=0;i<golosinas.length;i++) {
			System.out.print(golosinas[i]);
			for (int j=0;j<matriz[0].length; j++) {
				System.out.print("   |   " + matriz[i][j]);
			}
			System.out.println();
		}
	}
	public int[][] pedirGolosina(int matriz[][], int posicion){
		if(matriz[posicion-1][1]==0){																		//COMPRUEBA QUE HAYA STOCK
			System.out.println("No queda stock de la golosina seleccionada, por favor selecciona otra");	//SI NO HAY AVISA
		}
		else {																								//SI HAY...
			matriz[posicion-1][1]-=1;																		//RESTA 1 UNIDAD DEL STOCK
			sumarVenta(matriz[posicion-1][0]);																//SUMA LA VENTA
			System.out.println("Se te cobró $ " + matriz[posicion-1][0] + ". Gracias por comprar!");			
		}
		return matriz;
	}
	public void sumarVenta(int venta) {
		total+=venta;
	}
	public int[][] rellenaGolosinas(int matriz[][], int posicion, int cantidad){
		matriz[posicion-1][1]+=cantidad;
		System.out.println("Se ha rellenado la fila " + posicion + " con " + cantidad + " unidades correctamente.");
		return matriz;
	}
	public int getTotal() {
		return total;
	}
}
