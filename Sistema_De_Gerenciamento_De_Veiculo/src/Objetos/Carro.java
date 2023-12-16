
package Objetos;

// Objeto filho, que herda do objeto Veiculo
public class Carro extends Veiculo{

    private int numPortas;
    private String TipoCombustivel; 
    
    public String getTipoCombustivel() {
        return TipoCombustivel;
    }

    public void setTipoCombustivel(String TipoCombustivel) {
        this.TipoCombustivel = TipoCombustivel;
    }
    
    public int getNumPortas() {
        return numPortas;
    }


    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    
     // Retorna todos os atributos comum do objeto carro, incluindo os atributos que ele herda do Objeto pai
    public String toString() {
        return 
         "\n| MARCA: " + getMarca() + " | | MODELO: " + getModelo() + " | | ANO DE FABRICAÇÃO: " + getAnoFabricacao() + " | \n"
        +"| PLACA: " + getPlaca() + " | | NÚMERO DE PORTAS: " + numPortas + " | | TIPO DE COMBUSTÍVEL: " + getTipoCombustivel() + ". | \n"
        +"| VALOR DO IPVA: R$" + getIPVA() + " | ";
    }


    
    
    
    
    
    
}
