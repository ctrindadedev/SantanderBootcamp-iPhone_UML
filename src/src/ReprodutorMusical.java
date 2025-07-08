public interface ReprodutorMusical {
    /**
     * Metódos para tocar/pausar a música atual.
     */
    void tocar();
    void pausar();

    /**
     * Seleciona uma música da biblioteca para tocar
     * @param musica O nome/identificador da música a ser selecionada
     */
    void selecionarMusica(String musica);
}