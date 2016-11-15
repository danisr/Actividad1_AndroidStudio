package sanchez.daniel.actividad1;

import android.content.Intent;
import android.view.View;

/**
 * Created by daniel.rodriguez on 09/11/2016.
 */
public class SegundoActivityController implements View.OnClickListener, View.OnFocusChangeListener {
    SegundoActivity vistaSegunda;
    String [] titulos;
    String [] textos;
    int i = 0;

    public SegundoActivityController (SegundoActivity vistaSegunda) { //Constructor
        this.vistaSegunda = vistaSegunda;
        //String tit1 = vistaSegunda.getResources().getString(R.string.titulo1); // Para guardar en una variable en vez de en array
        titulos = new String[] {
            vistaSegunda.getResources().getString(R.string.titulo1),
            vistaSegunda.getResources().getString(R.string.titulo2),
            vistaSegunda.getResources().getString(R.string.titulo3),
            vistaSegunda.getResources().getString(R.string.titulo4)
        };
        textos = new String[] {
            vistaSegunda.getResources().getString(R.string.texto1),
            vistaSegunda.getResources().getString(R.string.texto2),
            vistaSegunda.getResources().getString(R.string.texto3),
            vistaSegunda.getResources().getString(R.string.texto4),
        };
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == vistaSegunda.btnPerfil.getId()) { //Detectar que boton ha sido presionado
            Intent intent = new Intent(vistaSegunda, MainActivity.class);
            vistaSegunda.startActivity(intent);
            vistaSegunda.finish(); //Mata la vista SegundoActivity
        } else if (view.getId() == vistaSegunda.btnSiguiente.getId()) { // botón Siguiente
            vistaSegunda.txtTitulo.setText(titulos[i]);
            vistaSegunda.txtTexto.setText(textos[i]);
            i++;
            if (i == titulos.length) {
                i = 0;
            }
        } else if (view.getId() == vistaSegunda.btnAnterior.getId()) { // botón Anterior
            vistaSegunda.txtTitulo.setText(titulos[i]);
            vistaSegunda.txtTexto.setText(textos[i]);
            if (i == 0) {
                i = titulos.length;
            }
            i--;
        }
    }

    @Override
    public void onFocusChange(View view, boolean b) {
    }
}