package com.example.moneda;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    private EditText txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        txt = (EditText) findViewById(R.id.cantidad);
    }
    public void manager(View view){

        switch (view.getId()){
            case R.id.btnConvert:
                RadioButton dolarBtn = (RadioButton) findViewById(R.id.radio0);
                RadioButton solesBtn = (RadioButton) findViewById(R.id.radio1);
                if(txt.getText().length()==0){
                    Toast.makeText(this,"Ingresa una cantidad mayor a 0",
                    Toast.LENGTH_LONG).show();
                    return;
                }
                float inputValue = Float.parseFloat(txt.getText().toString());
                if(dolarBtn.isChecked()){
                    txt.setText(String.valueOf(Dolar_A_Soles(inputValue)));
                    dolarBtn.setChecked(false);
                    solesBtn.setChecked(true);
                }
                else{
                    txt.setText(String.valueOf(Soles_A_Dolar(inputValue)));
                    solesBtn.setChecked(false);
                    dolarBtn.setChecked(true);
                }
                break;
        }
    }
    public double Soles_A_Dolar(float soles){
        return (soles/3.8);
    }
    public double Dolar_A_Soles(float dolar){
        return  (dolar*3.8);
    }

}
