
package Sistemas;

import Objetos.*;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.lang.reflect.Method;
import java.util.List;


// Classe que salva metodos e funções terceiras que auxiliam o codigo de alguma forma
public class Terceiros {
    static String r; 
    static boolean veiculoEncontrado = false; 
    static int indexVeiculo = 0; 

    
      //Limpar Contéudo do Console
    public final static void clearConsole(){

        try {
            Robot robot = new Robot();
            robot.setAutoDelay(10);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_L);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_L);
            } 
        catch (AWTException ex) {
        }
    }
    
    // faz a procura de um veiculo especifico
    static void procurarVeiculo(List<Veiculo> veiculos, String texto){
        
        indexVeiculo = 0;
        
        // r = resposta
        r = Visual.ProcurarVeiculo(texto);

        if(r.equals("-1")){
            Terceiros.clearConsole();
            return;
        }
        else{
            Terceiros.clearConsole();
                for(int i = 0; i < veiculos.size(); i++){
 
                    Veiculo veiculo = veiculos.get(i); 
                    if(r.equals(veiculo.getPlaca())){
                        veiculoEncontrado = true;
                        indexVeiculo = i; 
                       return; 
                    }
                   else{
                        veiculoEncontrado = false;
   
                   }
                }
                
        }
    }
    
    // Procurar um metodo especifico em uma classe, ele é usado no metodo "ChecarTipoVeiculo"
    static public boolean  checarMetodos(Veiculo obj, String nomeMetodo){
        
        Method[] metodos = obj.getClass().getDeclaredMethods();
               
        boolean metodoExiste = false;
        
        for (int i = 0; i < metodos.length; i++) {
            if (metodos[i].getName().equals(nomeMetodo)) {
                metodoExiste = true;
                break;
            }
        }

            return metodoExiste; 
    }
    
    // O Metdo "ChecarTipoVeiculo" é usado para lidar com a  lista "veiculos", para posteriomente saber quantos carros e motos foram cadastrados no sistema . 
    // Isso é feito atraves do um 'For', que vai interagi com a lista e vai verificando se os objetos dessa lista são um carro ou uma moto 
    // E através do paramentro "MetodoVeiculo", Com ele é verificado se o objeto que o "for" está iterando possui um 
    // metodo especifico do objeto carro(como setNumPortas) do objeto moto (como setTipoFreio).
    
    // Em resumo, ele é usaodo para saber quantos Objetos foi cadastrados, é quantas são motos ou carros. 
    public static boolean ChecarTipoVeiculo(List<Veiculo> veiculos, String MetodoVeiculo, String texto){
            
        int quant = 0; 
        
            for (int i = 0; i < veiculos.size(); i++) {

                if(Terceiros.checarMetodos(veiculos.get(i), MetodoVeiculo))
                    quant++;
            }
            
            if(quant > 0)
                return true;
            else{
                Visual.Aviso("ERRO!", texto, texto); 
                return false;         
                
            }
            
    }
}
