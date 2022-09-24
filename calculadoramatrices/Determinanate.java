package calculadoramatrices;

public class Determinanate {
    //Sacado de: https://gist.github.com/raprav/78238
    public int determinanteMatriz(int x[][], int n){
		int det=0;
		switch(n){
			case 2:
				det=((x[0][0]*x[1][1])-(x[1][0]*x[0][1]));
				break;
			case 3:	//Método de Gauss
				det=((x[0][0])*(x[1][1])*(x[2][2])+(x[1][0])*(x[2][1])*(x[0][2])+(x[2][0])*(x[0][1])*(x[1][2]))-((x[2][0])*(x[1][1])*(x[0][2])+(x[1][0])*(x[0][1])*(x[2][2])+(x[0][0])*(x[2][1])*(x[1][2]));
				break;
			default:	//Desarrollo a partir de los elementos de una fila/columna			
				for(int z=0;z<x.length;z++){
					det+=(x[z][0]*adj(x,z,0));
				}
		}
		return det;
	}
	public int adj(int x[][], int i, int j){
		int adjunto;
	 	int y[][]=new int[x.length-1][x.length-1];
		int m,n;
		for(int k=0;k<y.length;k++){	
			if(k<i){							
				m=k;
			}
			else{
				m=k+1;
			}
			for(int l=0;l<y.length;l++){
				if(l<j){
					n=l;
				}
				else{
					n=l+1;
				}
				y[k][l]=x[m][n];
			}
		}
		adjunto=(int)Math.pow(-1,i+j)*determinanteMatriz(y, y.length);		
		return adjunto;																	
	}
}
