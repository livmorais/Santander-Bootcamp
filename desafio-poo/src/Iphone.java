import Musica.ReprodutorMusical;
import Navegador.NavegadorInternet;
import Telefone.AparelhoTelefonico;

public class Iphone extends AparelhoTelefonico implements ReprodutorMusical, NavegadorInternet {

    public Iphone(String numero) {
        super(numero);
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música no iPhone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música no iPhone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música no iPhone");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página da web no iPhone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador do iPhone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página da web no iPhone");
    }

    @Override
    public void voltarPagina() {
        System.out.println("Voltando página no navegador do iPhone");
    }

    @Override
    public void avancarPagina() {
        System.out.println("Avançando página no navegador do iPhone");
    }
}
