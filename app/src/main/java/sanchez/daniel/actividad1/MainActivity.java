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
    MainActivityControlller mainActivityControlller; //Comunicarse con el controller

    @Override
    protected void onCreate(Bundle savedInstanceState) { //Main
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Se conectan controlador con vista
        mainActivityControlller = new MainActivityControlller(this);

        btnEditar=(Button)this.findViewById(R.id.btnEditar); //Crear instancia, encuentra vista a partir de su id
        btnEditar.setOnClickListener(mainActivityControlller);
        btnVolver=(Button)this.findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(mainActivityControlller);
        txtNombre=(EditText)this.findViewById(R.id.txtNombre);
        txtEmail=(EditText)this.findViewById(R.id.txtEmail);
        txtTelefono=(EditText)this.findViewById(R.id.txtTelefono);
        txtDireccion=(EditText)this.findViewById(R.id.txtDireccion);
    }
}