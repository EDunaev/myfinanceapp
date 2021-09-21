package com.dunaevi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "family_income")
public class FamilyIncome {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "income")
    private Integer income;

    @Column(name = "real_income")
    private Integer realIncome;

    @ManyToOne
    @JoinColumn(name = "family_member_id")
    private FamilyMember familyMember;

    @ManyToOne
    @JoinColumn(name = "month_id")
    private MonthEntry monthEntry;

    public FamilyIncome() {

    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public Integer getIncome() {

        return income;
    }

    public void setIncome(Integer income) {

        this.income = income;
    }

    public FamilyMember getFamilyMember() {

        return familyMember;
    }

    public void setFamilyMember(FamilyMember familyMember) {

        this.familyMember = familyMember;
    }

    public MonthEntry getMonthEntry() {
		return monthEntry;
	}

    public void setMonthEntry(MonthEntry monthEntry) {

        this.monthEntry = monthEntry;
    }

    public Integer getRealIncome() {

        return realIncome;
    }

    public void setRealIncome(Integer realIncome) {

        this.realIncome = realIncome;
    }

}
