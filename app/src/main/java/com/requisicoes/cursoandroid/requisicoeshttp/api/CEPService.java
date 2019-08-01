package com.requisicoes.cursoandroid.requisicoeshttp.api;

import com.requisicoes.cursoandroid.requisicoeshttp.model.CEP;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by jamiltondamasceno
 */

public interface CEPService {

    @GET("01310100/json/")
    Call<CEP> recuperarCEP();

}
