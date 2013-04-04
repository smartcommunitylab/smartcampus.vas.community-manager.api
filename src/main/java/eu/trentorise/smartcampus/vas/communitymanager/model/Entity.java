package eu.trentorise.smartcampus.vas.communitymanager.model;

import java.util.List;

import eu.trentorise.smartcampus.common.Concept;

public class Entity {
	private long id;
	private long creatorId;

	// I can have type as name or as its id
	private String type;
	private long typeId;

	private String name;
	private String description;
	private List<Concept> tags;
	private List<Long> relations;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(long creatorId) {
		this.creatorId = creatorId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Concept> getTags() {
		return tags;
	}

	public void setTags(List<Concept> tags) {
		this.tags = tags;
	}

	public List<Long> getRelations() {
		return relations;
	}

	public void setRelations(List<Long> relations) {
		this.relations = relations;
	}

	public long getTypeId() {
		return typeId;
	}

	public void setTypeId(long typeId) {
		this.typeId = typeId;
	}

}
