package com.example.gaby.turistear;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> categorias= new ArrayList<String>();
    private Button mapa;
    private Button cargar;
    private Button verBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargar  = (Button)findViewById(R.id.cargar);
        //final BD miBaseDatos = new BD(getApplicationContext());
        final AyudaBD ayudabd = new AyudaBD(getApplicationContext());

        cargar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SQLiteDatabase db = ayudabd.getWritableDatabase();
                ContentValues valores = new ContentValues();
                valores.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Aeropuerto");
                valores.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Aeropuerto Mariscal La Mar");
                valores.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8894554070132226");
                valores.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-78.98441254890442");

                Long IdGuardado = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores);
                //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado, Toast.LENGTH_LONG).show();

                ContentValues valores1 = new ContentValues();
                valores1.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Banco");
                valores1.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Cooperativa de Ahorro y Credito Policia Nacional");
                valores1.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9006728222962397");
                valores1.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00440305269241");

                Long IdGuardado1 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores1);
               // Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado1, Toast.LENGTH_LONG).show();

                ContentValues valores2 = new ContentValues();
                valores2.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Banco");
                valores2.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Cooperativa Caja");
                valores2.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.891172515868096");
                valores2.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-78.98446820474148");

                Long IdGuardado2 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores2);
                //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado2, Toast.LENGTH_LONG).show();

                ContentValues valores3 = new ContentValues();
                valores3.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Banco");
                valores3.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Mutualista Pichincha");
                valores3.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8991124362563534");
                valores3.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00311425126075");

                Long IdGuardado3 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores3);
                //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado3, Toast.LENGTH_LONG).show();

                ContentValues valores4 = new ContentValues();
                valores4.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Banco");
                valores4.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Banco del Pacifico");
                valores4.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8990280548040195");
                valores4.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00382235444069");

                Long IdGuardado4 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores4);
                //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado4, Toast.LENGTH_LONG).show();

                ContentValues valores5 = new ContentValues();
                valores5.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Banco");
                valores5.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Banco Solidario");
                valores5.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8993977258819577");
                valores5.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00426760113716");

                Long IdGuardado5 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores5);
                //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado5, Toast.LENGTH_LONG).show();

                ContentValues valores6 = new ContentValues();
                valores6.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Banco");
                valores6.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Cooperativa de Ahorro y Credito 29 de Octubre");
                valores6.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.898353002958717");
                valores6.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00422602689743");

                Long IdGuardado6 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores6);
                //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado6, Toast.LENGTH_LONG).show();

                ContentValues valores7 = new ContentValues();
                valores7.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Banco");
                valores7.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "BanEcuador");
                valores7.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.898067713069712");
                valores7.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00428503549576");

                Long IdGuardado7 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores7);
                //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado7, Toast.LENGTH_LONG).show();

                ContentValues valores8 = new ContentValues();
                valores8.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Banco");
                valores8.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Banco del Austro");
                valores8.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.898300766787237");
                valores8.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00318801200866");

                Long IdGuardado8 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores8);
                //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado8, Toast.LENGTH_LONG).show();

                ContentValues valores9 = new ContentValues();
                valores9.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Banco");
                valores9.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Cajero Automatico Banco del Austro");
                valores9.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.898295409231054");
                valores9.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00313705003738");

                Long IdGuardado9 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores9);
                //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado9, Toast.LENGTH_LONG).show();

                ContentValues valores10 = new ContentValues();
                valores10.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Banco");
                valores10.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Banco Bolivariano");
                valores10.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.898036907114963");
                valores10.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00298282301902");

                Long IdGuardado10 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores10);
                //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado10, Toast.LENGTH_LONG).show();

                ContentValues valores11 = new ContentValues();
                valores11.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Banco");
                valores11.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Banco de Guayaquil");
                valores11.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8984480995724105");
                valores11.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.002797750597");

                Long IdGuardado11 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores11);
                //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado11, Toast.LENGTH_LONG).show();

                ContentValues valores12 = new ContentValues();
                valores12.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Banco");
                valores12.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Cooperativa JEP");
                valores12.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.897144873452682");
                valores12.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00656491315841");

                Long IdGuardado12 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores12);
                //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado12, Toast.LENGTH_LONG).show();

                ContentValues valores13 = new ContentValues();
                valores13.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Banco");
                valores13.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Jardin Azuayo");
                valores13.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8962367663898654");
                valores13.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00477319753647");

                Long IdGuardado13 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores13);
                //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado13, Toast.LENGTH_LONG).show();

                ContentValues valores14 = new ContentValues();
                valores14.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Banco");
                valores14.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Banco del Austro 2");
                valores14.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8961242574995154");
                valores14.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00382101333618");

                Long IdGuardado14 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores14);
                //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado14, Toast.LENGTH_LONG).show();

                ContentValues valores15 = new ContentValues();
                valores15.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Banco");
                valores15.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Produbanco");
                valores15.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8975065088058978");
                valores15.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00172889030456");

                Long IdGuardado15 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores15);
               // Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado15, Toast.LENGTH_LONG).show();

                ContentValues valores16 = new ContentValues();
                valores16.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Banco");
                valores16.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Automatic Machine Cash");
                valores16.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8973397547407123");
                valores16.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00205544925213");

                Long IdGuardado16 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores16);
                //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado16, Toast.LENGTH_LONG).show();

                ContentValues valores17 = new ContentValues();
                valores17.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Banco");
                valores17.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Banco del Pacifico 2");
                valores17.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8998330268152426");
                valores17.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00939397311687");

                Long IdGuardado17 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores17);
                //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado17, Toast.LENGTH_LONG).show();

                ContentValues valores18 = new ContentValues();
                valores18.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
                valores18.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Pecado Morlaco");
                valores18.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9005088422412313");
                valores18.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00556227657813");

                Long IdGuardado18 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores18);
                //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado18, Toast.LENGTH_LONG).show();

                ContentValues valores19 = new ContentValues();
                valores19.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
                valores19.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Dubai");
                valores19.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9010887964162477");
                valores19.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00545364711303");

                Long IdGuardado19 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores19);
                //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado19, Toast.LENGTH_LONG).show();

                ContentValues valores20 = new ContentValues();
                valores20.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
                valores20.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Dubai");
                valores20.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9010887964162477");
                valores20.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00545364711303");

                Long IdGuardado20 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores20);
                //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado20, Toast.LENGTH_LONG).show();

                ContentValues valores21 = new ContentValues();
                valores21.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
                valores21.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "La Jaula Bar-Discoteca");
                valores21.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.90118121402867");
                valores21.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00548181030769");

                Long IdGuardado21 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores21);
                //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado21, Toast.LENGTH_LONG).show();

                ContentValues valores22 = new ContentValues();
                valores22.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
                valores22.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Sportbar 360");
                valores22.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9012937224161996");
                valores22.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00561860296744");

                Long IdGuardado22 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores22);

                ContentValues valores23 = new ContentValues();
                valores23.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
                valores23.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Bar-Karaoke Indian Bapu");
                valores23.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9014865939116254");
                valores23.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.0051237354042");

                Long IdGuardado23 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores23);

                ContentValues valores24 = new ContentValues();
                valores24.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
                valores24.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Inca Bar and Lounge");
                valores24.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.901826797719199");
                valores24.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00509154889602");

                Long IdGuardado24 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores24);

                ContentValues valores25 = new ContentValues();
                valores25.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
                valores25.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Rumy Lounge");
                valores25.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.902011632815816");
                valores25.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00500303599853");

                Long IdGuardado25 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores25);

                ContentValues valores26 = new ContentValues();
                valores26.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
                valores26.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Tic Tic Bar");
                valores26.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9015388299359843");
                valores26.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00440020952243");

                Long IdGuardado26 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores26);

                ContentValues valores27 = new ContentValues();
                valores27.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
                valores27.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Persi Pipa Bar");
                valores27.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9015950841133504");
                valores27.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00437472853679");

                Long IdGuardado27 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores27);

                ContentValues valores28 = new ContentValues();
                valores28.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
                valores28.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Amorfino Amor");
                valores28.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9006481384212663");
                valores28.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00461679790038");

                Long IdGuardado28 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores28);

                ContentValues valores29 = new ContentValues();
                valores29.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
                valores29.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Verde Pinton y Maduro");
                valores29.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.900846367570951");
                valores29.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00372764561195");

                Long IdGuardado29 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores29);

                ContentValues valores30 = new ContentValues();
                valores30.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
                valores30.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Plazma Bar Cuenca");
                valores30.put(AyudaBD.DatosTabla.COLUMNA_LAT, "2.9017390680069677");
                valores30.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00405822787303");

                Long IdGuardado30 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores30);

                ContentValues valores31 = new ContentValues();
                valores31.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
                valores31.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Discoteca Nidia Fuzzion Party");
                valores31.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9019948905075843");
                valores31.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00376586709041");

                Long IdGuardado31 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores31);

                ContentValues valores32 = new ContentValues();
                valores32.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
                valores32.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Karma Lounge Bar-2.9022493735659283");
                valores32.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9022493735659283");
                valores32.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00283111724872");

                Long IdGuardado32 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores32);

                ContentValues valores33 = new ContentValues();
                valores33.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
                valores33.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "La Parola Bar-Restaurante");
                valores33.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.902602970983454");
                valores33.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00294846389312");

                Long IdGuardado33 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores33);

                ContentValues valores34 = new ContentValues();
                valores34.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
                valores34.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Garaje 87");
                valores34.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9000350341927272");
                valores34.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.01585089508313");

                Long IdGuardado34 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores34);

                ContentValues valores35 = new ContentValues();
                valores35.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
                valores35.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Laos Discoteca");
                valores35.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9052264862447137");
                valores35.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00199996773023");

                Long IdGuardado35 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores35);
                Toast.makeText(getApplicationContext(), "Base de Datos Creada", Toast.LENGTH_LONG).show();

            }
        });
        //Toast.makeText(getApplicationContext(), "Base de Datos Creada", Toast.LENGTH_LONG).show();

        //PARA EL MAPA
        mapa=(Button)findViewById(R.id.mapa);
        mapa.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0){
                finSeleccionar();
                Intent inten = new Intent(MainActivity.this,MapsActivity.class);
                startActivity(inten);

            }
        });

        //PARA VER LA BASE DE DATOS
        verBase=(Button)findViewById(R.id.verTabla);
        verBase.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0){
                Intent inten = new Intent(MainActivity.this,ver_base.class);
                startActivity(inten);
            }
        });

    }

    public void seleccionar(View view){

        boolean checked=((CheckBox) view).isChecked();
        switch (view.getId()){

            case R.id.aeropuerto:
                if(checked) {
                    categorias.add("aeropuerto");
                }else{
                    categorias.remove("aeropuerto");
                }
                break;
            case R.id.bancos:
                if(checked) {
                    categorias.add("banco");
                }else{
                    categorias.remove("banco");
                }
                break;
            case R.id.bares:
                if(checked) {
                    categorias.add("bar");
                }else{
                    categorias.remove("bar");
                }
                break;
            case R.id.cementerios:
                if(checked) {
                    categorias.add("cementerio");
                }else{
                    categorias.remove("cementerio");
                }
                break;
            case R.id.cines:
                if(checked) {
                    categorias.add("cine");
                }else{
                    categorias.remove("cine");
                }
                break;
            case R.id.farmacias:
                if(checked) {
                    categorias.add("farmacia");
                }else{
                    categorias.remove("farmacia");
                }
                break;
            case R.id.hospitales:
                if(checked) {
                    categorias.add("hospital");
                }else{
                    categorias.remove("hospital");
                }
                break;
            case R.id.hoteles:
                if(checked) {
                    categorias.add("hotel");
                }else{
                    categorias.remove("hotel");
                }
                break;
            case R.id.museos:
                if(checked) {
                    categorias.add("museo");
                }else{
                    categorias.remove("museo");
                }
                break;
            case R.id.parquesPublicos:
                if(checked) {
                    categorias.add("parquePublico");
                }else{
                    categorias.remove("parquePublico");
                }
                break;
            case R.id.restaurantes:
                if(checked) {
                    categorias.add("restaurante");
                }else{
                    categorias.remove("restaurante");
                }
                break;
            case R.id.teatros:
                if(checked) {
                    categorias.add("teatro");
                }else{
                    categorias.remove("teatro");
                }
                break;
            case R.id.universidades:
                if(checked) {
                    categorias.add("universidad");
                }else{
                    categorias.remove("universidad");
                }
                break;
        }
    }

    public void finSeleccionar(){

        String array="";
        for(String Categorias: categorias ){
            array=array+Categorias+"\n";
        }
    }

    public void cargarBaseDatos(SQLiteDatabase db){

        String latitud, longitud, nombre;
        String[] args = new String[] {"Aeropuerto Mariscal La Mar"};
        Cursor c = db.rawQuery("select * from tabla",null);
        int cont=c.getCount();
        Toast.makeText(getApplicationContext(), "hay "+cont, Toast.LENGTH_LONG).show();
        if(c.moveToFirst()){
            do{
                String linea = c.getString(0)+" "+c.getString(1)+" ";
                Toast.makeText(getApplicationContext(), ""+linea, Toast.LENGTH_LONG).show();
            }while(c.moveToNext());
        }

    }


}