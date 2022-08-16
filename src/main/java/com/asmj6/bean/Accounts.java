package com.asmj6.bean;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
@SuppressWarnings("serial")
@Entity
@Table
@Data
public class Accounts {
	@Id
	String username;
	@Column
	String password;
	@Column
	String fullname;
	@Column
	String email;
	@Column
	String photo;
	@JsonIgnore
	@OneToMany(mappedBy = "account")
	List<Orders> orders;
	
	@JsonIgnore
	@OneToMany(mappedBy = "account", fetch = FetchType.EAGER)
	List<Authorities> authorities;
}
