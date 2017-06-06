package br.gov.pa.sefa.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.gov.pa.sefa.modelo.Parametro;

@Repository
public class DocumentDao extends AbstractDao<Integer, Object>{
	
	@SuppressWarnings("unchecked")
	public Parametro getParametrosPorMetodo(String nomeMetodo) {
		String sql = "SELECT p FROM  Parametro p "
				+ " WHERE p.metodoInvocado = :nomeMetodo " 
				+ " AND p.saida IS NOT NULL "
				+ " ORDER BY p.id DESC";
		List<Parametro> parametro=  getSession().createQuery(sql)
				.setParameter("nomeMetodo", nomeMetodo)
				.list();
		return parametro.get(0);
	}

}