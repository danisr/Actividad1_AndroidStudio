package sanchez.daniel.actividad1;

import android.content.Intent;
import android.provider.ContactsContract;
import android.view.View;

/**
 * Created by daniel.rodriguez on 08/11/2016.
 */
public class MainActivityControlller implements View.OnClickListener, View.OnFocusChangeListener {//Para gestionar todos los eventos del MainActivity
    MainActivity vista;//MainActivity

    public MainActivityControlller(MainActivity vista) {//Constructor
        this.vista = vista;//Pasar referencia a la Vista
    }

    @Override
    public void onClick(View bntPulsado) {
        if (bntPulsado.getId() == R.id.btnEditar) {//Detectar que boton ha sido presionado
            vista.btnVolver.setText("Cancelar");
            vista.btnEditar.setText("Guardar");
            vista.txtNombre.setEnabled(true);
            vista.txtEmail.setEnabled(true);
            vista.txtTelefono.setEnabled(true);
            vista.txtDireccion.setEnabled(true);
        } else if (bntPulsado.getId() == R.id.btnVolver) {
            Intent intent = new Intent(vista, SegundoActivity.class);
            vista.startActivity(intent);
        }
        //Se guardan en variables todos los txt cuando se presiona el btn guardar
        if (vista.btnEditar.getText() == "Guardar" && vista.btnEditar.isFocusable() == true) {
            DataHolder.sNombre = vista.txtNombre.getText().toString();
            DataHolder.sEmail = vista.txtEmail.getText().toString();
            DataHolder.iTelefono = Integer.parseInt(vista.txtTelefono.getText().toString());
            DataHolder.sDireccion = vista.txtDireccion.getText().toString();
        }
        

    }

    @Override
    public void onFocusChange(View view, boolean b) {

    }
}