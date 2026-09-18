package bridge;

public class Enfermagem extends Cargo {
    public Enfermagem(float salariobase){ super(salariobase); }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.escolaridade.percentualAumento());
    }
}
