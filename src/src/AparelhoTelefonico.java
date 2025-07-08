public interface AparelhoTelefonico {

    /**
     * Realiza uma chamada para o número especificado
     * @param numero O número de telefone para o qual ligar
     */
    void ligar(String numero);


    void atender();
    void iniciarCorreioVoz();
}