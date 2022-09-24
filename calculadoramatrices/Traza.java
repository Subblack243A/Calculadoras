package calculadoramatrices;

import javax.swing.JOptionPane;

public class Traza implements IMetodos{
    //Atributos
    private int tam, mat[][], sum;
    
    //Metodos set
    //No hay set de sum porque no es un valor que deban enviar
    public void setMat(int[][] mat) {
        this.mat = mat;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
    
    //Metodos get
    public int[][] getMat() {
        return mat;
    }

    public int getTam() {
        return tam;
    }

    public int getSum() {
        return sum;
    }
    
    //Constructores
    
    //Constructor Normal
    public Traza() {
    }
    
    //Constructor Sobrecargado
    public Traza(int tam, int[][] mat) {
        this.tam = tam;
        this.mat = mat;
    }

    //Metodos Abstractos de la Clase IMetodos 
    @Override
    public int[][] operacion() {
        int m[][]= new int[tam][tam], sum=0;
        for (int i = 0; i < tam; i++) {
            sum+=mat[i][i];
        }
        this.sum=sum;
        return m;
    }

    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null, "La traza de la Matriz es:\n"+sum);
    }
    
    
}
