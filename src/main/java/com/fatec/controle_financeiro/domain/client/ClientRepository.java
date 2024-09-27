package com.fatec.controle_financeiro.domain.client;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fatec.controle_financeiro.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {
  
}
