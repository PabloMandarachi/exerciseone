package com.exerciseone.dao;

import com.exerciseone.entity.Family;

import org.springframework.data.repository.CrudRepository;

/**
 * Repositorio de la clase Family.
 * 
 * @see com.exerciseone.entity.Family
 * 
 * @author pmandara
 *
 */
public interface IFamilyDao extends CrudRepository<Family, Integer> {
}
