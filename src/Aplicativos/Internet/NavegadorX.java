package Aplicativos.Internet;

public class NavegadorX implements NavegadorInternet {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina no NavegadorX");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no NavegadorX");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina no NavegadorX");
    }
}
