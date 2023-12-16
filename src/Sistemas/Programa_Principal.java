
package Sistemas;
import Objetos.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Programa_Principal {
    
    static public List<Veiculo> veiculos = new ArrayList<>();
    public static Scanner in = new Scanner(System.in);
        
    public static void main(String[] args){
        
        int i = 0; 
        boolean cont = true; 
        
        while(cont){
            
            switch(Visual.Menu()){

                case 1: // Cadastro de Veiculo
                    
                    Terceiros.clearConsole();
                    Controle.CadastroVeiculo(veiculos);
                break; 
  
                    
                case 2: // Remoção de Veiculo
                    Terceiros.clearConsole();
                    Controle.RemoverVeiculo(veiculos);
                    break;
                    
                case 3: // Atualização dos Dados do Veiculo
                     Terceiros.clearConsole();
                     Controle.AtualizarVeiculo(veiculos);
                     
                    break;
                    
                case 4: // Mostra Veiculos cadastrados
                    
                    Terceiros.clearConsole();
                    Controle.ListarVeiculos(veiculos);
                   
                break;
                  
                case 5: // Calculo do IPVA
                     Terceiros.clearConsole();
                    Controle.CalcularIPVA(veiculos);
                    break;
                
                case 6: // Sair do Sistema
                    cont = false;
                     Visual.Aviso("AVISO!","PROGRAMA ENCERRADO!", "PROGAMA ENCERRADO....");
                    break;
                 
                default:
                    
                    Visual.Aviso("Error","Digite um Valor Valido!", "DIGITE UM VALOR VALIDO!");
                    
                    break;
            }
            
            
        }
       
    }
    

    
  
}
