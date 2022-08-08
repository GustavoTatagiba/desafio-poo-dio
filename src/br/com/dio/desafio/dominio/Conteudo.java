package br.com.dio.desafio.dominio;
// essa classe será implementada pelas classes filhas (por herança) a fim de evitar a repetição de código.
// abstract não permite que essa classe seja instanciada (não permite criar objeto do tipo Conteudo)

public abstract class Conteudo {
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXp ();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
