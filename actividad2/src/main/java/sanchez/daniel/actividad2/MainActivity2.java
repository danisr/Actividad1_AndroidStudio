package sanchez.daniel.actividad2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    public EditText txtTApp;
    public EditText txtTFueraApp;
    public long tArranque;
    public long tDentro;
    public long tFuera;
    public String sTDentro;
    public String sTFuera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtTApp=(EditText)this.findViewById(R.id.txtTApp); // Inicializar los txt
        txtTFueraApp=(EditText)this.findViewById(R.id.txtTFueraApp);

        txtTApp.setText("0");
        txtTFueraApp.setText("0");

        tArranque = System.currentTimeMillis(); // Tiempo Arranque de la Aplicación
    }

    protected void onPause() {
        super.onPause();
        tDentro = System.currentTimeMillis(); // Tiempo Dentro de la Aplicación
    }

    protected void onResume() {
        super.onResume();
        tFuera = System.currentTimeMillis(); // Tiempo Fuera de la Aplicación

        sTDentro =  tDentro - tArranque + "";
        sTFuera = tFuera - tDentro + "";
        txtTApp.setText((tDentro - tArranque) / 1000 + "," + sTDentro.substring(2) + " segundos");
        txtTFueraApp.setText((tFuera - tDentro) / 1000 + "," + sTFuera.substring(2) + " segundos");
    }
}