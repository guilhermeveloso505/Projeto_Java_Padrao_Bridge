package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicoTest {

    @Test
    void RetornarSalarioMedicoComEnsinoMedio() {
        Escolaridade escolaridade = new EnsinoMedio();
        Medico medico = new Medico(12000.0f);
        medico.setEscolaridade(escolaridade);
        assertEquals(12000.0f, medico.calcularSalario(), 0.01f);
    }

    @Test
    void RetornarSalarioMedicoComGraduacao() {
        Escolaridade escolaridade = new Graduacao();
        Medico medico = new Medico(12000.0f);
        medico.setEscolaridade(escolaridade);
        assertEquals(13200.0f, medico.calcularSalario(), 0.01f);
    }

    @Test
    void RetornarSalarioMedicoComMestrado() {
        Escolaridade escolaridade = new Mestrado();
        Medico medico = new Medico(12000.0f);
        medico.setEscolaridade(escolaridade);
        assertEquals(14400.0f, medico.calcularSalario(), 0.01f);
    }

    @Test
    void RetornarSalarioMedicoComDoutorado() {
        Escolaridade escolaridade = new Doutorado();
        Medico medico = new Medico(12000.0f);
        medico.setEscolaridade(escolaridade);
        assertEquals(15600.0f, medico.calcularSalario(), 0.01f);
    }

}