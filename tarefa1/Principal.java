public class Principal {
    public static void main(String[] args) {

        Paciente p1 = new Paciente();
        Paciente p2 = new Paciente();
        Paciente p3 = new Paciente();

        p1.peso = 85;
        p1.altura = 1.73;
        p1.imprimir();

        p2.peso = 56;
        p2.altura = 1.60;
        p2.imprimir();

        p3.peso = 120;
        p3.altura = 1.90;
        p3.imprimir();
    }
}