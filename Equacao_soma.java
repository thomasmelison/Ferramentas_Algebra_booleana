import java.util.ArrayList;
import java.util.Scanner;
/**
 * Programa que calcula a equação da soma de uma tabela 3x8
 */

public class Equacao_soma {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String equacao_soma = "";
        // cria uma array de strings, cada string tem uma linha da tabela
        String[] linha = new String[8];
        for(int i = 0; i < 8; i++){
            linha[i] = teclado.nextLine();
        }
        // cria uma ArrayList para todas as linhas usadas no calculo
        // as únicas linhas que serão utilizadas serão as que o resultado (ultimo valor da linha) deu verdadeiro (ou '1')
        ArrayList<String> linhas_uteis = new ArrayList<String>(); 
        for(int i = 0; i < 8; i++){
            if(linha[i].charAt(3) == '1'){
                linhas_uteis.add(linha[i]);
            }
        }


        int tamanho_linhas_uteis = linhas_uteis.size();
        // pega os caracteres presentes na linha e concatena conforme o valor lógico deste
        for(int i = 0; i < tamanho_linhas_uteis; i++){
            
            char A = linhas_uteis.get(i).charAt(0);
            char B = linhas_uteis.get(i).charAt(1);
            char C = linhas_uteis.get(i).charAt(2);

            equacao_soma = equacao_soma + "(";
            // valor para o primeiro número da linha
            if(A == '1'){
                equacao_soma = equacao_soma + "A";
            }
            else if( A == '0'){
                equacao_soma = equacao_soma + "!A";
            }
            // operador logico "e"
            equacao_soma = equacao_soma + " && ";

            // valor para o segundo numero da linha
            if(B == '1'){
                equacao_soma = equacao_soma + "B";
            }
            else if( B == '0'){
                equacao_soma = equacao_soma + "!B";
            }
            // outro operador logico "e"
            equacao_soma = equacao_soma + " && ";
            
            // valor para o terceiro numero da linha
            if(C == '1'){
                equacao_soma = equacao_soma + "C";
            }
            else if( C == '0'){
                equacao_soma = equacao_soma + "!C";
            }
            // fechando a primeira equação
            equacao_soma = equacao_soma + ")";
            
            // adiciona um operador "ou" caso não seja o final da equação
            if(i == tamanho_linhas_uteis - 1){
                break;
            }
            else{
                equacao_soma = equacao_soma + " || ";
                
            }
        // apresenta ao usuario a equação
        }
        System.out.printf("A equacao da soma para essa tabela e: %s\n",equacao_soma);

    }
}