/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.m001.jsonretrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 *
 * @author FP Mañana A
 */
public interface OperacionInterface {

    @GET("catalogo/dataset/3a1ab315-c3a5-405c-b2c8-8586e272d97b/resource/0a8cf335-46d9-46f6-a88e-5f70337ff5f2/download/calidad_aire_estaciones.json")
    Call<Estacion> estaciones();
}
