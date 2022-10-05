package main.java;

public enum Estado {
    SP("sp", "SAO PAULO", Regiao.SUDESTE),
    RJ("rj", "RIO DE JANEIRO", Regiao.SUDESTE),
    MA("ma", "MARANHÃO", Regiao.NORDESTE),
    ;
    private String nome;
    private String sigla;
    private Regiao regiao;

    Estado(String sigla, String nome, Regiao regiao) {
        this.nome = nome;
        this.sigla = sigla;
        this.regiao = regiao;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public Regiao getRegiao() {
        return regiao;
    }
}
