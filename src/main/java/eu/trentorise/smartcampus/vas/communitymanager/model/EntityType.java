package eu.trentorise.smartcampus.vas.communitymanager.model;

import eu.trentorise.smartcampus.common.Concept;

public class EntityType {
	private long id;
	private String name;
	private Concept concept;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Concept getConcept() {
		return concept;
	}

	public void setConcept(Concept concept) {
		this.concept = concept;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
