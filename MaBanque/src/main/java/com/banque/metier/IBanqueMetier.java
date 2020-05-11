package com.banque.metier;

import org.springframework.data.domain.Page;

import com.banque.entities.Compte;
import com.banque.entities.Operation;

public interface IBanqueMetier {
  
	public Compte consulterCompte(String codeCpte);
	public void verser(String code, double montant);
	public void retirer(String code, double montant);
	public void virement(String codeCpt1,String codeCpt2,double montant);
	public Page<Operation> listOperation(String codeCpt,int page, int size);
	
}
