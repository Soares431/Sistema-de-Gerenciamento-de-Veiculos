
package Sistemas;

import Objetos.*;
import java.util.*;

// Classe usada para instanciar os objetos filhos
public class Construcao {
    
    static Scanner in = new Scanner(System.in);
    
    // Instancia o Objeto Carro
    static Veiculo CadastroCarro(String texto){
       
        Carro c = new Carro();
        
        System.out.println("=== "+ texto + " ==="); 
        System.out.println("------------------------------------");
        
        c.setMarca(Tratamento_De_Exececao.StringInputMismatch("Marca do Carro: "));
         
        c.setModelo(Tratamento_De_Exececao.StringInputMismatch("Modelo do Carro: "));
        
         c.setPlaca(Tratamento_De_Exececao.StringInputMismatch("Placa do Carro: "));
        
        c.setAnoFabricacao(Tratamento_De_Exececao.INTInputMismatch("Ano de Fabricação: "));
        
        c.setTipoCombustivel(Tratamento_De_Exececao.StringInputMismatch("Tipo Combustível: "));
        
        c.setNumPortas(Tratamento_De_Exececao.INTInputMismatch("Número de Portas:  "));
        
        c.setIPVA(0.0);
        return c;
 
        
    }
    
    // Instancia o Objeto Moto
    static Veiculo CadastroMoto(String texto){
       
        Moto m = new Moto();
        
        System.out.println("=== " + texto +" ==="); 
        System.out.println("------------------------------------");
        
        m.setMarca(Tratamento_De_Exececao.StringInputMismatch("Marca da Moto: "));
  
        m.setModelo(Tratamento_De_Exececao.StringInputMismatch("Modelo da Moto: "));
        
        m.setPlaca(Tratamento_De_Exececao.StringInputMismatch("Placa da Moto: "));
        
        m.setAnoFabricacao(Tratamento_De_Exececao.INTInputMismatch("Ano de Fabricação: "));
        
        m.setTipoFreio(Tratamento_De_Exececao.StringInputMismatch("Tipo de Freio:  "));
        
        m.setCilindradas(Tratamento_De_Exececao.INTInputMismatch("Quantidades de Cilindros:  "));

        m.setIPVA(0.0);
        return m;
 
        
    }
    
}
