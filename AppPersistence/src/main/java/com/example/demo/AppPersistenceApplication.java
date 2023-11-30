package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entidades.Calificacion;
import com.example.entidades.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@SpringBootApplication
public class AppPersistenceApplication {

	public static void main(String[] args) {
		EntityManagerFactory mf = Persistence.createEntityManagerFactory("PersistenciaPU");
		EntityManager em = mf.createEntityManager();
		
		try {
			Cliente cliente1 = new Cliente("Raul", "Gomez", "42648975");
			Calificacion C1 = new Calificacion("12am", "Tucumán");
			cliente1.setRelacional(C1);
			Cliente cliente2 = new Cliente("Ariel", "Castro", "42340389");
			Calificacion C2 = new Calificacion ("12pm","Buenos Aires" );
			cliente2.setRelacional(C2);

			em.getTransaction().begin();
			em.persist(cliente1);
			em.persist(cliente2);
			em.flush();
			em.getTransaction().commit();
		}catch (Exception e) {
			em.getTransaction().rollback();
		}
		
			em.close();
			mf.close();
	}

}
