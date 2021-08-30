package com.dunaevi.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "family_member")
public class FamilyMember {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@OneToMany(mappedBy = "familyMember", fetch = FetchType.LAZY)
	private List<FamilyIncome> familyIncomes;

	public FamilyMember() {

	}

	public FamilyMember(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<FamilyIncome> getFamilyIncomes() {

		return familyIncomes;
	}

	public void setFamilyIncomes(List<FamilyIncome> familyIncomes) {

		this.familyIncomes = familyIncomes;
	}

	public void add(FamilyIncome familyIncome) {

		if (familyIncomes == null) {
			familyIncomes = new ArrayList<>();
		}

		familyIncomes.add(familyIncome);

		familyIncome.setFamilyMember(this);
	}
}
