package com.example.nbpdownloader.repository;

import com.example.nbpdownloader.model.CenaZlota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CenaZlotaRepository extends JpaRepository<CenaZlota, Long> {
}
