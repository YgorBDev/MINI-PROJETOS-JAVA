import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite a quantidade de números que serão digitados: ");
    
    int quantidadeNumeros = sc.nextInt(); 
    int[] numeros = new int[quantidadeNumeros];
    
    for (int i = 0; i < quantidadeNumeros; i++) {
      System.out.printf("Digite o %dº número: ", i + 1);
      numeros[i] = sc.nextInt();
    }
     
    int soma = 0;
      for (int i = 0; i < quantidadeNumeros; i++) {
        soma += numeros[i];
      }
      
      double media = (double) soma / quantidadeNumeros;  
      System.out.printf("A média dos números digitados é: %.2f\n", media);
    
    sc.close();
  }
}
