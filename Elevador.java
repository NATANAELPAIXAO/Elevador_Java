/* Autor: Natanael de Aguiar Paixão
 * Git: https://github.com/NATANAELPAIXAO
 */

public class Elevador {

  // Variaveis globais
  private int Atual, Total, Capac, Pessoas;

  /**
   * @param atual
   * @param total
   * @param capac
   * @param pessoas
   */
  public Elevador(int atual, int total, int capac, int pessoas) {
    Atual = atual;
    Total = total;
    Capac = capac;
    Pessoas = pessoas;
  }

  // Get - Capacidade
  public int getCapac() {
    return this.Capac;
  }

  // Get - Pessoas presentes
  public int getPessoas() {
    return this.Pessoas;
  }

  // Get - Total de andares
  public int getTotal() {
    return this.Total;
  }

  // Get - Andar Atual
  public int getAtual() {
    return this.Atual;
  }

  // Set - Pessoas Presentes
  public void setPes(int Pe) {
    this.Pessoas = Pe;
  }

  // Inicializa
  public void Inicializa(int Cap, int Tot) {
    this.Total = Tot;
    this.Capac = Cap;
  }

  // Entra pessoa
  public void Entra() {
    this.Pessoas += 1;
  }

  // Sai pessoa
  public void Sai() {
    this.Pessoas -= 1;
  }

  // Sobe de andar
  public void Sobe() {
    this.Atual += 1;
  }

  // Desce de andar
  public void Desce() {
    this.Atual -= 1;
  }

}
