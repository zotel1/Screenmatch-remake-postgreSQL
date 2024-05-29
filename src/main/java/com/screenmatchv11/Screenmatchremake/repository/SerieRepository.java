package com.screenmatchv11.Screenmatchremake.repository;

import com.screenmatchv11.Screenmatchremake.model.Categoria;
import com.screenmatchv11.Screenmatchremake.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface SerieRepository extends JpaRepository <Serie, Long> {

    Optional<Serie> findByTituloContainsIgnoreCase(String nombreSerie);

    List<Serie> findTop5ByOrderByEvaluacionDesc();

    List<Serie> findByGenero(Categoria categoria);

    // List<Serie> findByTotalTemporadasLessThanEqualAndEvaluacionGreaterThanEqual(int totalTemporadas, Double evaluacion);

    @Query(value = "SELECT * FROM series WHERE series.total_temporadas <= 6 AND series.evaluacion >= 7.5", nativeQuery = true)
    List<Serie> seriesPorTemporadaYEvaluacion();

}
