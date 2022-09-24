package calculadora;

public class Division  extends ANumero{

    //Constructor
    public Division() {
    }

    //Metodos abstractos clase ANumero
    @Override
    public float operar(int a, int b) {
        return (float)a/(float)b;
    }
    
}
