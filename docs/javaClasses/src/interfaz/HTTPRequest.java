package interfaz;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

// Esta clase es de suma impotancia, ya que será la que llama a nuestro servidor
// todo lo obtenido se otorga en forma de JavaScript Object Notation (JSON), que
// de acuerdo al método, se entrega/envía/modifica lo deseado
public final class HTTPRequest {
    private String method, datos, url;
    // Constructor
    public HTTPRequest(String method, String datos, String url){
        this.method = method;
        this.datos = datos;
        this.url = url;
    }   
   
    // El método get, ademas de manejar excepciones de acuerdo al status, realiza
    // la obtención de los datos, practicamente es un SELECT que utiliza nuestra
    // propia REST API.
    public String get() throws Exception{
        URL obj = new URL(this.url);
        // Conexión a la base de datos
        HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
        // Tipo de método
        connection.setRequestMethod("GET");
        // Usuario Agente, y el explorador, lo omitimos para que sea universal
        connection.setRequestProperty("User-Agent", "");
        // código de respuesta, no lo utilizamos, pero debemos obtenerlo
        int responseCode = connection.getResponseCode();
        // El siguiente bloque lee todo nuestro JSON
        StringBuilder response;
           try (BufferedReader in = new BufferedReader(
                   new InputStreamReader(connection.getInputStream()))) {
               String inputLine;
               response = new StringBuilder();
               while ((inputLine = in.readLine()) != null) {
                   response.append(inputLine);
               }  }
        // Desconexión de la base, y regresamos nuestra response en String
        connection.disconnect();
        return response.toString();
    }
    
    // Similar al GET, pero ahora, envíamos nuestros datos, de acuerdo a los 
    // parámetros enviados
    public String post() throws Exception{
        URL obj = new URL(this.url);
        // Conexión
        HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
        // Declaramos Método
        connection.setRequestMethod("POST");
        connection.setRequestProperty("User-Agent", "");
        // Obtenemos los parámetros/datos a enviar
        String urlParameters = this.datos;
        // El siguiente bloque envía los datos
        connection.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream (
        connection.getOutputStream ());
        wr.writeBytes (urlParameters);
        wr.flush ();
        wr.close ();

        int responseCode = connection.getResponseCode();

        // Obtenemos la respuesta, que normalmente no la pondremos al usuario, ya
        // que se verá reflejada en en la tabla
        StringBuffer response;
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()))) {
            String inputLine;
            response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
        }
        // Desconexión
        connection.disconnect();
        // Regresamos la respuesta
        return response.toString();
    }
    
    // Método UPDATE, que de acuerdo a los parámetros cambia lo deseado a nuestra
    // base de datos
    public String put() throws Exception{
        URL obj = new URL(this.url);
        // Conexión
        HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
        // Declaración del método
        connection.setRequestMethod("PUT");
        connection.setRequestProperty("User-Agent", "");
        // Obtención de los datos a modificar
        String urlParameters = this.datos;

        // Rescripción de datos
        connection.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream (
        connection.getOutputStream ());
        wr.writeBytes (urlParameters);
        wr.flush ();
        wr.close ();

        int responseCode = connection.getResponseCode();
        // El siguiente código nos regresa la respuesta, sin embargo se vera
        // reflejada en las tablas
        StringBuffer response;
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()))) {
            String inputLine;
            response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
        }
        connection.disconnect();
        // Regresamos los datos en String
        return response.toString();
    }
    
    // Método DELETE, que elimina cosas de nuestra base de datos
    public String delete(String id, String URL) throws Exception{
        URL obj = new URL(this.url);
        // La magia empieza
        HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
        // Declaración del método
        connection.setRequestMethod("DELETE");
        connection.setRequestProperty("User-Agent", "");
        int responseCode = connection.getResponseCode();
        // El siguiente bloque rescribirá los datos, creando la eliminación
        // según los parámetros enviados por el usuario
        StringBuilder response;
           try (BufferedReader in = new BufferedReader(
                   new InputStreamReader(connection.getInputStream()))) {
               String inputLine;
               response = new StringBuilder();
               while ((inputLine = in.readLine()) != null) {
                   response.append(inputLine);
               }  }
        // Desconexión
        connection.disconnect();
        // Regreso de respuesta, que no se verá mostrada, sólo en las tablas
        return response.toString();
    }  
}