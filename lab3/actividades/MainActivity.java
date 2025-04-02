package moviles.lab3;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String eti = "CicloDeVida";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Log.d(eti,"En el evento onCreate()");

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void onStart(){
        super.onStart();
        Log.d(eti,"En el evento onStart()");
    }
    public void onRestart(){
        super.onRestart();
        Log.d(eti,"En el evento OnRestart()");
    }
    public void onResume(){
        super.onResume();
        Log.d(eti,"En el evento onResume()");
    }
    public void onPause(){
        super.onPause();
        Log.d(eti,"En el evento onStop()");
    }
    public void onStop(){
        super.onStop();
        Log.d(eti,"En el evento onStop()");
    }
    public void onDestroy(){
        super.onDestroy();
        Log.d(eti,"En el evento onDestroy()");
    }
}
