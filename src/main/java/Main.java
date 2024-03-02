import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner lt = new Scanner(System.in);
    Carro c1 = new Carro();
    int continuarAcelerando = 0;
    int continuarFreando = 0;
    System.out.println("Digite a marca: ");
    c1.setMarca(lt.next());
    System.out.println("Digite o modelo: ");
    c1.setModelo(lt.next());
    do {
      System.out.println("Deseja acelerar?\n 0 = não 1 = sim ");
      continuarAcelerando = lt.nextInt();
      if (continuarAcelerando == 1) {
        c1.acelerar();
      }
    } while (continuarAcelerando >= 1);
    do {
      System.out.println("Deseja Frear?\n 0 = não 1 = sim ");
      continuarFreando = lt.nextInt();
      if (continuarFreando == 1) {
        c1.frear();
      }
    } while (continuarFreando >= 1);
    c1.exibirInformacoes();
  }

}