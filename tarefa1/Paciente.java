public class Paciente {

    double peso;
    double altura;
    double imc;
    
    double calcularIMC() {
        imc = peso / (altura * altura);
        return imc;
    }
    
    String diagnostico() {
        
        if      (imc < 16.0) return "Baixo peso muito grave.";
        else if (imc < 17.0) return "Baixo peso grave";
        else if (imc < 18.5) return "Peso normal";
        else if (imc < 30.0) return "Sobrepeso";
        else if (imc < 35.0) return "Obesidade grau I";
        else if (imc < 40.0) return "Obesidade grau II";
        else                 return "Obesidade grau III (obesidade mórbida)";
    }

    void imprimir() {
        System.out.println("O paciente possui IMC = " + String.format("%.2f", calcularIMC()) + " e seu diagnóstico é " + diagnostico() + ".");
    }
}