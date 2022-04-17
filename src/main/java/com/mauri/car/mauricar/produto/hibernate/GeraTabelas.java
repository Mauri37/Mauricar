package com.mauri.car.mauricar.produto.hibernate;

import java.util.Calendar;

import org.hibernate.Session;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.springframework.stereotype.Service;

import com.fasterxml.classmate.AnnotationConfiguration;
import com.mauri.car.mauricar.produto.HibernateUtil;
import com.mauri.car.mauricar.produto.model.Produto;
import com.mauri.car.mauricar.produto.model.Usuario;

@Service
public class GeraTabelas {
	
	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
	    cfg.addAnnotatedClass(Produto.class);
		cfg.addAnnotatedClass(Usuario.class);
		new SchemaExport().create(true, true);
		criaUsuarioEProduto();
	}

	private static void criaUsuarioEProduto() {
		Usuario usuario = new Usuario();
		usuario.setLogin("teste");
		usuario.setSenha("teste");
		Session session = new HibernateUtil().openSession();
		session.beginTransaction();
		session.save(usuario);
		Produto produto = new Produto();
		produto.setDataInicioVenda(Calendar.getInstance());
		produto.setDescricao("Descricao de teste");
		produto.setNome("Teste");
		produto.setPreco(20.5);
		session.save(produto);
		session.getTransaction().commit();
		session.close();

	}

}


