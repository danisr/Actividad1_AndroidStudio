package sanchez.daniel.actividad1;

import android.content.Intent;
import android.provider.ContactsContract;
import android.view.View;

/**
 * Created by daniel.rodriguez on 09/11/2016.
 */
public class SegundoActivityController implements View.OnClickListener, View.OnFocusChangeListener {
    SegundoActivity vistaSegunda;
    MainActivity vista;

    public SegundoActivityController (SegundoActivity vistaSegunda) { //Constructor
        this.vistaSegunda = vistaSegunda;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == vistaSegunda.btnPerfil.getId()) { //Detectar que boton ha sido presionado
            Intent intent = new Intent(vistaSegunda, MainActivity.class);
            vistaSegunda.startActivity(intent);
            //vista.txtNombre = DataHolder.sNombre;


        }
    }

    @Override
    public void onFocusChange(View view, boolean b) {

    }
}
