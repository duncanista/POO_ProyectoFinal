package interfaz;

import java.util.ArrayList;
import org.json.JSONObject;

// Esta clase al igual que otras, utiliza de Query para pasar las AdL a Arreglo
// de arreglos de objetos
public class Users implements ModeloBaseDeDatos{
    // Constructor
    public Users(){
    }
    // Obtener todos los usuarios en un AdAdO
    public Object[][] get(){
        Query a = new Query();
        ArrayList<ArrayList<String>> users = a.getUsers();

        Object[][] arrayOfArrays = new Object[users.size()][4];
        for (int i = 0; i < users.size(); i++) {
            ArrayList<String> row = users.get(i);

            int id = Integer.parseInt(row.get(0));
            String name = row.get(1);
            String type = row.get(2);
            double sueldo = Double.parseDouble(row.get(3));
            Object[] newArray = new Object[]{id,name,type,sueldo};

            arrayOfArrays[i] = newArray;
        }
        return arrayOfArrays;
    }
    // Borrar algún usuario de acuerdo al ID enviado
    public boolean delete(String id){
        try{
            String masterUrl = "http://showyourkicksmx.com/";
            String url = masterUrl + "usuario/" + id ;
            HTTPRequest deleteUser = new HTTPRequest("DELETE", "", url);
            deleteUser.delete(id, url);
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }
        return true;
    }
    // El método INSERT, añade los datos, de acuerdo a los mandados
    public boolean insert(String name, String type, double sueldo){
        try{
            // Creación del Objeto de JSON a mandar
            JSONObject obj = new JSONObject();
            String newSueldo = "" + sueldo;
            obj.put("nombre", name);
            obj.put("puesto", type);
            obj.put("sueldo", newSueldo);
            // Después de añadirle los parámetros se manda al servidor
            String masterUrl = "http://showyourkicksmx.com/";
            String url = masterUrl + "usuario";
            HTTPRequest addUser = new HTTPRequest("POST", ("" + obj), url);
            addUser.post();

            System.out.print(obj);
            
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
        return true;
    }
    // Método que actualiza los datos de un usuario
    public boolean update(int id, double sueldo){
        try{
            // Creación del objeto JSON para enviarlo
            JSONObject obj = new JSONObject();
            String sueldoS = "" + sueldo;
            obj.put("sueldo", sueldoS);
            String masterUrl = "http://showyourkicksmx.com/";
            String url = masterUrl + "usuario/" + id;
            // Envio del JSON a modificar
            HTTPRequest addUser = new HTTPRequest("PUT", ("" + obj), url);
            addUser.put();

            
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
        return true;
    }
  
//  METODO MAIN DE PRUEBA, CON FINES EXLUSIVAMENTE DE DESARROLLADOR
//  public static void main(String[] args) {
//    Users prueba = new Users();
//        Query a = new Query();
//        Object[][] pa = prueba.get();
//        ArrayList<ArrayList<String>> users = a.getUsers(); 
//        for (int i = 0; i < users.size(); i++) {
//            for (int j = 0; j < pa[i].length; j++) {
//                System.out.println(pa[i][j]);
//            }
//        }  
//      prueba.delete("10");
//      prueba.insert("Jordan", "ADMIN", 20.0);
//   }   
}
