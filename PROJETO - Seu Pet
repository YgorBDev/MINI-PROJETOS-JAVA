class Pet {
  private String name;
  private String lastname;
  public Pet(String name, String lastname) {
    this.name = name;
    this.lastname = lastname;
  }
  public String toString() {
    return "Pet: " + this.name + " " + this.lastname;
  }
  public String getName() {
    return this.name;
  }
  public String getLastname() {
    return this.lastname;
    
  }
  public void setName(String newName) {
    this.name = newName;
  }
}
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Qual o nome do pet e o sobrenome da familia?");

    System.out.println("Nome: ");
    String name = sc.next();
    System.out.println("");
    System.out.println("Sobrenome: ");
    String lastname = sc.next();

    Pet pet = new Pet(name, lastname);
    System.out.println("");
    System.out.println("Pet: " + pet.getName() + " " + pet.getLastname());

    System.out.println("Gostarias de alterar o nome do pet? S/N");
    String answer = sc.next();

    if (answer.equals("S")){
      System.out.println("Qual o novo nome do pet?");
      String newName = sc.next();
      pet.setName(newName);
      System.out.println("");
      System.out.println("Pet: " + pet.getName() + " " + pet.getLastname());
    }
    else{
      System.out.println("Ok, o nome do pet não foi alterado.");
      System.out.println("");
      System.out.println("Pet: " + pet.getName() + " " + pet.getLastname());
      System.out.println("Bem vindo á familia " + pet.getLastname() + "!");
    }
  }
}
