import java.util.Random;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    String letraDigitada = "";

    System.out.println("JOGO DA FORCA MORTAL");
    System.out.println("");
    System.out.println("---------------------------------------------------------------------------->");
    System.out.println("");
    System.out.println("Jigsaw está de bom humor e vai lhe dar a chance de escolher a dificuldade, escolha com sabedoria HAHAHAHAHA!! ");
    System.out.println("");
    System.out.println("Escolha a dificuldade: 1 - Fácil, 2 - Médio, 3 - Difícil");
     System.out.println("---------------------------------------------------------------------------->");
    int dificuldade = scanner.nextInt();

    String[] facil = {"Refri", "Arroz", "Carro", "Teclado", "Rato", "Ataque" };
    String[] medio = {"Abelha", "Cachorro", "Passaro", "Mangue", "Urubu", "Ratoeira", "Casa", "Pato"};
    String[] dificil = {"Algoritmos", "Programação", "Replit","Paralelepipedo","Candelabro","Pneumoultramicroscopicossilicovulcanoconiótico"};

    String[] palavras = new String[0];

    switch(dificuldade) {
      case 1:
        palavras = facil;
        break;
      case 2:
        palavras = medio;
        break;
      case 3:
        palavras = dificil;
        break;
      default:
        break;
    }

    int palavraRandom = random.nextInt(palavras.length);
    String palavraEscolhida = palavras[palavraRandom].toLowerCase();  
    char[] palavraArray = palavraEscolhida.toCharArray();
    char[] acertos = new char[palavraArray.length];
    for (int i = 0; i < palavraArray.length; i++) {
      acertos[i] = '_';
    }
    int vidas = 6;
    while (vidas >= 0) {
    if(vidas == 6){
      System.out.println("_______");
      System.out.println("|     |"); 
      System.out.println("|     ");
      System.out.println("|     ");
      System.out.println("|     ");
      System.out.println("|     ");
      System.out.println("|     ");

    }
    if (vidas == 5){
      System.out.println("_______");
      System.out.println("|     |"); 
      System.out.println("|     O");
      System.out.println("|      ");
      System.out.println("|      ");
      System.out.println("|      ");
      System.out.println("|      ");
    }
    if (vidas == 4){
      System.out.println("_______");
      System.out.println("|     |"); 
      System.out.println("|     O");
      System.out.println("|     |--");
      System.out.println("|      ");
      System.out.println("|      ");
      System.out.println("|      ");
    }
    if (vidas == 3){
      System.out.println("_______");
      System.out.println("|     |"); 
      System.out.println("|     O");
      System.out.println("|   -—|--");
      System.out.println("|      ");
      System.out.println("|      ");
      System.out.println("|      ");
     
    }
    if(vidas == 2){
      System.out.println("_______");
      System.out.println("|     |"); 
      System.out.println("|     O");
      System.out.println("|   -—|--");
      System.out.println("|     |");
      System.out.println("|     |");
      System.out.println("|      ");
    
    } 
    if(vidas == 1){
      System.out.println("_______");
      System.out.println("|     |"); 
      System.out.println("|     O");
      System.out.println("|   -—|--");
      System.out.println("|     |");
      System.out.println("|     |");
      System.out.println("|      =");
     
    }
    else if (vidas == 0) { 
      System.out.println("_______");
      System.out.println("|     |"); 
      System.out.println("|     O");
      System.out.println("|   -—|--");
      System.out.println("|     |");
      System.out.println("|     |");
      System.out.println("|    = =");
   
    }
      System.out.println("---------------------------------------------------------------------------->");
      System.out.println("Digite uma letra: ");

      char letra = scanner.next().charAt(0);
      System.out.println("");
      letraDigitada += letra + ", ";

      boolean acertou = false;
      for (int i = 0; i < palavraArray.length; i++) {
        if (palavraArray[i] == letra) {
          acertos[i] = letra;
          acertou = true;
        }
      }

      System.out.println("Vidas restantes: " + vidas);
      System.out.println("");
      System.out.println("Letras corretas: " + String.valueOf(acertos));
      System.out.println("");
      System.out.println("Letras digitadas: " + letraDigitada);

      if (!acertou) {
        vidas--;
      }
      if (String.valueOf(acertos).equals(palavraEscolhida)) {
        System.out.println("---------------------------------------------------------------------------->");
        System.out.println("Parabéns, você acertou a palavra!" + palavraEscolhida);
        System.out.println("");
        System.out.println("Escapou com sorte dessa vez!!");
         System.out.println("");
        System.out.println("Até a próxima HAHAHAHAHAHAHA");
      break;
      }
    }
     if (vidas == 0) {
     
      System.out.println("Você perdeu! A palavra era: " + palavraEscolhida);
      System.out.println("Jigsaw está Rindo de você HAHAHAHAHAHAHAHA ");
      System.out.println("---------------------------------------------------------------------------->");
    }
      scanner.close();
  }
}
