package calculadora;

public class Suma extends ANumero{

    //Constructor
    public Suma() {
    }
    
    
    //Metodos abtractod de la clase ANumero
    @Override
    public float operar(int a, int b) {
        return a+b;
    }
    
}
