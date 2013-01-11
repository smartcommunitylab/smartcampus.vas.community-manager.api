/*******************************************************************************
 * Copyright 2012-2013 Trento RISE
 * 
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0
 * 
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 ******************************************************************************/
package eu.trentorise.smartcampus.vas.communitymanager.model;

import java.util.List;

import eu.trentorise.smartcampus.common.Concept;
import eu.trentorise.smartcampus.presentation.data.BasicObject;

public class Topic extends BasicObject {
	private static final long serialVersionUID = -6406159100675282522L;

	private long socialId;
	private String name;
	private int status;
	private List<Concept> concepts;
	private List<String> keywords;
	private List<MinimalProfile> users;
	private List<Group> groups;
	private List<Community> communities;
	private List<String> contentTypes;

	private boolean allKnownUsers;
	private boolean allKnownCommunities;
	private boolean allUsers;
	private boolean allCommunities;
	private List<Concept> entities;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Concept> getConcepts() {
		return concepts;
	}

	public void setConcepts(List<Concept> concepts) {
		this.concepts = concepts;
	}

	public List<MinimalProfile> getUsers() {
		return users;
	}

	public void setUsers(List<MinimalProfile> users) {
		this.users = users;
	}

	public List<Group> getGroups() {
		return groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	public List<Community> getCommunities() {
		return communities;
	}

	public void setCommunities(List<Community> communities) {
		this.communities = communities;
	}

	public List<String> getContentTypes() {
		return contentTypes;
	}

	public void setContentTypes(List<String> contentTypes) {
		this.contentTypes = contentTypes;
	}

	public List<String> getKeywords() {
		return keywords;
	}

	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}

	public long getSocialId() {
		return socialId;
	}

	public void setSocialId(long socialId) {
		this.socialId = socialId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String getId() {
		return "" + getSocialId();
	}

	public boolean isAllKnownUsers() {
		return allKnownUsers;
	}

	public void setAllKnownUsers(boolean allKnownUsers) {
		this.allKnownUsers = allKnownUsers;
	}

	public boolean isAllKnownCommunities() {
		return allKnownCommunities;
	}

	public void setAllKnownCommunities(boolean allKnownCommunities) {
		this.allKnownCommunities = allKnownCommunities;
	}

	public boolean isAllUsers() {
		return allUsers;
	}

	public void setAllUsers(boolean allUsers) {
		this.allUsers = allUsers;
	}

	public boolean isAllCommunities() {
		return allCommunities;
	}

	public void setAllCommunities(boolean allCommunities) {
		this.allCommunities = allCommunities;
	}

	public List<Concept> getEntities() {
		return entities;
	}

	public void setEntities(List<Concept> entities) {
		this.entities = entities;
	}

}
