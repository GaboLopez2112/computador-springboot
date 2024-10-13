package com.uisrale.computadora.modelo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tbl_computador")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Computadora {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_comp")
	private Integer id;
	@Column(name="procesador")
	private String procesador;
	@Column(name="ram")
	private String ram;
	@Column(name="disco_duro")
	private String discoDuro;

}
