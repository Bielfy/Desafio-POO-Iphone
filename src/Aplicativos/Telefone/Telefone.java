package Aplicativos.Telefone;

public class Telefone implements AparelhoTelefonico {
    @Override
    public void ligar() {
        System.out.println("Ligando pelo Telefone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo pelo Telefone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz pelo Telefone");
    }
}
