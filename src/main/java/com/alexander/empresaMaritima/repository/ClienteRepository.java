package com.alexander.empresaMaritima.repository;

import com.alexander.empresaMaritima.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente,String> {
}
