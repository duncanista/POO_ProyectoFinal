package interfaz;

import java.util.ArrayList;
import org.json.JSONObject;

// Clase Sales, nos otorgará lo deseado al crearla en otros documentos, de acuerdo
// a sus métodos
public class Sales implements ModeloBaseDeDatos{
    // Constructor
    public Sales(){
    }
    // Obtener todas las ventas en un arreglo de arreglo de objetos
    public Object[][] get(){
        // Creamos un objeto Query, que nos otorgará las ventas
        Query a = new Query();
        ArrayList<ArrayList<String>> sales = a.getSales();
        Object[][] arrayOfArrays = new Object[sales.size()][3];
        for (int i = 0; i < sales.size(); i++) {
            ArrayList<String> row = sales.get(i);

            int id = Integer.parseInt(row.get(0));
            String date = row.get(1);
            double total = Double.parseDouble(row.get(2));
            Object[] newArray = new Object[]{id,date,total};

            arrayOfArrays[i] = newArray;
        }
        // Regresamos el arreglo de arreglos
        return arrayOfArrays;
    }
    // Método que nos elimina una venta en caso de necesitarlo posteriormente
    public boolean delete(String id){
        try{
            String masterUrl = "http://showyourkicksmx.com/";
            String url = masterUrl + "venta/" + id ;
            HTTPRequest deleteUser = new HTTPRequest("DELETE", "", url);
            deleteUser.delete(id, url);
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }
        return true;
    }
    // El método INSERT nos añade a la base de datos una venta, dados los parámetros
    public boolean insert(String fecha, double total){
        try{
            JSONObject obj = new JSONObject();
            String newTotal = "" + total;

            obj.put("fecha", fecha);
            obj.put("total", newTotal);
            obj.put("idUsuario", 1);

            String masterUrl = "http://showyourkicksmx.com/";
            String url = masterUrl + "venta";
            HTTPRequest addUser = new HTTPRequest("POST", ("" + obj), url);
            addUser.post();
  
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
        return true;
    }
//  MAIN DE PRUEBA, PROBANDO SU FUNCIONALIDAD
//  public static void main(String[] args) {
//      Sales prueba = new Sales();
//        Query a = new Query();
//        Object[][] pa = prueba.get();
//        ArrayList<ArrayList<String>> lista = a.getSales(); 
//        for (int i = 0; i < lista.size(); i++) {
//            for (int j = 0; j < pa[i].length; j++) {
//                System.out.println(pa[i][j]);
//            }
//        }  
//        prueba.delete("2");
//        prueba.insert("hoy", 20.0, 1);
//  }   
}
