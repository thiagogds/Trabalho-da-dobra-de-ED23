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

    public static ArrayList<Integer> dobra(ArrayList<Integer> dobra) {
        ArrayList<Integer> listaSoma = new ArrayList<Integer>();

        int inicio = 0;
        int fim = dobra.size() - 1;

        while (listaSoma.size() < dobra.size() / 2) {
            listaSoma.add(soma(dobra.get(inicio), dobra.get(fim)));
            inicio += 1;
            fim -= 1;
        }

        return listaSoma;
    }

    public static int fazDobra(ArrayList<Integer> numero) {


        if (numero.size() == 1) {

            return numero.get(0);
        } else if (numero.size() == 2) {

            return concatenaNumeros(numero.get(0), numero.get(1));
        } else if (numero.size() % 2 == 0) {

            ArrayList<Integer> soma = new ArrayList<Integer>();
            soma = dobra(numero);

            return fazDobra(soma);
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
