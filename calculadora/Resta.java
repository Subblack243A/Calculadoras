package calculadora;

public class Resta extends ANumero{

    //Constructor
    public Resta() {
    }

    //Metodos abstractos de calse ANumero
    @Override
    public float operar(int a, int b) {
        return a-b;
    }
}
