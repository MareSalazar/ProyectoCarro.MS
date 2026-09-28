package negocio;

public class carro {
    public int potencia;
    public double velocidad ;

    public void acelerar(){
        velocidad+=potencia;
    }
    void frenar (){
        velocidad/=potencia ;

    }
}
