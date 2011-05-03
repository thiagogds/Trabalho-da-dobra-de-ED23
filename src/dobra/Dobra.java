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

   public static int soma(int numero1, int numero2){
       return (numero1 + numero2) % 10;
   }

    public static int faz_dobra(ArrayList<Integer> numero) {
        if (numero.size() == 1) {
            return numero.get(0);
        }

        else if(numero.size() == 2 ){
            return concatenaNumeros(numero.get(0), numero.get(1));
        }

        else if(numero.size() == 3){
            int soma = soma(numero.get(1), numero.get(2));
            return concatenaNumeros(numero.get(0), soma);
        }

        else if(numero.size() == 4){
            int soma = soma(numero.get(0), numero.get(3));
            int soma2 = soma(numero.get(1), numero.get(2));
            return concatenaNumeros(soma, soma2);
        }

        else if(numero.size() == 5){

            numero.add(0);

            ArrayList<Integer> soma = new ArrayList<Integer>();

            soma.add(soma(numero.get(0), numero.get(5)));
            soma.add(soma(numero.get(1), numero.get(4)));
            soma.add(soma(numero.get(2), numero.get(3)));

            soma.add(0);

            return faz_dobra(soma);
        }

  /*      else if( ( numero.size() % 2 ) == 0){

        }*/
        return 0;
    }
}
