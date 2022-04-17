package com.mauri.car.mauricar.produto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.springframework.scheduling.annotation.AbstractAsyncConfiguration;

import com.fasterxml.classmate.AnnotationConfiguration;
import com.mauri.car.mauricar.produto.model.Produto;
import com.mauri.car.mauricar.produto.model.Usuario;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;

	static {

		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.addAnnotatedClass(Produto.class);
		configuration.addAnnotatedClass(Usuario.class);
		sessionFactory = configuration.buildSessionFactory();
		new SchemaExport().create(true, false);


	}

	public Session openSession() {
		return sessionFactory.openSession();
	}
}