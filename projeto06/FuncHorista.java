
/**
 * Escreva uma descrição da classe FuncHorista aqui.
 * 
 * @author (Alfamidia) 
 * @version (27/06/2023)
 */
public class FuncHorista extends Funcionario
{
    private int qtd;
    private double val;
    
    /**
     * Cosntrutor para Objetos da classe FuncHorista
     */
   public FuncHorista(String nom, String ema, int qtd, double val)
   {
        //chamando o cosntrutor da classe pai
        super(nom, ema);
        
        //inicialização de outras variáveis específicas da Classe
        this.qtd = qtd;
        this.val = val;
    }
   
    //método para realizar o calculo do funcionario
    public double calcularSalario() {
        double bas = (this.qtd * this.val);
        double sal = bas - (bas * this.TAX);
        return sal;
    }
}
