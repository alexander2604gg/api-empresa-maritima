package com.alexander.empresaMaritima.repository;

import com.alexander.empresaMaritima.model.Embarcacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmbarcacionRepository extends CrudRepository<Embarcacion,String> {
}
