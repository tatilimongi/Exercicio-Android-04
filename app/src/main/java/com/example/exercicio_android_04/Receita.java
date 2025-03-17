package com.example.exercicio_android_04;

import android.util.Log;

public class Receita extends TransacaoBase {
    public Receita(double valor, String descricao) {
        super(valor, descricao);
    }

    @Override
    public void exibirDetalhes() {
        Log.i(TAG, "Receita: R$" + valor + " | " + descricao + (revisao ? " (Precisa de Revisão)" : ""));
    }
}

