package negocio;

public class MainCarro {
    static void main() {
        carro c1=new carro();
        carro c2= new carro();
        carro c3= new carro();

        c1.potencia= 2;
        c1.velocidad= 60 ;

        c2.potencia= 5;
        c2.velocidad= 100 ;

        c3.potencia= 2;
        c3.velocidad= 60 ;

        System.out.println("La potencia del carro 1 es "+c1.potencia+ " y la velocidad es "+c1.velocidad);
        c1.acelerar();
        c1.acelerar();
        c1.frenar();
        System.out.println("La potencia del 1 carro es "+c1.potencia+ " y la velocidad es "+c1.velocidad);
        System.out.println("La potencia del 2 carro es "+c2.potencia+ " y la velocidad es "+c2.velocidad);
        System.out.println("La potencia del 3 carro es "+c3.potencia+ " y la velocidad es "+c3.velocidad);
        c1.frenar();
        c1.frenar();
        c2.frenar();
        c2.frenar();
        c2.frenar();
        c2.frenar();
        c2.frenar();
        c2.frenar();
        c2.frenar();

        c1.frenar();
        c3.frenar();
        c3.frenar();
        System.out.println("La potencia del carro 1 es "+c1.potencia+ " y la velocidad es "+c1.velocidad);
        System.out.println("La potencia del carro 2 es "+c2.potencia+ " y la velocidad es "+c2.velocidad);
        System.out.println("La potencia del carro 3 es "+c3.potencia+ " y la velocidad es "+c3.velocidad);

    }
}
