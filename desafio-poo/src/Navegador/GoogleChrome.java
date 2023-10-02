package Navegador;

public class GoogleChrome implements NavegadorInternet {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página da web no Google Chrome");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Google Chrome");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página da web no Google Chrome");
    }

    @Override
    public void voltarPagina() {
        System.out.println("Voltando página no Google Chrome");
    }

    @Override
    public void avancarPagina() {
        System.out.println("Avançando página no Google Chrome");
    }
}
