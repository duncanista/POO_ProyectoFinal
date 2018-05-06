package interfaz;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

// La clase Query la representamos como statements, que utilizará la REST API
// diseñada por sus servilletas, para así obtener arreglos que después 
// utilizaremos
public class Query {
    String masterUrl = "http://showyourkicksmx.com/";
    
    // Método para obtener todos los usuarios
    public ArrayList<ArrayList<String>> getUsers(){
        String url = this.masterUrl + "usuario";
        ArrayList<ArrayList<String>> users = new ArrayList();
        HTTPRequest usersQuery = new HTTPRequest("GET", "", url);
        try{
            // Bloque que lee la respuesta de la API, primero un Objeto JSON que 
            // es la respuesta completa
            String response = usersQuery.get();
            JSONObject obj = new JSONObject(response);
            // Despues un arreglo para los datos específicos
            JSONArray datos = obj.getJSONArray("datos");
            // Como son demasiados, lo hacemos objeto de nuevo, pero lo recorreremos
            // en lista
            for (int i = 0; i < datos.length(); ++i) {
                ArrayList<String> dataArray = new ArrayList();
                JSONObject query = datos.getJSONObject(i);
                // Obtenemos todos los datos y los añadimos finalmente a la lista padre
                String user_id = query.getString("idUsuario");
                String user_name = query.getString("nombre");
                String user_type = query.getString("puesto");
                String user_pay = query.getString("sueldo");
                dataArray.add(user_id);
                dataArray.add(user_name);
                dataArray.add(user_type);
                dataArray.add(user_pay);  
                // Se añaden al AdL padre
                users.add(dataArray);
            }
        }catch(Exception e){
            System.out.println("¡No se pudieron obtener los usuarios! : " + e);
        }
        // Regresamos la lista como AdL
        return users;
    }
    
    // Método para obtener las compras totales
    public ArrayList<ArrayList<String>> getPurchases(){
        String url = this.masterUrl + "compra";
        ArrayList<ArrayList<String>> purchases = new ArrayList();
        HTTPRequest purchasesQuery = new HTTPRequest("GET", "", url);
        try{
            String response = purchasesQuery.get();
            JSONObject obj = new JSONObject(response);
            JSONArray datos = obj.getJSONArray("datos");
            for (int i = 0; i < datos.length(); ++i) {
                ArrayList<String> purchaseData = new ArrayList();
                JSONObject purchase = datos.getJSONObject(i);
                String buy_id = purchase.getString("idCompra");
                String buy_date = purchase.getString("fecha");
                String buy_total = purchase.getString("total");
                String buy_payment = purchase.getString("pago");
                String seller_id = purchase.getString("idProveedor");
                purchaseData.add(buy_id);
                purchaseData.add(buy_date);
                purchaseData.add(buy_total);
                purchaseData.add(buy_payment);
                purchaseData.add(seller_id);
                purchases.add(purchaseData);
            }
        }catch(Exception e){
            System.out.println("¡No se pudieron obtener las compras! : " + e);
        }

        return purchases;
    }
    // Método para obtener todos los productos
    public ArrayList<ArrayList<String>> getProducts(){
        String url = this.masterUrl + "producto";
        ArrayList<ArrayList<String>> products = new ArrayList();
        HTTPRequest productsQuery = new HTTPRequest("GET", "", url);
        try{
            String response = productsQuery.get();
            JSONObject obj = new JSONObject(response);
            JSONArray datos = obj.getJSONArray("datos");
            for (int i = 0; i < datos.length(); ++i) {
                ArrayList<String> arrayData = new ArrayList();
                JSONObject product = datos.getJSONObject(i);
                String p_id = product.getString("idProducto");
                String p_name = product.getString("nombreP");
                String p_category = product.getString("nombreC");
                String p_quantity = product.getString("cantidad");
                String p_price = product.getString("precio");
                String p_idCategory = "" + product.getInt("idCategoria");
                arrayData.add(p_id);
                arrayData.add(p_name);
                arrayData.add(p_category);
                arrayData.add(p_quantity);
                arrayData.add(p_price);
                arrayData.add(p_idCategory);
                products.add(arrayData);
            }
        }catch(Exception e){
            System.out.println("¡No se pudieron obtener los productos! : " + e);
        }
        
        return products;
    }
    // Método que nos regresa todas las ventas
    public ArrayList<ArrayList<String>> getSales(){
        String url = this.masterUrl + "venta";
        ArrayList<ArrayList<String>> products = new ArrayList();
        HTTPRequest productsQuery = new HTTPRequest("GET", "", url);
        try{
            String response = productsQuery.get();
            JSONObject obj = new JSONObject(response);
            JSONArray datos = obj.getJSONArray("datos");
            for (int i = 0; i < datos.length(); ++i) {
                ArrayList<String> arrayData = new ArrayList();
                JSONObject product = datos.getJSONObject(i);
                String s_id = product.getString("idVenta");
                String s_name = product.getString("fecha");
                String s_category = product.getString("total");
                arrayData.add(s_id);
                arrayData.add(s_name);
                arrayData.add(s_category);
                products.add(arrayData);
            }
        }catch(Exception e){
            System.out.println("¡No se pudieron obtener las ventas! : " + e);
        }
        
        return products;
    }
    // Método que nos regresa las categorias
    public ArrayList<ArrayList<String>> getCategories(){
        String url = this.masterUrl + "categoria";
        ArrayList<ArrayList<String>> products = new ArrayList();
        HTTPRequest productsQuery = new HTTPRequest("GET", "", url);
        try{
            String response = productsQuery.get();
            JSONObject obj = new JSONObject(response);
            JSONArray datos = obj.getJSONArray("datos");
            for (int i = 0; i < datos.length(); ++i) {
                ArrayList<String> arrayData = new ArrayList();
                JSONObject product = datos.getJSONObject(i);
                String c_id = product.getString("idCategoria");
                String c_name = product.getString("nombreC");
                arrayData.add(c_id);
                arrayData.add(c_name);
                products.add(arrayData);
            }
        }catch(Exception e){
            System.out.println("¡No se pudieron obtener las ventas! : " + e);
        }
        
        return products;
    }
    // Ya no comentamos detalladamente los otros métodos, ya que son exactamente
    // iguales, en terminos de funcionalidad, al primero, simplemente que con 
    // diferentes atributos
}
