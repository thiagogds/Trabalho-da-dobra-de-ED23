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

    public static int concatenaNumeros(int numero1, int numero2) {

        String strNum1 = Integer.toString(numero1);
        String strNum2 = Integer.toString(numero2);
        String concatena = strNum1 + strNum2;

        return Integer.parseInt(concatena);
    }

    public static int soma(int numero1, int numero2) {

        return (numero1 + numero2) % 10;
    }
    /*
    public static int fazDobra(ArrayList<Integer> numero){

    int aux1 = 0;
    int aux2 = numero.size() - 1;

    return fazDobra(numero, aux1, aux2);

    }
     *
     */

    public static int fazDobra(ArrayList<Integer> numero) {

        ArrayList<Integer> soma = new ArrayList<Integer>();

        if (numero.size() == 1) {

            return numero.get(0);
        } else if (numero.size() == 2) {

            return concatenaNumeros(numero.get(0), numero.get(1));
        } else if (numero.size() % 2 == 0) {

            int inicio = 0;
            int fim = numero.size() - 1;

            while (soma.size() < numero.size() / 2) {
                soma.add(soma(numero.get(inicio), numero.get(fim)));
                inicio += 1;
                fim -= 1;
            }

            return fazDobra(soma);



            //soma.add(soma(numero.get(0), numero.get(3)));

            //fazDobra(soma, aux1++, aux2--);
        } else {
            numero.add(0);

            return fazDobra(numero);
        }

        /*        else if (numero.size() == 3) {

        soma.add(numero.get(0));
        soma.add(soma(numero.get(1), numero.get(2)));

        return fazDobra(soma);
        }

        else if (numero.size() == 4) {

        soma.add(soma(numero.get(0), numero.get(3)));
        soma.add(soma(numero.get(1), numero.get(2)));

        return fazDobra(soma);
        } 
        
        else if (numero.size() == 5) {

        numero.add(0);

        soma.add(soma(numero.get(0), numero.get(5)));
        soma.add(soma(numero.get(1), numero.get(4)));
        soma.add(soma(numero.get(2), numero.get(3)));

        soma.add(0);

        return fazDobra(soma);
        }

        else if (numero.size() == 6) {

        soma.add(soma(numero.get(0), numero.get(5)));
        soma.add(soma(numero.get(1), numero.get(4)));
        soma.add(soma(numero.get(2), numero.get(3)));

        soma.add(0);

        return fazDobra(soma);
        }*/

    }
}
