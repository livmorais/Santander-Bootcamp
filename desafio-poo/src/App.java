import Musica.Itunes;
import Navegador.GoogleChrome;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone meuiPhone = new Iphone("1241-1243");
        Itunes itunes = new Itunes();
        GoogleChrome googleChrome = new GoogleChrome();

        System.out.println("-Telefone-");
        meuiPhone.ligar();
        meuiPhone.atender();
        meuiPhone.iniciarCorreioVoz();
        System.out.println(" ");
        System.out.println("-Musica-");
        meuiPhone.tocar();
        meuiPhone.selecionarMusica();
        meuiPhone.pausar();
        System.out.println(" ");
        System.out.println("-Internet-");
        meuiPhone.exibirPagina();
        meuiPhone.adicionarNovaAba();
        meuiPhone.atualizarPagina();
        meuiPhone.voltarPagina();
        meuiPhone.avancarPagina();
        System.out.println(" ");

        System.out.println("-Itunes-");
        itunes.tocar();
        System.out.println("-Google Chrome-");
        googleChrome.exibirPagina();
    }
}
