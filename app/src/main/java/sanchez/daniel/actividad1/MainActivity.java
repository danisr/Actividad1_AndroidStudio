package sanchez.daniel.actividad1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public Button btnEditar;
    public Button btnVolver;
    public EditText txtNombre;
    public EditText txtEmail;
    public EditText txtTelefono;
    public EditText txtDireccion;
    MainActivityController mainActivityController; //Comunicarse con el controller

    @Override
    protected void onCreate(Bundle savedInstanceState) { //Main
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Se conectan controlador con vista
        mainActivityController = new MainActivityController(this);

        btnEditar=(Button)this.findViewById(R.id.btnEditar); //Crear instancia, encuentra vista a partir de su id
        btnEditar.setOnClickListener(mainActivityController);
        btnVolver=(Button)this.findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(mainActivityController);
        txtNombre=(EditText)this.findViewById(R.id.txtNombre);
        txtEmail=(EditText)this.findViewById(R.id.txtEmail);
        txtTelefono=(EditText)this.findViewById(R.id.txtTelefono);
        txtDireccion=(EditText)this.findViewById(R.id.txtDireccion);

        // Para que los txt carguen la información de las variables (la 1ª vez lo cargan en blanco xq están vacíos pero a la 2ª vez ya los carga con la información)
        txtNombre.setText(DataHolder.sNombre);
        txtEmail.setText(DataHolder.sEmail);
        txtTelefono.setText(DataHolder.sTelefono);
        txtDireccion.setText(DataHolder.sDireccion);
    }


    /*protected void onPause() {
        super.onPause();
    }
    protected void onResume() {
        super.onResume();
    }
    protected void onDestroy() {
        super.onDestroy();
    }*/
}