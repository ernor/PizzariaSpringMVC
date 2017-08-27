package br.com.pizzaria.modelo.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.pizzaria.modelo.entidades.Pizza;

@Repository
public interface PizzaRepositorio  extends CrudRepository<Pizza, Long>{

}
