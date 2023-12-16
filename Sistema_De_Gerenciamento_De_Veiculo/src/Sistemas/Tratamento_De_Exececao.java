
package Sistemas;
import java.util.Scanner; 
import java.util.InputMismatchException;

public class Tratamento_De_Exececao {
    
    public static Scanner in = new Scanner(System.in);
    
    // Essa função garanti que o usuário digite números INTEIROS válidos.
    // Enquanto o usuario digitar um numero invalido, essa função continuará rodando.
    static int INTInputMismatch(String texto){

       int i = 0;
       boolean certo = false; 
       
       while(!certo){
             try {
                System.out.print(texto);
                i = in.nextInt();
                System.out.println("-");
                certo = true;
            } 
            catch(InputMismatchException  e) {
                
                Visual.Aviso("ERRO", "INFORME DADOS VALIDOS!", "INFORME DADOS VALIDOS!");
                
                // Limpar o buffer do scanner para evitar um loop infinito
                in.nextLine();

            }
       }
      
        return i;
    }
    
    // Essa função garanti que o usuário digite números QUEBRADOS válidos.
    // Enquanto o usuario digitar um numero invalido, essa função continuará rodando.
    static float FLOATInputMismatch(String texto){
        
        float i = 0;
        boolean certo = false; 
          
        while(!certo){
            
            try {
             
                System.out.print(texto);
                i = in.nextInt();
                System.out.println("-");
                certo = true;
            } 
            catch(InputMismatchException  e) {

              Visual.Aviso("ERRO", "INFORME DADOS VALIDOS!", "INFORME DADOS VALIDOS!");
                // Limpar o buffer do scanner para evitar um loop infinito
                in.nextLine();
            }
        }

        return i;
    }
    
     // Essa função garanti que o usuário digite um um valor do tipo TEXTO válido.
    // Enquanto o usuario digitar uma informação invalida, essa função continuará rodando.
    static String StringInputMismatch(String texto){
        
        String s = " ";
        boolean certo = false; 
          
        while(!certo){
            
            try {
              // Operações de E/S que podem lançar IOException
                System.out.print(texto);
                s = in.next();
                System.out.println("-");
              certo = true;
            } 
            catch(InputMismatchException  e) {

                Visual.Aviso("ERRO", "INFORME DADOS VALIDOS!", "INFORME DADOS VALIDOS!");
                // Limpar o buffer do scanner para evitar um loop infinito
                in.nextLine();
            }

        }

        return s;
    }
}
