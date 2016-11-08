package sanchez.daniel.actividad1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    public Button btnVolver;
    public Button btnEditar;
    public EditText txtNombre;
    public EditText txtEmail;

    //public Button btnHolaMundo;
    //public TextView txtHolaMundo;
    MainActivityControlller mainActivityControlller; //Comunicarse con el controller

    @Override
    protected void onCreate(Bundle savedInstanceState) { //Main
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Se conectan controlador con vista
        mainActivityControlller = new MainActivityControlller(this);

        /*btnHolaMundo=(Button)this.findViewById(R.id.btnEditar);
        btnHolaMundo.setOnClickListener(mainActivityControlller);
        txtHolaMundo=(TextView)this.findViewById(R.id.lblNombre);*/

        btnVolver.setOnClickListener(mainActivityControlller);
        btnVolver=(Button)this.findViewById(R.id.btnVolver);
        btnEditar=(Button)this.findViewById(R.id.btnEditar);
        txtNombre=(EditText)this.findViewById(R.id.txtNombre);
        txtEmail=(EditText)this.findViewById(R.id.txtEmail);
    }
}