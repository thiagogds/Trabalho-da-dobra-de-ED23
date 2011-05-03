package dobra;

import java.util.ArrayList;

/**
 *
 * @author Grupo 1
 */
public class Dobra {

    public static int concatenaNumeros(int numero1, int numero2) {

        /*Concatena os dois numeros.
         Exemplo: strNum1 = 2, strNum2 = 3 -> concatena = 23*/
        String strNum1 = Integer.toString(numero1);
        String strNum2 = Integer.toString(numero2);
        String concatena = strNum1 + strNum2;

        return Integer.parseInt(concatena);
    }

    public static int soma(int numero1, int numero2) {

        /*Soma números.
         *Caso forme um número com duas casas, ele pega somente a última casa*/
        return (numero1 + numero2) % 10;
    }

    public static int metodoDobra(ArrayList<Integer> listaNum) {

        /*Se a lista estiver vazia*/
        if (listaNum.isEmpty()) {
            return 0;
        } 
        
        /*Se houver apenas um número*/
        else if (listaNum.size() == 1) {
            return listaNum.get(0);
        } 
        
        /*Quando chegar a dois números*/
        else if (listaNum.size() == 2) {
            return concatenaNumeros(listaNum.get(0), listaNum.get(1));
        } 
        
        else{

            /*Se for ímpar*/
            if (listaNum.size() % 2 != 0){
                listaNum.add(0);
            }

            /*Para todos faça:*/

            ArrayList<Integer> listaSoma = new ArrayList<Integer>();

            listaSoma.add(soma(listaNum.get(1), listaNum.get(2)));
            listaSoma.add(soma(listaNum.get(0), listaNum.get(3)));

            if (listaNum.size() == 5) {
                listaSoma.add(listaNum.get(4));
            } 
            
            else if (listaNum.size() == 6) {
                listaSoma.add(listaNum.get(4));
                listaSoma.add(listaNum.get(5));
            }

            return metodoDobra(listaSoma);
        } 
    }
}
