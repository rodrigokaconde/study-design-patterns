package com.rfoliveira.padroesprojetospring.repository;

import com.rfoliveira.padroesprojetospring.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
}
