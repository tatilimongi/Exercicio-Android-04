package com.example.exercicio_android_04;

public interface Transacao {
    double getValor();
    String getDescricao();
    boolean precisaRevisao();
    void exibirDetalhes();
}
