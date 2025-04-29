package com.javatests.j2ee.javatest;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BonLivraisonRepository extends JpaRepository<BonLivraison, Long> {
    Optional<BonLivraison> findByNumero(String numero);
}
