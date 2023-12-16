
package Objetos;


// Objeto filho, que herda do objeto Veiculo
public class Moto  extends Veiculo{
    
    private int cilindradas;
    private String tipoFreio;
    
    public int getCilindradas() {
        return cilindradas;
    }

 
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }


    public String getTipoFreio() {
        return tipoFreio;
    }

    public void setTipoFreio(String tipoFreio) {
        this.tipoFreio = tipoFreio;
    }
    
    
    // Retorna todos os atributos comum do objeto moto, incluindo os atributos que ele herda do Objeto pai
    public String toString() {
        return 
        "\n| MARCA: " + getMarca() + " | | MODELO: " + getModelo() + " | | ANO DE FABRICAÇÃO: " + getAnoFabricacao() + " | \n"
        +"| PLACA: " + getPlaca() + " | | TIPO DE FREIOS: " + tipoFreio + " | | CILINDRADA: " + cilindradas + "cc. | \n"
        +"| VALOR DO IPVA: R$" + getIPVA() + " | ";
    }
}
