package com.banque;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.banque.dao.ClientRepository;
import com.banque.dao.CompteRepository;
import com.banque.dao.OperationRepository;
import com.banque.entities.Client;
import com.banque.entities.Compte;
import com.banque.entities.CompteCourant;
import com.banque.entities.CompteEpargne;
import com.banque.entities.Retrait;
import com.banque.entities.Versement;
import com.banque.metier.IBanqueMetier;

@SpringBootApplication

public class MaBanqueApplication implements CommandLineRunner {
    @Autowired    
	private ClientRepository clientRepository; 
    @Autowired 
    private CompteRepository compteRepository;
    @Autowired 
    private OperationRepository operationRepository;
    @Autowired
    private IBanqueMetier iBanqueMetier;
	public static void main(String[] args) {
		SpringApplication.run(MaBanqueApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		Client c1=clientRepository.save(new Client("Iskander","iskanderfriaa@gmail.com"));
		Client c2=clientRepository.save(new Client("oumaima","oumaimafriaa@gmail.com"));
		
		Compte cp1 = compteRepository.save(new CompteCourant("c1", new Date(), 90000, c1, 6000));
		Compte cp2 = compteRepository.save(new CompteEpargne("c2", new Date(), 6000, c2, 5.5));
		
		operationRepository.save(new Versement(new Date(), 9000, cp1));
		operationRepository.save(new Versement(new Date(), 6000, cp1));
		operationRepository.save(new Versement(new Date(), 2300, cp1));
		operationRepository.save(new Retrait(new Date(), 9000, cp1));
		
		operationRepository.save(new Versement(new Date(), 2300, cp2));
		operationRepository.save(new Versement(new Date(), 6000, cp2));
		operationRepository.save(new Versement(new Date(), 2000, cp2));
		operationRepository.save(new Retrait(new Date(), 3000, cp2));
		
		iBanqueMetier.verser("c1", 11111111);
		*/
	}
	

}
