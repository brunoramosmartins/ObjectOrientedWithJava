public class Carro {
    
    int potencia;
    int velocidade;
    String name;

    void acelerar() {
        velocidade += potencia;

    }

    void frear() {
        velocidade = velocidade/2;
    }

    int getVelocidade() {
        return velocidade;
    }

    void imprimir() {
        System.out.println("O carro " + name + " está a velocidade de " + getVelocidade() + " km/h.");

    }

}