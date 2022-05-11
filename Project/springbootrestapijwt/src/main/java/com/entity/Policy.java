package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "policies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Policy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String policy_type;
	private long policy_number;
	private String policy_name;
	private String policy_terms;
	private long policy_period;
	private long interest;
	private long bonus;
	private long installments;
	private long installment_amt;
	private long returns;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPolicy_type() {
		return policy_type;
	}
	public void setPolicy_type(String policy_type) {
		this.policy_type = policy_type;
	}
	public long getPolicy_number() {
		return policy_number;
	}
	public void setPolicy_number(long policy_number) {
		this.policy_number = policy_number;
	}
	public String getPolicy_name() {
		return policy_name;
	}
	public void setPolicy_name(String policy_name) {
		this.policy_name = policy_name;
	}
	public String getPolicy_terms() {
		return policy_terms;
	}
	public void setPolicy_terms(String policy_terms) {
		this.policy_terms = policy_terms;
	}
	public long getPolicy_period() {
		return policy_period;
	}
	public void setPolicy_period(long policy_period) {
		this.policy_period = policy_period;
	}
	public long getInterest() {
		return interest;
	}
	public void setInterest(long interest) {
		this.interest = interest;
	}
	public long getBonus() {
		return bonus;
	}
	public void setBonus(long bonus) {
		this.bonus = bonus;
	}
	public long getInstallments() {
		return installments;
	}
	public void setInstallments(long installments) {
		this.installments = installments;
	}
	public long getInstallment_amt() {
		return installment_amt;
	}
	public void setInstallment_amt(long installment_amt) {
		this.installment_amt = installment_amt;
	}
	public long getReturns() {
		return returns;
	}
	public void setReturns(long returns) {
		this.returns = returns;
	}
	@Override
	public String toString() {
		return "Policy [id=" + id + ", policy_type=" + policy_type + ", policy_number=" + policy_number
				+ ", policy_name=" + policy_name + ", policy_terms=" + policy_terms + ", policy_period=" + policy_period
				+ ", interest=" + interest + ", bonus=" + bonus + ", installments=" + installments
				+ ", installment_amt=" + installment_amt + ", returns=" + returns + "]";
	}
	public Policy(Long id, String policy_type, long policy_number, String policy_name, String policy_terms,
			long policy_period, long interest, long bonus, long installments, long installment_amt, long returns) {
		super();
		this.id = id;
		this.policy_type = policy_type;
		this.policy_number = policy_number;
		this.policy_name = policy_name;
		this.policy_terms = policy_terms;
		this.policy_period = policy_period;
		this.interest = interest;
		this.bonus = bonus;
		this.installments = installments;
		this.installment_amt = installment_amt;
		this.returns = returns;
	}
	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
