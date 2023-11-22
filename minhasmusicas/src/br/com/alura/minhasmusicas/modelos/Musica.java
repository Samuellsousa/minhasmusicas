package br.com.alura.minhasmusicas.modelos;

public class Musica  extends Audio{
    private String album;
    private String cantor;
    private String genero;

    public void setCantor(String kiss) {
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalReproducoes() > 200){
            return 10;
        } else {
            return 7;
        }

    }
}
