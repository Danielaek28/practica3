package com.example.practica3dani;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class adaptador extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] nombres;
    private final String[] precios;

    private final int Idimagen;

    public adaptador(MainActivity context, String[] nombres, String[] precios, int[] idimagen) {
        super(context, R.layout.item, nombres);
        this.context = context;
        this.nombres = nombres;
        this.precios = precios;
        this.idimagen = idimagen;
    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View view, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        view rowView = inflater.inflante(R.layout.item, null);
        TextView _nombres = (TextView) rowView.findViewByid(R.id.nombres);
        TextView _precios = (TextView) rowView.findViewByid(R.id.precios);
        int _idimagen = (ImageView) rowView.findViewByid(R.id.idimagen);
        _nombres.setText(nombres[position]);
        _precios.setText(precios[position]);
        _idimagen.setImagenResource(idimagen[position]);


        public String nombres() {
            return nombres;
        }

        public String precios() {
            return precios;
        }

        public int idimagen() {
            return idimagen;
        }
    }
        }


