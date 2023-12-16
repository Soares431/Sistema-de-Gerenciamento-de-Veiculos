
package Sistemas;
import Objetos.*; 
import java.util.*;

// Classe usada para fazer a funcionalidades do Sistema, Como cadastrado, remoção e atualização do Veiculo. 
public class Controle {
   
    static public Scanner in = new Scanner(System.in);

    // Faz o cadastrado de um novo veiculo
    public static void CadastroVeiculo(List<Veiculo> veiculos){
       
        int i = Visual.EscolherTipoVeiculo("TIPO DE VEÍCULO QUE SERÁ CADASTRADO");

        switch(i){
           case 1:
               
                Terceiros.clearConsole();
                Veiculo novoCarro = Construcao.CadastroCarro("CADASTRO DE UM NOVO CARRO");
                veiculos.add(novoCarro);
                Visual.Aviso("CADASTRADO!", "VEÍCULO CADASTRADO COM SUCESSO!", "CADASTRADO"); 
                break;

            case 2:
                Terceiros.clearConsole();
                Veiculo novaMoto = Construcao.CadastroMoto("CADASTRO DE UMA NOVA MOTO");
                veiculos.add(novaMoto);
                Visual.Aviso("CADASTRADO!", "VEÍCULO CADASTRADO COM SUCESSO!", "CADASTRADO"); 
                break;
            default:
                Visual.AvisoSimples("VOLTOU AO MENU");
                break;
        }
       
       
       
    }
    
    // Faz a remoção, especificando a placa(caso as placas sejam as mesas, ela era remover veiculo que foi cadastrado)
    // Caso não encontre o veiculo ou a placa for digitada errada, o sistema irá informar erro na tela, pedindo para tenta novamente. 
    // ou caso não tenha nenhum veiculo cadastrado, o sistema irá informar erro novamente na tela, e voltará ao menu principal.
    public static void RemoverVeiculo(List<Veiculo> v){
        
        boolean cont = true;
        if(v.size() >  0){
            
            while(cont){
                Terceiros.procurarVeiculo(v, "VEÍCULO QUE SERÁ REMOVIDO");
             
                if(!Terceiros.r.equals("-1")){
                  
                    if(Terceiros.veiculoEncontrado){
                        v.remove(v.get(Terceiros.indexVeiculo));
                        Visual.Aviso("REMOVIDO!", "VEÍCULO REMOVIDO COM SUCESSO!", "REMOVIDO!");
                    }
                    else Visual.Aviso("ERROR!", "VEÍCULO NÃO ENCONTRADO!", "VEÍCULO NÃO ENCONTRADO! TENTE NOVAMENTE...");
                }
                
                //Continuar rodando o programa até encontra o veiculo, 
                //ou enquanto não digita -1 para sair do programa, ou enquanto tive alguma veiculo cadastrado
                cont = Terceiros.veiculoEncontrado == false && !Terceiros.r.equals("-1") && v.size() > 0;
            }
            
        }
         else Visual.Aviso("ERROR!", "NÃO HÁ UM VEÍCULO CADASTRADO!", "NÃO HÁ UM VEÍCULO CADASTRADO NO SISTEMA!");
           

    }
    
