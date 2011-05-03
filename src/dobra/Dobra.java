/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dobra;

import java.util.ArrayList;

/**
 *
 * @author thiago
 */
public class Dobra {

    public static int concatenaNumeros(int numero1, int numero2){
        String strNum1 = Integer.toString(numero1);
        String strNum2 = Integer.toString(numero2);
        String concatena = strNum1 + strNum2;
        return Integer.parseInt(concatena);
    }

    public static int faz_dobra(ArrayList<Integer> numero) {
        if (numero.size() == 1) {
            return numero.get(0);
        }
        else if(numero.size() == 2 ){
            return concatenaNumeros(numero.get(0), numero.get(1));
        }
        else if(numero.size() == 3){
            int soma = (numero.get(0) + numero.get(1)) % 10;
            return concatenaNumeros(soma, numero.get(2));
        }
        return 0;
    }
}
