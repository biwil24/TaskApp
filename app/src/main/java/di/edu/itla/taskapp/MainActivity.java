package di.edu.itla.taskapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import di.edu.itla.taskapp.vista.CategoriaActivity;
import di.edu.itla.taskapp.vista.CategoriaListaActivity;


public class MainActivity extends AppCompatActivity {

    private  static final String LOG_TAG = MainActivity.class.getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView btnCategoria = (TextView)findViewById(R.id.btnCategoria);
        TextView btnLogin = (TextView)findViewById(R.id.btnLogin);

        ConexionSqliteHelper conn = new ConexionSqliteHelper(this,"db_taskapp",null,2);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intt = new Intent(MainActivity.this, CategoriaListaActivity.class);
                    startActivity(intt);
            }
        });

        btnCategoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,  CategoriaActivity.class);
                startActivity(intent);
            }
        });

       // Categoria cat = new Categoria();
        //   cat.setDescripcion("CATEGORIA 1");
      //  cat.setId(2);

       // Log.i(LOG_TAG, cat.toString());
    }
}