    //Atualiza dados do veiculo, solicitando que o usuário digite novamente todos os dados do veiculo
    // Caso não encontre o veiculo ou a placa for digitada errada, o sistema irá informar erro na tela, pedindo para tenta novamente.
    // ou caso não tenha nenhum veiculo cadastrado, o sistema irá informar erro novamente na tela, e voltará ao menu principal.
    static public void AtualizarVeiculo(List<Veiculo> veiculo){
        
        boolean cont = true;
        if(veiculo.size() != 0){

            while(cont){
                
                Terceiros.procurarVeiculo(veiculo, "ATUALIZAÇÃO DOS DADOS DO VEÍCULO");
                Terceiros.clearConsole();
                
                if(!Terceiros.r.equals("-1")){
                
                    if(Terceiros.veiculoEncontrado){    

                        if(Terceiros.checarMetodos(veiculo.get(Terceiros.indexVeiculo), "getNumPortas")){

                            Veiculo carroAtualizado = Construcao.CadastroCarro("ATUALIZAÇÃO DO DADOS DO CARRO");
                            veiculo.set(Terceiros.indexVeiculo, carroAtualizado);
                            Visual.Aviso("ATUALIZADO!", "VEÍCULO ATUALIZADO COM SUCESSO!", "VEÍCULO ATUALIZADO COM SUCESSO!");
                        }
                        else{
                            Veiculo motoAtualizado = Construcao.CadastroMoto("ATUALIZAÇÃO DO DADOS DA MOTO");
                            veiculo.set(Terceiros.indexVeiculo, motoAtualizado);
                            Visual.Aviso("ATUALIZADO!", "VEÍCULO ATUALIZADO COM SUCESSO!", "VEÍCULO ATUALIZADO COM SUCESSO!");
                        }

                    }   
                   else Visual.Aviso("ERROR!", "VEÍCULO NÃO ENCONTRADO!", "VEÍCULO NÃO ENCONTRADO! TENTE NOVAMENTE...");
                }
                
                //Continuar rodando o programa até encontra o veiculo, 
                //ou enquanto não digita -1 para sair do programa, ou enquanto tive alguma veiculo cadastrado
                cont = Terceiros.veiculoEncontrado == false && !Terceiros.r.equals("-1") && veiculo.size() > 0;
                
            }

        }
        else Visual.Aviso("ERROR!", "NÃO HÁ UM VEÍCULO CADASTRADO!", "NÃO HÁ UM VEÍCULO CADASTRADO NO SISTAMA!");
    }
    
    //Mostra os veiculos cadastrados
    // Caso não tenha nenhum veiculo cadastrado, o sistema irá informar erro na tela, e voltará ao menu principal. 
    public static void ListarVeiculos(List<Veiculo> veiculos) {
        
        int quant = 0;
        
        
        if(veiculos.size() > 0){
            
                 int op = Visual.ListarTipoVeiculo();
                 Terceiros.clearConsole();
                 
                  switch(op){
                       
                    case 1:
                        
                        quant = 0;
                        System.out.println("=== CARROS CADASTRADOS NO SISTEMAS ===");
                        System.out.println("--------------------------------------");
                        
                        
                        for (int i = 0; i < veiculos.size(); i++) {
                            
                            if(Terceiros.checarMetodos(veiculos.get(i), "getNumPortas"))
                            {
                                quant++;
                                System.out.println("---");
                                System.out.println(quant + "º CARRO " +  veiculos.get(i).toString());
                                System.out.println("---");
                            }     
                           
                        }
                           if(quant == 0) 
                              Visual.Aviso("ERROR!", "NÃO HÁ UM VEÍCULO CADASTRADO!", "NÃO HÁ UM VEÍCULO CADASTRADO NO SISTAMA!");
                           else{
                                System.out.println();  
                                System.out.print("PRESSIONE ENTER PARA CONTINUAR.");
                                in.nextLine();
                                Terceiros.clearConsole();
                           }
                           
                         break;

                    case 2:
                        
                        quant = 0;
                        
                        System.out.println("=== MOTOS CADASTRADOS NO SISTEMAS ===");
                        System.out.println("-------------------------------------");
                        
                        for (int i = 0; i < veiculos.size(); i++) {
                            
                            if(Terceiros.checarMetodos(veiculos.get(i), "setCilindradas"))
                            {
                                quant++;
                                System.out.println("----");
                                System.out.println(quant + "º MOTO " +  veiculos.get(i).toString());
                                System.out.println("----");
                            }
                          
                        }
                        if(quant == 0) 
                           Visual.Aviso("ERROR!", "NÃO HÁ UM VEÍCULO CADASTRADO!", "NÃO HÁ UM VEÍCULO CADASTRADO NO SISTAMA!");
                        
                        else{
                            System.out.println();  
                            System.out.print("PRESSIONE ENTER PARA CONTINUAR.");
                            in.nextLine();
                            Terceiros.clearConsole();
                        }

                         break;
                    case 3:
                        quant = 0;
                         
                        System.out.println("=== VEÍCULOS CADASTRADOS NO SISTEMAS ===");
                        System.out.println("----------------------------------------");
                         
                        for (Veiculo veiculo : veiculos) {
                            
                            quant++;
                             System.out.println("---");
                             System.out.println(quant + "º VEÍCULO " + veiculo.toString());
                             System.out.println("---");
                         }
                        
                        System.out.println();  
                        System.out.print("PRESSIONE ENTER PARA CONTINUAR.");
                        in.nextLine();
                        Terceiros.clearConsole();
      
                        break;
                        
                    default:
                        Visual.AvisoSimples("VOLTOU AO MENU");
                        break;
                 }
               
                  
              
              }
              else Visual.Aviso("ERROR!", "NÃO HÁ UM VEÍCULO CADASTRADO!", "NÃO HÁ UM VEÍCULO CADASTRADO NO SISTAMA!");
    }
    
