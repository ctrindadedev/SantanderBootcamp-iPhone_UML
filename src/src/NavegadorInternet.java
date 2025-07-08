public interface NavegadorInternet {

    /**
     * Exibe o conteúdo de uma página da web a partir de uma URL
     * @param url O endereço da página a ser exibida
     */
    void exibirPagina(String url);


    void adicionarNovaAba();
    void atualizarPagina();
}