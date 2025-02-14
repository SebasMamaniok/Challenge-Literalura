package com.alura.literalura.repository;

import com.alura.literalura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface AutorRepository extends JpaRepository<Autor, Long> {
    // Busqueda por nombre
    Optional<Autor> findByNombre(String nombre);

    // Busqueda de autores vivos
    List<Autor> findByBirthYearLessThanEqualAndDeathYearGreaterThanEqualOrDeathYearIsNull(int birthYear, int deathYear);

}