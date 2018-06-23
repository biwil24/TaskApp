package di.edu.itla.taskapp.vista;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.print.PrinterId;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import di.edu.itla.taskapp.ConexionSqliteHelper;
import di.edu.itla.taskapp.R;
import di.edu.itla.taskapp.entidad.Categoria;
import di.edu.itla.taskapp.entidad.Utilidades;
import di.edu.itla.taskapp.repositorio.CategoriaRepositorio;
import di.edu.itla.taskapp.repositorio.db.CategoriaRepositorioImp;

public class CategoriaActivity extends AppCompatActivity {

    EditText txt_nombre;
    private CategoriaRepositorio categoriaRepositorio;
    private static final String LOG_TAG="CategoriaActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria);

        categoriaRepositorio = new CategoriaRepositorioImp(this);
        txt_nombre = (EditText)findViewById(R.id.txtNombreCategoria);
        Button btn = (Button)findViewById(R.id.btn_agregar);
        Button btnLimpiar = (Button)findViewById(R.id.btnLimpiar);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //RegistrarCategoria();
                //
                Categoria categoria = new Categoria();
                categoria.setNombre(txt_nombre.getText().toString());

                categoriaRepositorio.guardar(categoria);

                Log.i(LOG_TAG,categoria.toString());
                Toast.makeText(getApplicationContext(),"La categoria: "+ categoria.getNombre().toString() + " Se creo con exito!",Toast.LENGTH_SHORT).show();
            }
        });


        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        txt_nombre.setText("");
            }
        });

    }



}
