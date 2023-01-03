package br.com.ipcalculator.enums;

public enum IP_ENUM {
    CLASSE_A("Este IP é de Classe A"), 
    CLASSE_B("Este IP é de Classe B"), 
    CLASSE_C("Este IP é de Classe C");

    private String descricao;

    IP_ENUM(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
