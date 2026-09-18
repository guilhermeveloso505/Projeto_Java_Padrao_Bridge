package bridge;

public class TecnicoEnfermagem extends Cargo {

    public TecnicoEnfermagem(float salariobase) { super(salariobase); }

    public float calcularSalario() { return this.salarioBase; }
}
