package com.screenmatchv11.Screenmatchremake.service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);}
