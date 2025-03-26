package com.example.moneda;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText txtCantidad;
    private Spinner spinnerMonedas;
    private TextView resultadoConversion;
    private String[] opcionesMoneda = {"Dólar", "Soles", "Euro", "Libra", "Rupia", "Real Brasileño", "Peso Mexicano", "Yuan", "Yen"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCantidad = findViewById(R.id.cantidad);
        spinnerMonedas = findViewById(R.id.spinnerMonedas);
        resultadoConversion = findViewById(R.id.resultadoConversion);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, opcionesMoneda);
        spinnerMonedas.setAdapter(adapter);

        spinnerMonedas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                mostrarConversiones(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

    public void mostrarOpciones(View view) {
        spinnerMonedas.setVisibility(View.VISIBLE);
    }

    private void mostrarConversiones(int monedaSeleccionada) {
        StringBuilder resultado = new StringBuilder();
        double cantidad;

        try {
            cantidad = Double.parseDouble(txtCantidad.getText().toString());
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Por favor, ingrese una cantidad válida", Toast.LENGTH_SHORT).show();
            return;
        }

        switch (monedaSeleccionada) {
            case 0: // Dólar
                resultado.append("Soles: ").append(cantidad * 3.8).append("\n");
                resultado.append("Euro: ").append(cantidad * 0.92).append("\n");
                resultado.append("Libra: ").append(cantidad * 0.81).append("\n");
                resultado.append("Rupia: ").append(cantidad * 83.0).append("\n");
                resultado.append("Real Brasileño: ").append(cantidad * 4.9).append("\n");
                resultado.append("Peso Mexicano: ").append(cantidad * 17.0).append("\n");
                resultado.append("Yuan: ").append(cantidad * 7.2).append("\n");
                resultado.append("Yen: ").append(cantidad * 146.0).append("\n");
                break;
            case 1: // Soles
                resultado.append("Dólar: ").append(cantidad / 3.8).append("\n");
                resultado.append("Euro: ").append(cantidad * 0.24).append("\n");
                resultado.append("Libra: ").append(cantidad * 0.21).append("\n");
                resultado.append("Rupia: ").append(cantidad * 21.8).append("\n");
                resultado.append("Real Brasileño: ").append(cantidad * 1.3).append("\n");
                resultado.append("Peso Mexicano: ").append(cantidad * 4.5).append("\n");
                resultado.append("Yuan: ").append(cantidad * 1.9).append("\n");
                resultado.append("Yen: ").append(cantidad * 38.4).append("\n");
                break;
            case 2: // Euro
                resultado.append("Dólar: ").append(cantidad * 1.09).append("\n");
                resultado.append("Soles: ").append(cantidad * 4.1).append("\n");
                resultado.append("Libra: ").append(cantidad * 0.88).append("\n");
                resultado.append("Rupia: ").append(cantidad * 90.5).append("\n");
                resultado.append("Real Brasileño: ").append(cantidad * 5.3).append("\n");
                resultado.append("Peso Mexicano: ").append(cantidad * 18.4).append("\n");
                resultado.append("Yuan: ").append(cantidad * 7.8).append("\n");
                resultado.append("Yen: ").append(cantidad * 159.0).append("\n");
                break;
            case 3: // Libra
                resultado.append("Dólar: ").append(cantidad * 1.23).append("\n");
                resultado.append("Soles: ").append(cantidad * 4.7).append("\n");
                resultado.append("Euro: ").append(cantidad * 1.14).append("\n");
                resultado.append("Rupia: ").append(cantidad * 101.0).append("\n");
                resultado.append("Real Brasileño: ").append(cantidad * 6.0).append("\n");
                resultado.append("Peso Mexicano: ").append(cantidad * 21.0).append("\n");
                resultado.append("Yuan: ").append(cantidad * 8.6).append("\n");
                resultado.append("Yen: ").append(cantidad * 180.0).append("\n");
                break;
            case 4: // Rupia
                resultado.append("Dólar: ").append(cantidad * 0.012).append("\n");
                resultado.append("Soles: ").append(cantidad * 0.046).append("\n");
                resultado.append("Euro: ").append(cantidad * 0.011).append("\n");
                resultado.append("Libra: ").append(cantidad * 0.009).append("\n");
                resultado.append("Real Brasileño: ").append(cantidad * 0.059).append("\n");
                resultado.append("Peso Mexicano: ").append(cantidad * 0.20).append("\n");
                resultado.append("Yuan: ").append(cantidad * 0.087).append("\n");
                resultado.append("Yen: ").append(cantidad * 1.78).append("\n");
                break;
            case 5: // Real Brasileño
                resultado.append("Dólar: ").append(cantidad * 0.19).append("\n");
                resultado.append("Soles: ").append(cantidad * 0.77).append("\n");
                resultado.append("Euro: ").append(cantidad * 0.18).append("\n");
                resultado.append("Libra: ").append(cantidad * 0.16).append("\n");
                resultado.append("Rupia: ").append(cantidad * 16.8).append("\n");
                resultado.append("Peso Mexicano: ").append(cantidad * 3.5).append("\n");
                resultado.append("Yuan: ").append(cantidad * 1.5).append("\n");
                resultado.append("Yen: ").append(cantidad * 29.7).append("\n");
                break;
            case 6: // Peso Mexicano
                resultado.append("Dólar: ").append(cantidad * 0.059).append("\n");
                resultado.append("Soles: ").append(cantidad * 0.22).append("\n");
                resultado.append("Euro: ").append(cantidad * 0.054).append("\n");
                resultado.append("Libra: ").append(cantidad * 0.047).append("\n");
                resultado.append("Rupia: ").append(cantidad * 5.6).append("\n");
                resultado.append("Real Brasileño: ").append(cantidad * 0.29).append("\n");
                resultado.append("Yuan: ").append(cantidad * 0.41).append("\n");
                resultado.append("Yen: ").append(cantidad * 8.4).append("\n");
                break;
            case 7: // Yuan
                resultado.append("Dólar: ").append(cantidad * 0.14).append("\n");
                resultado.append("Soles: ").append(cantidad * 0.54).append("\n");
                resultado.append("Euro: ").append(cantidad * 0.13).append("\n");
                resultado.append("Libra: ").append(cantidad * 0.11).append("\n");
                resultado.append("Rupia: ").append(cantidad * 10.0).append("\n");
                resultado.append("Real Brasileño: ").append(cantidad * 0.66).append("\n");
                resultado.append("Peso Mexicano: ").append(cantidad * 2.4).append("\n");
                resultado.append("Yen: ").append(cantidad * 19.8).append("\n");
                break;
            case 8: // Yen
                resultado.append("Dólar: ").append(cantidad * 0.0068).append("\n");
                resultado.append("Soles: ").append(cantidad * 0.026).append("\n");
                resultado.append("Euro: ").append(cantidad * 0.0063).append("\n");
                resultado.append("Libra: ").append(cantidad * 0.0055).append("\n");
                resultado.append("Rupia: ").append(cantidad * 0.56).append("\n");
                resultado.append("Real Brasileño: ").append(cantidad * 0.034).append("\n");
                resultado.append("Peso Mexicano: ").append(cantidad * 0.12).append("\n");
                resultado.append("Yuan: ").append(cantidad * 0.051).append("\n");
                break;
            default:
                resultado.append("No se encontró la conversión.\n");
        }



        resultadoConversion.setText(resultado.toString());
    }
}
