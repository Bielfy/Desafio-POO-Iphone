package Celular;

import Aplicativos.Internet.NavegadorInternet;
import Aplicativos.Musica.ReprodutorMusical;
import Aplicativos.Telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    //Internet
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina no navegador do Iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador do Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina no navegador do Iphone");
    }

    //Musica
    @Override
    public void tocar() {
        System.out.println("Tocando musica no reprodutor do Iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica no reprodutor do Iphone");

    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica no reprodutor do Iphone");
    }

    //Telefone
    @Override
    public void ligar() {
        System.out.println("Ligando no telefone do Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo no telefone do Iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no telefone do Iphone");
    }
}
