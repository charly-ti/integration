package com.example.camel.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.camel.model.ResFolioToDB;

public interface FolioRepository extends JpaRepository<ResFolioToDB, Long> {

}
