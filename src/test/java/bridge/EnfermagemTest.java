package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnfermagemTest {

    @Test
    void RetornarSalarioEnfermagemComEnsinoMedio() {
        Escolaridade escolaridade = new EnsinoMedio();
        Enfermagem enfermagem = new Enfermagem(4600.0f);
        enfermagem.setEscolaridade(escolaridade);
        assertEquals(4600.0f, enfermagem.calcularSalario(), 0.01f);
    }

    @Test
    void RetornarSalarioEnfermagemComGraduacao() {
        Escolaridade escolaridade = new Graduacao();
        Enfermagem enfermagem = new Enfermagem(4600.0f);
        enfermagem.setEscolaridade(escolaridade);
        assertEquals(5060.0f, enfermagem.calcularSalario(), 0.01f);
    }

    @Test
    void RetornarSalarioEnfermagemComMestrado() {
        Escolaridade escolaridade = new Mestrado();
        Enfermagem enfermagem = new Enfermagem(4600.0f);
        enfermagem.setEscolaridade(escolaridade);
        assertEquals(5520.0f, enfermagem.calcularSalario(), 0.01f);
    }

    @Test
    void RetornarSalarioEnfermagemComDoutorado() {
        Escolaridade escolaridade = new Doutorado();
        Enfermagem enfermagem = new Enfermagem(4600.0f);
        enfermagem.setEscolaridade(escolaridade);
        assertEquals(5980.0f, enfermagem.calcularSalario(), 0.01f);
    }

}