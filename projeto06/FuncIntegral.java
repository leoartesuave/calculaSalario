
/**
 * Escreva uma descrição da classe FuncIntegral aqui.
 * 
 * @author (Alfamidia) 
 * @version (27/06/2023)
 */
public class FuncIntegral extends Funcionario
{
    private double bas;
    /**
     * Cosntrutor para Objetos da classe FuncIntegral
     */
   public FuncIntegral(String nom, String ema, double bas)
   {
        super(nom, ema);
        this.bas= bas;
    }
   
     //método para realizar o calculo do funcionario
    public double calcularSalario() {
        double sal = this.bas - (this.bas * this.TAX);
        return sal;
    }
}
