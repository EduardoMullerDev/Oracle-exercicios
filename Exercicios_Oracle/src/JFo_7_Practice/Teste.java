package JFo_7_Practice;
//OBS : queimei alguns neuronios fazendo essa atividade então espero que esteja certa
public class Teste {
    public static void main(String[] args) {
    Cartao cartao1 = new Cartao(1);
    Cartao cartao2 = new Cartao(2);

    cartao1.adicionarcreditos(100);
    cartao2.adicionarcreditos(50);

    Terminal terminal = new Terminal();

    terminal.inserirCartao(cartao1);

    terminal.carregarCreditos(5);

    terminal.transferSaldo(cartao1, cartao2);

    terminal.inserirCartao(cartao2);

    terminal.trocarTicketsPorPremios(0);


    Jogo jogo = new Jogo("Jogo dos Tíquetes Aleatórios!", 3, 5);
    terminal.jogandoJogo(jogo);
    }

}
