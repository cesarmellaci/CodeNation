import java.io.IOException;
import java.util.Scanner;
 
public class TesteString {
// atrav�s da cla�sula throws indicamos que n�o iremos
// tratar poss�veis erros na entrada de dados realizada
// atrav�s do m�todo "read" do pacote de classes System.in
  public static void main(String[] args) throws IOException {
    Scanner ler = new Scanner(System.in);
 
    String nome;
    char sexo;
 
    System.out.printf("Informe um nome:\n");
    nome = ler.nextLine();
 
    System.out.printf("\nInforme o sexo (M/F):\n");
    sexo = (char)System.in.read();
 
    if ((sexo == 'M') || (sexo == 'm'))
       System.out.printf("\nSeja bem-vindo Sr. %s.\n", nome);
    else System.out.printf("\nSeja bem-vinda Sra. %s.\n", nome);
  }
 
}