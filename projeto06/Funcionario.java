
/**
 * Escreva uma descrição da classe Funcionario aqui.
 * 
 * @author (Alfamidia) 
 * @version (27/06/2023)
 */
public abstract class Funcionario
{
    //constante (final) que pode ser acessada
    //dentro da estrutura hierárquica (protected)
    protected final double TAX = 0.10;
    
    
    //outros atributos com acesso local
    private String nom;
    private String ema;
    
    /**
     * Cosntrutor para Objetos da classe Funcionario
     */
    
    
  public Funcionario(String nom, String ema){
        
      this.nom = nom;
      this.ema = ema;
    }
    
    public void setNome(String nom){
    
        this.nom = nom;
    }
    
    public String getNome(){
        return this.nom;
    }
    
    //método módelo para ser OBRIGATORIAMENTE implementado 
    //nas subclasses (classes que herdam Funcionário)
    public abstract double calcularSalario();
}
