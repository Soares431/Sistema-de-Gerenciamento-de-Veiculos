
package Objetos;

// Objeto Pai
public class Veiculo {
 
    private String marca;
    private String modelo; 
    private int anoFabricacao;
    private String placa; 
    private double IPVA;
   
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
  
    public String getModelo() {
        return modelo;
    }
  
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public double getIPVA() {
        return IPVA;
    }
    public void setIPVA(double IPVA) {
        this.IPVA = IPVA;
    }
    
    @ Override
    public String toString() {
        return 
        "Modelo: " + modelo + ";\n"
        + "Ano de Fabricacao: " + anoFabricacao + ";\n"
        + "Placa: " + placa;
    }
    
    
    
    
        
        

}
