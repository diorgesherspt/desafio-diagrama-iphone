public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {
    //métodos do Navegador de Internet
    public void exibirPagina(){
        System.out.println("Exibindo página!");
    };

    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba!");
    };

    public void atualizarPagina(){
        System.out.println("Atualizando página!");
    };

    //métodos do Reprodutor Musical
    public void tocar(){
        System.out.println("Tocando música!");
    };

    public void pausar(){
        System.out.println("Pausando música!");
    };

    public void selecionarMusica(){
        System.out.println("Selecionando música!");
    };

    //métodos do Aparelho telefônico
    public void ligar(){
        System.out.println("Ligando!");
    };

    public void atender(){
        System.out.println("Atendendo!");
    };

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando Correio de Voz!");
    };
}
