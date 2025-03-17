package com.example.exercicio_android_04;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorFinancas {
    private List<Transacao> transacoes;
    private static final String TAG = "GerenciadorFinanças";

    public GerenciadorFinancas() {
        this.transacoes = new ArrayList<>();
    }

    public void adicionarTransacao(Transacao transacao) {
        transacoes.add(transacao);
    }

    public void calcularSaldo() {
        double saldo = 0;
        for (Transacao t : transacoes) {
            saldo += (t instanceof Receita) ? t.getValor() : -t.getValor();
        }
        Log.i(TAG, "-> Saldo Atual: R$" + saldo);
    }

    public void listarTransacoes() {
        for (Transacao t : transacoes) {
            t.exibirDetalhes();
        }
    }

    public void transacoesParaRevisao() {
        Log.i(TAG, "---TRANSAÇÕES QUE PRECISAM DE REVISÃO:");
        for (Transacao t : transacoes) {
            if (t.precisaRevisao()) {
                t.exibirDetalhes();
            }
        }
    }
}

