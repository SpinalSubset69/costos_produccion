/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package optimizacion_de_costos_de_produccion;

import java.util.ArrayList;


/**
 *
 * @author kito_
 */
public class MetodoProductos {
    public static ArrayList<String> list;
        public static void init(){
         list = new ArrayList<String>();
    }
    
    public static void add(String item){
        list.add(item);    
    }
    
    public static boolean ifExist(String item){
        boolean f = false;
        if(!isEmpty()){
            Object[] all = list.toArray();
            int l = all.length;
            for(int i=0;i<l;i++){
                if(all[i].toString().equals(item)){ f = true; break;}
            }
            
        }
        return f;
    }
    
    public static boolean isEmpty(){
        Object[] all = list.toArray();
        if(all.length==0){ return true; }
        return false;
    }
}
