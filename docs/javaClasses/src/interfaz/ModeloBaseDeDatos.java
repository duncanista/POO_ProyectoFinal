package interfaz;
// Interfaz del modelo de la base de datos
public interface ModeloBaseDeDatos {
    // Declaración de los métodos ocupados por las clases que obtienen datos
    public abstract Object[][] get();
    public abstract boolean delete(String id);
}
