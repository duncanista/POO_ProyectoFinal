package interfaz;

import java.util.ArrayList;

// Esta clase nos da un arreglo de las categorías que tenemos en la base de datos
public class Category {
    // Constructor
    public Category(){
    }
    
    // Método, que nos obtiene un Arreglo de Arreglos de las categorías.
    public Object[][] get(){
        // Activamos Query, que nos ayudará posteriormente a obtener las categorias
        Query a = new Query();
        //Obtenemos las categorías pero en un Arreglo de Listas de un AdL
        ArrayList<ArrayList<String>> categorias = a.getCategories();
        // Para convertirlo, primero lo declaramos con los datos del AdL
        Object[][] arrayOfArrays = new Object[categorias.size()][2];
        // En el siguiente sencillo for, añadimos los datos del AdL de String al
        // nuevo Arreglo de Objetos
        for (int i = 0; i < categorias.size(); i++) {
            // Obtenemos una tupla
            ArrayList<String> row = categorias.get(i);
            // Cast del int parseado
            int id = Integer.parseInt(row.get(0));
            String name = row.get(1);
            Object[] newArray = new Object[]{id,name};
            arrayOfArrays[i] = newArray;
        }
        // Regresamos el Arreglo de Arreglo de Objetos
        return arrayOfArrays;
    }
}
