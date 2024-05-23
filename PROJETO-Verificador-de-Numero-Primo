import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner vp = new Scanner(System.in);
    System.out.println("Digite um número para verificar se é primo: ");

    int num = vp.nextInt();

    boolean Primo= true;

    for (int i = 2; i <= num / 2; i++) {
        if (num % i == 0) {
            Primo = false;
            break;
        }
    }
    if (Primo) {
        System.out.println(num + " é primo");
    } else {
        System.out.println(num + " não é primo");
    }
  }
}
