package com.example.inspiron3647.calculadoratecnologico;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView TvDisplay;
    double n1,n2, resultado;
    String Operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void B0 (View View)

        {
           TvDisplay = (TextView) findViewById(R.id.TvDisplay);
            TvDisplay.setText(TvDisplay.getText() + "0");
        }

    public void B1 (View View)

    {
        TvDisplay = (TextView) findViewById(R.id.TvDisplay);
        TvDisplay.setText(TvDisplay.getText() + "1");
    }

    public void B2 (View View)

    {
        TvDisplay = (TextView) findViewById(R.id.TvDisplay);
        TvDisplay.setText(TvDisplay.getText() + "2");
    }


    public void B3 (View View)

    {
        TvDisplay = (TextView) findViewById(R.id.TvDisplay);
        TvDisplay.setText(TvDisplay.getText() + "3");
    }


    public void B4 (View View)

    {
        TvDisplay = (TextView) findViewById(R.id.TvDisplay);
        TvDisplay.setText(TvDisplay.getText() + "4");
    }


    public void B5 (View View)

    {
        TvDisplay = (TextView) findViewById(R.id.TvDisplay);
        TvDisplay.setText(TvDisplay.getText() + "5");
    }

    public void B6 (View View)

    {
        TvDisplay = (TextView) findViewById(R.id.TvDisplay);
        TvDisplay.setText(TvDisplay.getText() + "6");
    }

    public void B7 (View View)

    {
        TvDisplay = (TextView) findViewById(R.id.TvDisplay);
        TvDisplay.setText(TvDisplay.getText() + "7");
    }

    public void B8 (View View)

    {
        TvDisplay = (TextView) findViewById(R.id.TvDisplay);
        TvDisplay.setText(TvDisplay.getText() + "8");
    }

    public void B9 (View View)

    {
        TvDisplay = (TextView) findViewById(R.id.TvDisplay);
        TvDisplay.setText(TvDisplay.getText() + "9");
    }


    public void BPunto (View View)

    {
        TvDisplay = (TextView) findViewById(R.id.TvDisplay);
        TvDisplay.setText(TvDisplay.getText() + ".");
    }

    public void onClickOperacionCapturaNumero1 (View View)
    {
        TvDisplay = (TextView) findViewById(R.id.TvDisplay);
        n1 = Double.parseDouble(TvDisplay.getText().toString());
        TvDisplay.setText("");
    }

    public void Suma (View View)

    {
        Operador = "+";
        onClickOperacionCapturaNumero1(View);
    }

    public void Resta (View View)

    {
        Operador = "-";
        onClickOperacionCapturaNumero1(View);
    }

    public void Multiplicacion (View View)

    {
        Operador = "*";
        onClickOperacionCapturaNumero1(View);
    }

    public void BIgual (View View)

    {
        TvDisplay = (TextView) findViewById(R.id.TvDisplay);
        n2 = Double.parseDouble(TvDisplay.getText().toString());

        if (Operador.equals("+"))
        {
            resultado = n1 + n2;
        }else if (Operador.equals("-"))
        {
            resultado = n1 - n2;
        }else if (Operador.equals("*"))

        TvDisplay.setText("" + resultado);
    }


}
