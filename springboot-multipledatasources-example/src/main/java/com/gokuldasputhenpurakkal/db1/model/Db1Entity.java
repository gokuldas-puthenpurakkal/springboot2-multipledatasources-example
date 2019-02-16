package com.gokuldasputhenpurakkal.db1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Db1Entity {

	@Id
	Integer key;
	
	@Column(name="database_name")
	String databaseName;
	
}
