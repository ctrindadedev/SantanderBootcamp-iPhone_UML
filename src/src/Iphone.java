public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String musicaAtual;
    private String urlAtual;

    //Métodos de ReprodutorMusical

    @Override
    public void tocar() {
        if (musicaAtual != null && !musicaAtual.isEmpty()) {
            System.out.println("Tocando música: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música selecionada. Selecione uma música primeiro");
        }
    }

    @Override
    public void pausar() {
        if (musicaAtual != null && !musicaAtual.isEmpty()) {
            System.out.println("Música " + musicaAtual + " pausada");
        } else {
            System.out.println("Nenhuma música tocando para pausar");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
    }

    // Métodos de AparelhoTelefonico

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada de voz");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz");
    }

    // Métodos de NavegadorInternet

    @Override
    public void exibirPagina(String url) {
        this.urlAtual = url;
        System.out.println("Exibindo página da internet: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada no navegador");
    }

    @Override
    public void atualizarPagina() {
        if (urlAtual != null && !urlAtual.isEmpty()) {
            System.out.println("Atualizando a página: " + urlAtual);
        } else {
            System.out.println("Nenhuma página sendo exibida para atualizar.");
        }
    }

    //Teste

    public static void main(String[] args) {

        Iphone meuIphone12 = new Iphone();

        meuIphone12.selecionarMusica("90210 - Travis Scott");
        meuIphone12.tocar();
        meuIphone12.pausar();
        System.out.println();

        meuIphone12.ligar("1293456-7890");
        meuIphone12.atender();
        meuIphone12.iniciarCorreioVoz();
        System.out.println();

        meuIphone12.exibirPagina("https://www.google.com");
        meuIphone12.adicionarNovaAba();
        meuIphone12.atualizarPagina();
    }
}