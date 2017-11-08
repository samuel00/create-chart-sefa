package br.gov.pa.sefa.dao;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.gov.pa.sefa.modelo.Requisicao;
import br.gov.pa.sefa.modelo.RequisicaoErro;
import br.gov.pa.sefa.util.ConverterUtil;

@Repository
public class ErrorDao extends AbstractDao<Integer, Object> {

	@SuppressWarnings("unchecked")
	public List<RequisicaoErro> getError() throws ParseException {
		List<RequisicaoErro> erros = new ArrayList<>();
		String sql = "SELECT erro.requisicao.id, TO_CHAR(erro.requisicao.data, 'DD-MM-YYYY HH24:MI:SS'), erro.motivo, erro.classe, erro.metodo, erro.stacktrace "
				+ "FROM  Requisicao requisicao, RequisicaoErro erro "
				+ "WHERE requisicao.id = erro.requisicao.id";
		List<Object> objetos = getSession().createQuery(sql).list();
		Iterator interador = objetos.iterator();
		while(interador.hasNext()){
		   RequisicaoErro erro = new RequisicaoErro();
		   Requisicao requisicao = new Requisicao();
		   Object[] obj = (Object[]) interador.next();
		   requisicao.setId(Long.parseLong(String.valueOf(obj[0]))); 
		   erro.setRequisicao(requisicao);
		   erro.setData(String.valueOf(obj[1])); 
		   erro.setMotivo(String.valueOf(obj[2]));
		   erro.setClasse(String.valueOf(obj[3]));
		   erro.setMetodo(String.valueOf(obj[4]));
		   erro.setStacktrace(String.valueOf(obj[5]));
		   erros.add(erro);
		}
		return erros;
	}

}
