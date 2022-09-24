package calculadoramatrices;

import javax.swing.JOptionPane;

public class Matriz {
    //Atributos
    private int a, b;

    //Constructores
    
    //Constructor Normal
    public Matriz() {
    }

    //Constructor Sobrecargado
    public Matriz(int a, int b) {
        this.a = a;
        this.b = b;
    }

    //Metodos Set
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    //Metodos Get
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
    
    //Metodo para hacer Matrices
    public int [][] hacerMatriz(int a, int b) {
        int mat[][]= new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                mat[i][j]=Integer.parseInt(JOptionPane.showInputDialog("LLene Matriz posicion: "+i+"-"+j));
            }
        }
        return mat;
    }
}
