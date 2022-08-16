package com.asmj6.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;

@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "Username", "Roleid" }) })
@Data
public class Authorities {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "Username")
	private Accounts account;
	@ManyToOne
	@JoinColumn(name = "Roleid")
	private Roles role;
}
