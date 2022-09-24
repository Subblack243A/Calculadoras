package calculadora;

public class Multiplicacion extends ANumero{

    //Constructor
    public Multiplicacion() {
    }

    //Metodos abstractos classe ANumero
    @Override
    public float operar(int a, int b) {
        return a*b;
    }
    
}
