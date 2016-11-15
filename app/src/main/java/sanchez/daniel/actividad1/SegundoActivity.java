package sanchez.daniel.actividad1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SegundoActivity extends AppCompatActivity {
    SegundoActivityController segundoActivityController;
    public Button btnPerfil;
    public Button btnAnterior;
    public Button btnSiguiente;
    public EditText txtTitulo;
    public EditText txtTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        btnPerfil=(Button)this.findViewById(R.id.btnPerfil); //Crear instancia, encuentra vista a partir de su id
        btnAnterior=(Button)this.findViewById(R.id.btnAnterior);
        btnSiguiente=(Button)this.findViewById(R.id.btnSiguiente);
        txtTitulo=(EditText)this.findViewById(R.id.txtTitulo);
        txtTexto=(EditText)this.findViewById(R.id.txtTexto);
        segundoActivityController = new SegundoActivityController(this); //Se crea aquí xq en el constructor del controller se usan txtTitulo y txtTexto
        btnPerfil.setOnClickListener(segundoActivityController); // Los Listener tienen que estar después del new del controlador
        btnSiguiente.setOnClickListener(segundoActivityController);
        btnAnterior.setOnClickListener(segundoActivityController);
    }
}