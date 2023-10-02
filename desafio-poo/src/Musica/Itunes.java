package Musica;

public class Itunes implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando música no Itunes");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música no Itunes");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música no Itunes");
    }
}
