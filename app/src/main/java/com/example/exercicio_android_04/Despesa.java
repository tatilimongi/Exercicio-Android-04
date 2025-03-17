package com.example.exercicio_android_04;

import android.util.Log;

public class Despesa extends TransacaoBase {
    public Despesa(double valor, String descricao) {
        super(valor, descricao);
    }

    @Override
    public void exibirDetalhes() {
        Log.i(TAG, "Despesa: R$" + valor + " | " + descricao + (revisao ? " (Precisa de Revisão)" : ""));
    }
}

