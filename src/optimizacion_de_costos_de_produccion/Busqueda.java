
package optimizacion_de_costos_de_produccion;

import java.util.ArrayList;

public class Busqueda {
    
    public static ArrayList<String> list;
        public static void init(){
         list = new ArrayList<String>();
    }
        
    public static void Agregar(String item){
        list.add(item);    
    }
    
    public static boolean Existe(String item){
        boolean f = false;
        if(!Vacio()){
            Object[] all = list.toArray();
            int l = all.length;
            for(int i=0;i<l;i++){
                if(all[i].toString().equals(item)){ f = true; break;}
            }
            
        }
        return f;
    }
    
    public static boolean Vacio(){
        Object[] all = list.toArray();
        if(all.length==0){ return true; }
        return false;
    }
}
