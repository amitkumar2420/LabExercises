package com.abc.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.abc.entity.Author;
import com.abc.entity.Book;

public class AuthorBookMain {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CAP-DB");
		EntityManager entityManager = factory.createEntityManager();
		
//		Author author1=new Author();
//		author1.setId(1);
//		author1.setName("Raj");
		
		Book book1=new Book();
		book1.setIsbn(111);
		book1.setPrice(1000);
		book1.setTitle("Java");
		
		Book book2=new Book();
		book2.setIsbn(222);
		book2.setPrice(500);
		book2.setTitle("c++");
		
		Author author1=new Author();
		author1.setId(1);
		author1.setName("Raj");
		
		author1.addBook(book1);
		author1.addBook(book2);
		
		EntityTransaction txn = entityManager.getTransaction();
		txn.begin();
		
		entityManager.persist(author1);
		
		System.out.println("Added author along with book details to database.");

		txn.commit();
		entityManager.close();		
		factory.close();
		
		
		
		
		
		
	}

}
