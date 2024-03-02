public class Carro {
  String marca;
  String modelo;
  int velocidade;

  public Carro() {
  }

  public Carro(String marca, String modelo, int velocidade) {
    this.marca = marca;
    this.modelo = modelo;
    this.velocidade = velocidade;
  }

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

  public int getVelocidade() {
    return velocidade;
  }

  public void setVelocidade(int velocidade) {
    this.velocidade = velocidade;
  }

  public void acelerar() {
    this.velocidade += 10;
  }

  public void frear() {
    this.velocidade -= 5;
  }

  public void exibirInformacoes() {
    System.out.println("Marca: " + this.marca + " Modelo: " + this.modelo + " Velocidade atual: " + this.velocidade);
  }
}