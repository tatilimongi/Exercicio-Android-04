package com.example.exercicio_android_04;

import android.util.Log;

public abstract class TransacaoBase implements Transacao {
    protected double valor;
    protected String descricao;
    protected boolean revisao;
    protected static final String TAG = "Transação";

    public TransacaoBase(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
        this.revisao = valor >= 1000;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public boolean precisaRevisao() {
        return revisao;
    }

    @Override
    public abstract void exibirDetalhes();
}

