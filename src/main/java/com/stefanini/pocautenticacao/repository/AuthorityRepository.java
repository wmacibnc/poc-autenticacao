package com.stefanini.pocautenticacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stefanini.pocautenticacao.model.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String>{
	
	Authority findByName(String name);
	
}