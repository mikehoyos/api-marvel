package com.api.marvel.business;

import com.api.marvel.entity.Bitacora;
import com.api.marvel.repository.BitacoralRepository;
import com.api.marvel.service.BitacoraService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class BitacoraBusiness implements BitacoraService {
    @Autowired
    private BitacoralRepository bitacoralRepository;
    /**
     * Metodo para obtener toda la bitacora
     *
     * @return lista
     */
    @Override
    public List<Bitacora> bitacoras() {
        return bitacoralRepository.findAll();
    }

    /**
     * Metodo para actualizar bitacora
     *
     * @param bitacora
     * @return bitacora
     */
    @Override
    public Bitacora updateBitacora(Bitacora bitacora) {
        return bitacoralRepository.save(bitacora);
    }
}
