import Iphone.Iphone;

public class teste {
    
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();
        meuIphone.exibirPagina("www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
        meuIphone.tocar();
        meuIphone.selecionarMusica("Kiss From A Rose");
        meuIphone.pausar();
        meuIphone.ligar("9955-2830");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
    }
}
