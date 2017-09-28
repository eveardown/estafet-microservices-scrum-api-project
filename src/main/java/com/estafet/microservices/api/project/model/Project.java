package com.estafet.microservices.api.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PROJECT")
public class Project {

	@Id
	@SequenceGenerator(name = "PROJECT_ID_SEQ", sequenceName = "PROJECT_ID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROJECT_ID_SEQ")
	@Column(name = "PROJECT_ID")
	private int id;

	@Column(name = "TITLE", nullable = false)
	private String title;

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Project setTitle(String title) {
		this.title = title;
		return this;
	}

}
