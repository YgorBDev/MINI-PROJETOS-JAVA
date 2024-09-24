import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("== IMC de uma Pessoa Fitness ==\n");
        
        Locale.setDefault(Locale.US);

        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a altura: ");
        double altura = teclado.nextDouble();
        System.out.print("Informe o peso: ");
        double peso = teclado.nextDouble();

        PessoaFitness p = new PessoaFitness(altura, peso);

        do {
            System.out.println("O IMC dessa pessoa é " + p.calculeIMC() + "\n");
            System.out.print("Informe a variação de peso: ");
            double variacao = teclado.nextDouble();
            System.out.println();
            if (variacao == 0) {
                break;
            }

            p.engorde(variacao);
            System.out.println("O peso atual é " + p.getPeso());
        } while (true);

        System.out.println("Ok, tenha um bom dia!");
    }
}
class PessoaFitness {
    
    private double altura;
    private double peso;

    public PessoaFitness(double a, double p) {
        this.altura = a;
        this.peso = p;
    }
    
    public double getPeso() {
        return this.peso;
    }

    public double calculeIMC() {
        double imc = this.peso / this.altura / this.altura;
        return imc;
    }
    
    void engorde(double quilos) {
        this.peso += quilos;
    }
}
