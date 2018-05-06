package interfaz;

import java.util.ArrayList;
import org.json.JSONObject;
// Clase Productos, especialmente diseñada para los mismos, que llama a la clase
// Query, la cual simplemente obtenemos todos los productos
public class Products implements ModeloBaseDeDatos{
    // Constructor
    public Products(){
    }
    // El método get, nos regresa todos los productos disponibles, en un arreglo
    // de arreglos de objetos
    public Object[][] get(){
        // Uso de la clase Query, que se comunica con el servidor
        Query a = new Query();
        // Declaración de un AdL de AdL que es como Query no lo regresa
        ArrayList<ArrayList<String>> users = a.getProducts();

        // Declaración del Arreglo de Arreglos a regresar
        Object[][] arrayOfArrays = new Object[users.size()][6];
        for (int i = 0; i < users.size(); i++) {
            ArrayList<String> row = users.get(i);
            // Obtenemos cada dato de la tupla previamente obtenida
            int id = Integer.parseInt(row.get(0));
            String name = row.get(1);
            String category = row.get(2);
            int quantity = Integer.parseInt(row.get(3));
            double price = Double.parseDouble(row.get(4));
            int idCategoria = Integer.parseInt(row.get(5));
            // A un nuevo Arreglo añadimos todos los parámetros arriba
            Object[] newArray = new Object[]{id,name,category,quantity,price, idCategoria};
            // Al arreglo padre, le añadimos uno único
            arrayOfArrays[i] = newArray;
        }
        // Regresamos el arreglo de arreglos
        return arrayOfArrays;
    }
    // Método que borra un elemento, dado el ID
    public boolean delete(String id){
        try{
            // URL del Servidor
            String masterUrl = "http://showyourkicksmx.com/";
            String url = masterUrl + "producto/" + id ;
            // Uso de la clase HTTPR, que de acuerdo a los metodos nos ayudará
            HTTPRequest deleteUser = new HTTPRequest("DELETE", "", url);
            // Eliminamos con el método DELETE  de HTTPR
            deleteUser.delete(id, url);
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }
        return true;
    }
    // Método que añade un elemento a la base de datos
    public boolean insert(String name, int quantity, double price, int id){
        try{
            // Todos nuestros parámetros los ingresaremos en un JSON Object
            JSONObject obj = new JSONObject();
            String newQuantity = "" + quantity;
            String newPrice = "" + price;
            obj.put("nombreP", name);
            obj.put("cantidad", newQuantity);
            obj.put("precio", newPrice);
            obj.put("idCategoria", id);
            String masterUrl = "http://showyourkicksmx.com/";
            String url = masterUrl + "producto";
            // Creamos el objeto de HTTPR para mandarle los datos, como es un tipo
            // JSONObject, lo mandamos como String simplemente sumandolo
            HTTPRequest addUser = new HTTPRequest("POST", ("" + obj), url);
            // Aplicamos el envío
            addUser.post();
            
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
        // Regresamos el success
        return true;
    }
    
    // Método que modifica la cantidad dado el ID
    public boolean update(int id, int quantity){
        try{
            // Al igual al anterior, todos nuestros elementos a JSON
            JSONObject obj = new JSONObject();
            String newQuantity = "" + quantity;
            obj.put("cantidad", newQuantity);
            String masterUrl = "http://showyourkicksmx.com/";
            String url = masterUrl + "producto/" + id;
            // Objeto tipo HTTPR con el método PUT
            HTTPRequest addUser = new HTTPRequest("PUT", ("" + obj), url);
            // Accionamos el método
            addUser.put();
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
        return true;
    }

// MAIN DE PRUEBA ÚNICAMENTE, PARA COMPROBAR SU FUNCIONALIDAD 
//  public static void main(String[] args) {
//        Products prueba = new Products();
//        Query a = new Query();
//        Object[][] pa = prueba.get();
//        ArrayList<ArrayList<String>> lista = a.getProducts(); 
//        for (int i = 0; i < lista.size(); i++) {
//            for (int j = 0; j < pa[i].length; j++) {
//                System.out.println(pa[i][j]);
//            }
//        }   
//      prueba.delete("8");
//      prueba.update(1, 5);
// }   
}

