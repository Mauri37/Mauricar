package com.mauri.car.mauricar.produto;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mauri.car.mauricar.produto.model.Produto;

public class ProdutoM {

	private final Session session;

	public ProdutoM() {
		this.session = new HibernateUtil().openSession();
	}

	public void adiciona(Produto p) {
		Transaction tx = session.beginTransaction();
		session.save(p);
		tx.commit();
	}

	public void atualiza(Produto p) {
		Transaction tx = session.beginTransaction();
		session.update(p);
		tx.commit();
	}

	public void remove(Produto p) {
		Transaction tx = session.beginTransaction();
		session.delete(p);
		tx.commit();
	}

	@SuppressWarnings({ "unchecked", "deprecation"})
	public List<Produto> lista() {
		return session.createCriteria(Produto.class).list();
	}

}