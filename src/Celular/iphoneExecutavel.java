package Celular;

public class iphoneExecutavel {
    public static void main (String[]args) {
        Iphone iphone = new Iphone();

        //Telefone
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        //Musica
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        //Internet
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
