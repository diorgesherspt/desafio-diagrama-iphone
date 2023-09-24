public class Fabrica {
    public static void main(String[] args){
        Iphone iphone = new Iphone();

        NavegadorInternet navegadorInternet = iphone;
        ReprodutorMusical reprodutorMusical = iphone;
        AparelhoTelefonico aparelhoTelefonico = iphone;

        //Testando os métodos
        navegadorInternet.exibirPagina();
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();

        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica();

        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();

    }
}
