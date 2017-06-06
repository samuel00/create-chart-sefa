package br.gov.pa.sefa.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.gov.pa.sefa.modelo.RequisicaoErro;

@Repository
public class ErrorDao extends AbstractDao<Integer, Object> {

	@SuppressWarnings("unchecked")
	public List<RequisicaoErro> getError() {
		String sql = "SELECT re FROM  RequisicaoErro re";
		List<RequisicaoErro> erros=  getSession().createQuery(sql)
				.list();
		return erros;
	}

}