    // faz o calculo do IPVA de um veiculo, especificando a placa, e posteriomente, informando o valor de mercado/venal
    // Caso não encontre o veiculo ou a placa for digitada errada, o sistema irá informar erro na tela, pedindo para tenta novamente. 
    // ou caso não tenha nenhum veiculo cadastrado, o sistema irá informar erro novamente na tela, e voltará ao menu principal. 
    public static void CalcularIPVA(List<Veiculo> veiculos){
        
        boolean cont = true;
 
        if(veiculos.size() > 0){

            int op = Visual.EscolherTipoVeiculo("TIPO DE VEÍCULO");
            Terceiros.clearConsole();
            
            if(op == 1 || op == 2){
                
                
                while(cont){

                    switch(op){

                        case 1:
                         
                            if(Terceiros.ChecarTipoVeiculo(veiculos, "getNumPortas", "NÃO HÁ UM CARRO CADASTRADO SISTEMA!")){
    
                                Terceiros.procurarVeiculo(veiculos, "CALCULO DO IPVA");
                                
                                if(!Terceiros.r.equals("-1")){  
                                    
                                    if(Terceiros.veiculoEncontrado){

                                        Veiculo carro = veiculos.get(Terceiros.indexVeiculo);
                                        Visual.MostraVeiculo("Carro", carro.getMarca(), carro.getModelo(), carro.getAnoFabricacao());
                                         
                                        if(carro.getIPVA() == 0){
                                            double valorVenal = Tratamento_De_Exececao.FLOATInputMismatch("VALOR VENAL DO VEÍCULO: ");
                                            double IPVA = valorVenal * 0.03; 
                                            carro.setIPVA(IPVA); 
                                        }
                                        
                                        Visual.MostraIPVAVeiculo(carro.getIPVA());
                                    }  
                                    else Visual.Aviso("ERROR!", "VEÍCULO NÃO ENCONTRADO!", "VEÍCULO NÃO ENCONTRADO! TENTE NOVAMENTE...");
                                }
                            }
                            else
                                return;

                           break;

                        case 2:
        
                           if(Terceiros.ChecarTipoVeiculo(veiculos, "setCilindradas", "NÃO HÁ UMA MOTO CADASTRADA SISTEMA!")){
                              
                               Terceiros.procurarVeiculo(veiculos, "CALCULO DO IPVA");
                               
                                if(!Terceiros.r.equals("-1")){

                                    if(Terceiros.veiculoEncontrado){

                                        Veiculo moto = veiculos.get(Terceiros.indexVeiculo);
                                        Visual.MostraVeiculo("Moto", moto.getMarca(), moto.getModelo(), moto.getAnoFabricacao());
                                        
                                        if(moto.getIPVA() == 0){
                                            
                                            float valorVenal = Tratamento_De_Exececao.FLOATInputMismatch("VALOR VENAL DO VEÍCULO: ");
                                            double IPVA = valorVenal * 0.025; 
                                            moto.setIPVA(IPVA);
                                        }

                                        Visual.MostraIPVAVeiculo(moto.getIPVA());
                                    }
                                    else Visual.Aviso("ERROR!", "VEÍCULO NÃO ENCONTRADO!", "VEÍCULO NÃO ENCONTRADO! TENTE NOVAMENTE...");
                                }
                            }
                           else
                               return;

                          break;     
                    }
 
                    //Continuar rodando o programa até encontra o veiculo, 
                    //ou enquanto não digita -1 para sair do programa, ou enquanto tive alguma veiculo cadastrado
                    
                    cont =  veiculos.size() > 0 
                            && Terceiros.veiculoEncontrado == false
                            &&  !Terceiros.r.equals("-1"); 
                }

            }
     
        }
        else Visual.Aviso("ERROR!", "NÃO HÁ UM VEÍCULO CADASTRADO!", "NÃO HÁ UM VEÍCULO CADASTRADO NO SISTAMA!");
        
    }

}
