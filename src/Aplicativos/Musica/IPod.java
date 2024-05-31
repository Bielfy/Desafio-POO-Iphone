package Aplicativos.Musica;

public class IPod implements ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("Tocando musica no IPod");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica no IPod");

    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica no IPod");
    }
}
