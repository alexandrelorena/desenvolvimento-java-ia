package POO;

public class Autodromo {
    public static void main(String[] args) {
        // POLIMORFISMO / ABSTRAÇÃO
        Carro jeep = new Carro();
        jeep.setChassi("897897");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("123123");
        z400.ligar();
        
    }

}
