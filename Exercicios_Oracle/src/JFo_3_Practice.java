import java.util.Scanner;

public class JFo_3_Practice {

    public static void main(String[] args) {
        
Scanner teclado = new Scanner(System.in);
    
        System.out.println("Para começar, preciso que você insira seu nome.");
String nome= teclado.nextLine();

System.out.println("Agora, por favor, insira o nome de um lugar que você já visitou.");
String lugar= teclado.nextLine();

System.out.println("Agora, de uma nota para a viagem");
int nota= teclado.nextInt();
    
System.out.println("e agora o quanto de dinheiro que vc levou com você,( no minimo 100)");
double dinheiro = teclado.nextDouble();

double dinheirofinal = dinheiro - 80;
int notafinal = nota - 1;

teclado.close();

System.out.printf("Era uma vez uma pessoa chamada %s \n",nome);
System.out.printf("ela planejou uma viagem para %s \n", lugar);
System.out.printf("ela tinha levado %3.2f em dinheiro\n", dinheiro);
System.out.printf("e chegando la ela comprou um lanche que custava 80 \n");
System.out.printf("ficando com apenas %3.2f \n", dinheirofinal);
System.out.printf("por fim ela iria dar uma nota %d para a viagem ", nota);
System.out.printf("mas por causa da comida que não estava muito boa");
System.out.printf("ela abaixou um ponto e deu %d ",notafinal);


}
}