package com.gokuldasputhenpurakkal.db2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Db2Entity {

	@Id
	Integer key;
	
	@Column(name="database_name")
	String databaseName;
	
}
