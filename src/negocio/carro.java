package negocio;

public class carro {
    public int potencia;
    private double velocidad;

    public void acelerar(){
        velocidad+=potencia;
    }
    void frenar (){
        velocidad/=potencia;

    }
}
