package com.example.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarPedra(View view){

        this.opcaoSelecionada("pedra");
    }
    public void selecionarTesoura(View view){
        this.opcaoSelecionada("tesoura");
    }
    public void selecionarPapel(View view){

        this.opcaoSelecionada("papel");
    }

    public void opcaoSelecionada(String opcaoSelecionada){
        System.out.println(opcaoSelecionada);

        ImageView imageResult=findViewById( R.id.resultado );
        TextView textoResultado= findViewById( R.id.textoGanhador );
        int valor =new Random().nextInt(3);
        String[] opcoes={"pedra","papel","tesoura"};
        String opcaoApp=opcoes[valor];



        switch (opcaoApp){
            case"pedra":
                imageResult.setImageResource(R.drawable.pedra);
                System.out.println("alaaa");
                break;
            case"tesoura":
                imageResult.setImageResource( R.drawable.tesoura );
                break;
            case"papel":
                imageResult.setImageResource( R.drawable.papel );
                break;
        }

        if(
            opcaoApp=="tesoura"&& opcaoSelecionada=="papel"||
            opcaoApp=="papel"&&opcaoSelecionada=="pedra"||
            opcaoApp=="pedra"&&opcaoSelecionada=="tesoura"
        )
        {//ganhador foi o app
            textoResultado.setText("APLICATIVO GANHADOR");
        }
        else if(opcaoApp==opcaoSelecionada){
            textoResultado.setText("EMPATE");
        }
        else{
            textoResultado.setText("JOGADOR GANHADOR");
        }

        System.out.println("a:"+opcaoApp);
    }

}
