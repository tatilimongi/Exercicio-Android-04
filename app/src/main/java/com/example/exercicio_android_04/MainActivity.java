package com.example.exercicio_android_04;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        GerenciadorFinancas gerenciador = new GerenciadorFinancas();

        Receita salario = new Receita(5000, "Salário Mensal");
        Receita bonus = new Receita(1200, "Bônus por desempenho");
        Despesa aluguel = new Despesa(1800, "Pagamento do Aluguel");
        Despesa compra = new Despesa(200, "Compras no Mercado");

        gerenciador.adicionarTransacao(salario);
        gerenciador.adicionarTransacao(bonus);
        gerenciador.adicionarTransacao(aluguel);
        gerenciador.adicionarTransacao(compra);

        Log.i(TAG, "---LISTA DE TRANSAÇÕES:");
        gerenciador.listarTransacoes();
        gerenciador.calcularSaldo();
        gerenciador.transacoesParaRevisao();
    }
}