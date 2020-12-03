package com.serverless;

import javafx.beans.binding.BooleanExpression;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class ResponderModelTest {

    ResponderModel responder = new ResponderModel();

    @Test
    public void cuandoLaPreguntaEsVaciaDebeRetornarElNombreDelEquipo(){
        String question = "";
        String response = responder.answer(question);
        assertThat(response).isEqualTo("Manuel");
    }

    @Test
    public void cuandoSumo2Y2Retorna4 (){
        String question = "56373347 What is 2 plus 2";
        String response = responder.answer(question);
        assertThat(response).isEqualTo("4");
    }


}