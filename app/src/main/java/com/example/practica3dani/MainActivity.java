package com.example.practica3dani;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
public class MainActivity extends AppCompatActivity {

 private ListView listView;
 @Override
protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);
  listView = (ListView) findViewById(R.id.list);
  String[] nombres = {"PERA", "UVA", "SANDIA", "MANGO", "FRESA"};
  String[] precios = {"20", "80", "50", "30", "90"};
  int[] idimagen = {R.drawable.pera, R.drawable.uva, R.drawable.sandia, R.drawable.mango, R.drawable.fresa};
  adaptador adapter = new adaptador(this, nombres, precios, idimagen);
  listView.setAdapter(adapter);

 }
}