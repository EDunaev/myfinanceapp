package com.dunaevi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="family_income")
public class FamilyIncome {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="income")
	private int income;
	
	@ManyToOne
	@Column(name="family_member_id")
	private FamilyMember familyMember;
	
	public FamilyIncome() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

    public FamilyMember getFamilyMember() {
    
        return familyMember;
    }

    public void setFamilyMember(FamilyMember familyMember) {
    
        this.familyMember = familyMember;
    }

	
	

}
