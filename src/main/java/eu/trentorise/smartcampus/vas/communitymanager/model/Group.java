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

import eu.trentorise.smartcampus.presentation.data.BasicObject;

public class Group extends BasicObject {

	private static final long serialVersionUID = -8346644455435095887L;

	private long socialId;
	private String name;
	private List<MinimalProfile> users;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<MinimalProfile> getUsers() {
		return users;
	}

	public void setUsers(List<MinimalProfile> users) {
		this.users = users;
	}

	public long getSocialId() {
		return socialId;
	}

	public void setSocialId(long id) {
		this.socialId = id;
	}

	@Override
	public String getId() {
		return ""+getSocialId();
	}

}
