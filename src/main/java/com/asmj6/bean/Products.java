package com.asmj6.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Products {
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	@Column
	String name;
	@Column
	String image;
	@Column
	Double price;
	@Temporal(TemporalType.DATE)
	@Column(name = "Createdate")
	Date createDate = new Date();
	@Column
	Boolean available;
	@ManyToOne
	@JoinColumn(name = "Categoryid")
	Categories category;
	@JsonIgnore
	@OneToMany(mappedBy = "product")
	List<OrderDetail> orderDetails;
}
