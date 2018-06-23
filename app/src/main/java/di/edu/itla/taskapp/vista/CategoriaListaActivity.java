package di.edu.itla.taskapp.vista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.List;

import di.edu.itla.taskapp.R;
import di.edu.itla.taskapp.entidad.Categoria;
import di.edu.itla.taskapp.repositorio.CategoriaRepositorio;
import di.edu.itla.taskapp.repositorio.db.CategoriaRepositorioImp;

public class CategoriaListaActivity extends AppCompatActivity {
    private static final String LOG_TAG="CategoriaListaActivity";
private CategoriaRepositorio categoriaRepositorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria_lista);
        categoriaRepositorio = new CategoriaRepositorioImp(this);
        List<Categoria> categorias = categoriaRepositorio.buscar(null);
        Log.i(LOG_TAG,"Total categoria :" + categorias.size());
        ListView catListView = findViewById(R.id.categoria_listview);
        catListView.setAdapter(new CategoriaListAdapter(this,categorias));
        }
    }

