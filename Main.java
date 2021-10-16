import java.util.*;
class Main {
  public static void main(String[] args) {
   Scanner leitor = new Scanner(System.in); 
   //variavel
     double novoSalario = 0.0;
     double salarioAtual = 0.0;
     //entrada
     System.out.print("Digite o Sálario atual");
     salarioAtual = leitor.nextInt();
     //processamento de dados
     if(salarioAtual <= 500){
     novoSalario =(salarioAtual*1.20);}
     else{
     novoSalario =(salarioAtual*1.10);}
     //SAIDA
     System.out.println("Seu novo sálario é "+novoSalario);
 }
}

