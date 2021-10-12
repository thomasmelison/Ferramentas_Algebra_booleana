class Testes {
    public static void main(String[] args) {
        // inicialização das variaveis
        boolean A ;
        boolean B;
        boolean C;
        boolean resultado;
        /* caso queira testar uma nova tabela, 
        basta adiciona-la nesse Array e modificar a equação da soma*/
        int tabela_teste[][] = {{0,0,0,0},
                                {0,0,1,1},
                                {0,1,0,1},
                                {0,1,1,	0},
                                {1,0,0,1},
                                {1,0,1,1},
                                {1,1,0,1},
                                {1,1,1,0}
        };
        // loop que pega o valor lógico de cada linha e aplica na equação
        // uma discrepância será detectada caso o valor esperado não seja o mesmo encontrado pela equação
        for(int i = 0; i < 8; i++){
            // usa a função calculadora_valor_logico para transformar cada inteiro na array em um valor booleano
            A = calculadora_valor_logico(tabela_teste[i][0]);
            B = calculadora_valor_logico(tabela_teste[i][1]);
            C = calculadora_valor_logico(tabela_teste[i][2]);
            resultado = calculadora_valor_logico(tabela_teste[i][3]);


            // Adicione aqui a sua equação da soma, "||" é para "ou" e "&&" para "e"
            boolean suposto_resultado = (!A && !B && C) || (!A && B && C) || (A && !B && !C) || (A && !B && C) || (A && B && !C);
            
            //Resultado da minha equação -- Boolean suposto_resultado = (!A && B && C) || (A && !B && C);

            if(suposto_resultado == resultado){
                System.out.printf("Resultado da linha %d esta correto segundo a equacao\n",i);
            }
            else{
                System.out.printf("Erro! O resultado nao bateu com a equacao na linha %d\n",i);
            }
        }
        
    }
    // Função que passa de um valor inteiro (0 ou 1) para booleano
    //@parameter inteiro binário
    //@return valor lógico
    public static boolean calculadora_valor_logico(int binario){
        boolean valor_binario;
        if( binario == 1){
            valor_binario = true;
        }
        else{
            valor_binario = false;
        }
        return valor_binario;

    }
}
