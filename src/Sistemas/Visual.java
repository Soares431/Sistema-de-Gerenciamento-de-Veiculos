
package Sistemas;
import java.util.Scanner; 
import javax.swing.JOptionPane;

// Classe usada para lida com menus do sistema.
public class Visual {

    static int Menu(){
        
        System.out.println("=== SISTEMA DE GERENCIAMENTO DE VEÍCULOS ===");
        System.out.println("--------------------------------------------");
        System.out.println("1 - CADASTRA UM NOVO VEÍCULO");
        System.out.println("2 - REMOVER UM VEÍCULO");
        System.out.println("3 - ATUALIZAR VEÍCULO");
        System.out.println("4 - MOSTRAR VEÍCULOS CADASTRADOS");
        System.out.println("5 - CALCULAR O IPVA");
        System.out.println("6 - SAIR");
        System.out.println("--------------------------------------------");
        
        return Tratamento_De_Exececao.INTInputMismatch("SUA OPÇÃO: ");
    }
    
  
    
    // Menu para mostrar os veiculos cadastrados no sistemas; 
     static int ListarTipoVeiculo(){
        
        System.out.println("=== VEÍCULO CADASTRADOS NO SISTEMAS ===");
        System.out.println("-------------------------------------------");
        System.out.print("| 1 - CARRO |");
        System.out.print("| 2 - MOTO | ");
        System.out.println("| 3 - TODOS |");
        System.out.println();
        System.out.println("PRESSIONE QUALQUER OUTRO NÚMERO PARA VOLTAR");
        System.out.println("-------------------------------------------");
        
        return Tratamento_De_Exececao.INTInputMismatch("SUA OPÇÃO [Digite 1, 2 ou 3]: ");
    }
    
    // Menu que permite ao usuário selecionar o tipo de veiculo que ele quer visualizar
    static int EscolherTipoVeiculo(String texto){
         
        System.out.println("=== " + texto + " ===");
        System.out.println("---------------------------------------");
        System.out.print("| 1 - CARRO |");
        System.out.println("| 2 - MOTO | ");
        System.out.println();
        System.out.println("PRESSIONE QUALQUER OUTRO NÚMERO PARA VOLTAR");
        int  p = Tratamento_De_Exececao.INTInputMismatch("SUA OPÇÃO [Digite 1 ou 2]: ");
        
        return p;
    }
    
     static String ProcurarVeiculo(String texto){
         
        Scanner in = new Scanner(System.in);
         
        System.out.println("=== " + texto + " ===");
        System.out.println("---------------------------------------");
        return Tratamento_De_Exececao.StringInputMismatch("DIGITE PLACA DO VEÍCULO OU '-1' PARA VOLTAR AO MENU: ");
    }
    
    // Não usa o JOptionPane
    static public void AvisoSimples(String texto){
        Terceiros.clearConsole();
        System.out.println("----------------------------");
        System.out.println(texto);
        System.out.println("----------------------------");
    }
    
    // Usa o JOptionPane
    public static void Aviso(String Titulo, String textoPainel, String textoConsole)
    {
            Terceiros.clearConsole();
            JOptionPane.showMessageDialog(null, textoPainel, Titulo, JOptionPane.WARNING_MESSAGE);
            System.out.println("----------------------------");
            System.out.println(textoConsole);
            System.out.println("----------------------------");
    }
    
    // Mostrar os dados Basico do Veiculo. 
    public static void MostraVeiculo(String tipoVeiculo, String Marca, String Modelo, int AnoFac){
        
        Terceiros.clearConsole();
        System.out.println("---");
        System.out.println(tipoVeiculo + "| MARCA: " + Marca + " | | MODELO: " + Modelo + " | |ANO DE FABRICAÇÃO: " + AnoFac + " |");
        System.out.println("---");
        
    }
    
    // Mostra o Valor do IPVA 
    public static void MostraIPVAVeiculo(double IPVA){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("----------------------------");
        System.out.println("VALOR DO IPVA: R$" + IPVA);
        System.out.println("----------------------------");
        System.out.println("-");
        System.out.print("PRESSIONE ENTER PARA CONTINUAR.");
        in.nextLine();
        Terceiros.clearConsole();
        
    }
    
    
   
}
