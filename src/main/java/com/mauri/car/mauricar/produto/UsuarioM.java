package com.mauri.car.mauricar.produto;

import org.hibernate.Query;
import org.hibernate.Session;

import com.mauri.car.mauricar.produto.model.Usuario;

@SuppressWarnings("deprecation")
public class UsuarioM {
	private final Session session;

	public UsuarioM() {
		session = new HibernateUtil().openSession();
	}

	@SuppressWarnings("deprecation")
	public Usuario buscaUsuarioPorLoginESenha(Usuario usuario) {
		@SuppressWarnings("rawtypes")
		Query query = this.session.createQuery("from Usuario where login = :pLogin and senha = :pSenha");
		query.setParameter("pLogin", usuario.getLogin());
		query.setParameter("pSenha", usuario.getSenha());
		return (Usuario) query.uniqueResult();
	}

	public void setLogin(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setSenha(String string) {
		// TODO Auto-generated method stub
		
	}
}

