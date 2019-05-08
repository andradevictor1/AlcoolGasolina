package br.com.alcoolgasolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button btnCalcular;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //recuperar dos itens
        precoAlcool = (EditText)  findViewById(R.id.edPrecoAlcool);
        precoGasolina = (EditText) findViewById(R.id.edPrecoGasolina);
        btnCalcular = (Button) findViewById(R.id.button);
        resultado = (TextView) findViewById(R.id.tvResultado);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txtPrecoAlcool = precoAlcool.getText().toString();
                String txtPrecoGasoina = precoGasolina.getText().toString();


                //conversão para numeros

               
                Double valorAlcool = Double.parseDouble(txtPrecoAlcool);
                Double valorGasolina = Double.parseDouble(txtPrecoGasoina);

                double res = valorAlcool / valorGasolina;

                if (res <= 0.7){
                    resultado.setText("É melhor usar o alcool");
                }else{
                    resultado.setText("É melhor usar Gasolina");
                }
            }
        });
    }
}
