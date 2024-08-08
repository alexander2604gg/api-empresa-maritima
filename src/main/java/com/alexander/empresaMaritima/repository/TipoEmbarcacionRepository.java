package com.alexander.empresaMaritima.repository;

import com.alexander.empresaMaritima.model.TipoEmbarcacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoEmbarcacionRepository extends CrudRepository<TipoEmbarcacion,Long> {
}
