package br.com.pocjpa.config;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 * @author s
 *
 */
public class StartJPA {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence
				.createEntityManagerFactory("configjpa");
		
		
		

	}

}
