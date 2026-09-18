package bridge;

public class Medico extends Cargo {
    public Medico(float salariobase) { super(salariobase); }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.escolaridade.percentualAumento());
    }
}
