package sanchez.daniel.actividad1;

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
    public void onClick(View view) {
        //vista.txtHolaMundo.setText("HOLA MUNDO!!!");

        /*Intent intent = new Intent(vista, SegundoActivity.class);
        vista.startActivity(intent);*/

        if(view.getId() == vista.btnVolver.getId()) {//Detectar que boton ha sido presionado
            vista.btnVolver.setText("Cancelar");
            vista.btnEditar.setText("Guardar");
            vista.txtNombre.setEnabled(true);
            vista.txtEmail.setEnabled(true);
        } else {
            vista.txtNombre.setEnabled(false);
            vista.txtEmail.setEnabled(false);
        }
    }

    @Override
    public void onFocusChange(View view, boolean b) {

    }
}
