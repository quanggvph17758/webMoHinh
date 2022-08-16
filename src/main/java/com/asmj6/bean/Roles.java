package com.asmj6.bean;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Roles {
	@Id
	private String id;
	@Column
	private String name;
	@JsonIgnore
	@OneToMany(mappedBy = "role")
	List<Authorities> authorities;
}
