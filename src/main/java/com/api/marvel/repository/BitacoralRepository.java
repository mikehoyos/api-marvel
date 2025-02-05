package com.api.marvel.repository;

import com.api.marvel.entity.Bitacora;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BitacoralRepository extends JpaRepository<Bitacora, Long> {

}
