package com.gokuldasputhenpurakkal.db2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gokuldasputhenpurakkal.db2.model.Db2Entity;

public interface Db2EntityRepository extends JpaRepository<Db2Entity, Long>{
	
	@Query(value = "SELECT 2 AS key, current_database() AS database_name ", nativeQuery=true)
	Db2Entity getDb2Entity();

}
