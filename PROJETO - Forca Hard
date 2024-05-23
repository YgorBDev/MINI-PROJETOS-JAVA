import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        JogoForca j = new JogoForca();
        Scanner teclado = new Scanner(System.in);
      
        while (!j.acabou()) {
            
            System.out.println(j);
            System.out.println();
            System.out.print("Qual letra deseja chutar: ");
            
            char l = teclado.next().charAt(0);
            j.verifiqueLetra(l);
        }
      
        System.out.println(j);
        System.out.println("\nParabéns!");
    }
}


import java.util.Random;

class JogoForca {
    
    private String[] palavras;
    private String sorteada;
    private char[] revelada;
    private int numErros;

    public JogoForca() {
       
        this.palavras = new String[10];
        this.palavras[0] = "abacaxi";
        this.palavras[1] = "bicicleta";
        this.palavras[2] = "cachorro";
        this.palavras[3] = "computador";
        this.palavras[4] = "futebol";
        this.palavras[5] = "gato";
        this.palavras[6] = "java";
        this.palavras[7] = "pizza";
        this.palavras[8] = "telefone";
        this.palavras[9] = "vacina";

       
        Random r = new Random();
        int k = r.nextInt(this.palavras.length);
        this.sorteada = this.palavras[k];

        
        this.revelada = new char[this.sorteada.length()];
        for (int i = 0; i < this.sorteada.length(); i++) {
            this.revelada[i] = '-';
        }
        this.numErros = 0;
    }

    public String toString() {
        String s = "";
        for (char c: this.revelada) {
            s += c + " ";
        }
        s += "   Num. erros = " + this.numErros;
        return s;
    }

    public int getNumErros() {
        return this.numErros;
    }

    public void verifiqueLetra(char l) {
        boolean encontrou = false;
        for (int i = 0; i < this.sorteada.length(); i++) {
            if (l == this.sorteada.charAt(i)) {
                this.revelada[i] = l;
                encontrou = true;
            }
        }
        if (!encontrou) {
            this.numErros++;
        }else if(numErros==8){
          System.out.println("Você perdeu");
        }
    }

    public boolean acabou() {
        String temp = new String(this.revelada);
        return this.sorteada.equals(temp);
    }
}
