package di.edu.itla.taskapp.entidad;

public class Utilidades {
    public  static final String TABLA_CATEGORIA = "categoria";
    public  static final String CAMPO_ID = "id";
    public  static final String CAMPO_DESCRIPCION = "descripcion";
    public static final String CREAR_TABLA_CATEGORIA = "CREATE TABLE "+ TABLA_CATEGORIA +" ("+CAMPO_ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"+ CAMPO_DESCRIPCION+" TEXT)";

}
