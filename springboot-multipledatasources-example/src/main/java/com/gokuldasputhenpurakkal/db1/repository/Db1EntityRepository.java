package com.gokuldasputhenpurakkal.db1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gokuldasputhenpurakkal.db1.model.Db1Entity;

public interface Db1EntityRepository extends JpaRepository<Db1Entity, Long>{
	
	@Query(value = "SELECT 1 AS key, current_database() AS database_name ", nativeQuery=true)
	Db1Entity getDb2Entity();

}
