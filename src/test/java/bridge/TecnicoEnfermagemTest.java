package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TecnicoEnfermagemTest {

    @Test
    void RetornarSalarioTecnicoEnfermagemComEnsinoMedio() {
        Escolaridade escolaridade = new EnsinoMedio();
        TecnicoEnfermagem tecnicoEnfermagem = new TecnicoEnfermagem(2200.0f);
        tecnicoEnfermagem.setEscolaridade(escolaridade);
        assertEquals(2200.0f, tecnicoEnfermagem.calcularSalario(), 0.01f);
    }

    @Test
    void RetornarSalarioTecnicoEnfermagemComGraduacao() {
        Escolaridade escolaridade = new Graduacao();
        TecnicoEnfermagem tecnicoEnfermagem = new TecnicoEnfermagem(2200.0f);
        tecnicoEnfermagem.setEscolaridade(escolaridade);
        assertEquals(2200.0f, tecnicoEnfermagem.calcularSalario(), 0.01f);
    }

    @Test
    void RetornarSalarioTecnicoEnfermagemComMestrado() {
        Escolaridade escolaridade = new Mestrado();
        TecnicoEnfermagem tecnicoEnfermagem = new TecnicoEnfermagem(2200.0f);
        tecnicoEnfermagem.setEscolaridade(escolaridade);
        assertEquals(2200.0f, tecnicoEnfermagem.calcularSalario(), 0.01f);
    }

    @Test
    void RetornarSalarioTecnicoEnfermagemComDoutorado() {
        Escolaridade escolaridade = new Doutorado();
        TecnicoEnfermagem tecnicoEnfermagem = new TecnicoEnfermagem(2200.0f);
        tecnicoEnfermagem.setEscolaridade(escolaridade);
        assertEquals(2200.0f, tecnicoEnfermagem.calcularSalario(), 0.01f);
    }

}