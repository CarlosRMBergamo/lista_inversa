
package lista_inversa;

import java.util.ArrayList;
import java.util.List;

public class Lista_in {

    public static void main(String[] args) {
       List<Integer> valores = new ArrayList<>();
        valores.add(1);
        valores.add(2);
        valores.add(3);
        valores.add(4);
        
        for(int i = valores.size() -1; i>=0; i--){
            
                System.out.println(valores.get(i));
               
        }
    }
    
}
