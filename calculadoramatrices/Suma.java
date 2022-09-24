package calculadoramatrices;

import javax.swing.JOptionPane;

public class Suma implements IMetodos {

    //Atributos
    private int a, b, mat[][], mat2[][];

    //Constructores
    
    //Constructor Normal
    public Suma() {
    }

    //Constructor Sobrecargado
    public Suma(int a, int b, int[][] mat, int[][] mat2) {
        this.a = a;
        this.b = b;
        this.mat = mat;
        this.mat2 = mat2;
    }
    
    
    //Metodos set
    public void setA(int a) {
        this.a = a;
    }
    
    public void setB(int b) {
        this.b = b;
    }
    
    public void setMat(int[][] mat) {    
        this.mat = mat;
    }

    public void setMat2(int[][] mat2) {
        this.mat2 = mat2;
    }
    
    
    //Metodos get

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int[][] getMat() {
        return mat;
    }

    public int[][] getMat2() {
        return mat2;
    }
    
    //Metodos Abstractos de la Interface IMetodos
    @Override
    public int[][] operacion() {
        int m[][]= new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                m[i][j]=mat[i][j]+mat2[i][j];
            }
        }
        return m;
    }

    @Override
    public void imprimir() {
        String s="";
        int [][] m = operacion();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                s+=m[i][j]+"  ";
            }
            s+="\n";
        }
        JOptionPane.showMessageDialog(null, "Matriz resultado:\n"+s);
    }

}
