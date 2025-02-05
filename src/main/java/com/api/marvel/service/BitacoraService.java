package com.api.marvel.service;

import com.api.marvel.entity.Bitacora;

import java.util.List;

public interface BitacoraService {
    /**
     * Metodo para obtener toda la bitacora
     * @return lista
     */
    List<Bitacora> bitacoras ();

    /**
     * Metodo para actualizar bitacora
     * @param bitacora
     * @return bitacora
     */
    Bitacora updateBitacora(Bitacora bitacora);
}
