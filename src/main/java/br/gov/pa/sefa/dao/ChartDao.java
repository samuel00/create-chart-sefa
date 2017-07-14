package br.gov.pa.sefa.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ChartDao extends AbstractDao<Integer, Object>{

	@SuppressWarnings("unchecked")
	public List<Object[]> getMediaRequisicao() {
		String sql = "SELECT AVG(r.tar_tempo_execucao), rp.tap_metodo_invocado FROM tab_requisicao r "
				+ "INNER JOIN tab_requisicao_parametro rp ON rp.tap_id = r.tar_id "
				+ "GROUP BY rp.tap_metodo_invocado";
		List<Object[]> itens = getSession().createSQLQuery(sql).list();
		return itens;
	}

	@SuppressWarnings("unchecked")
	public List<Object[]> getQuantidadeAcesso() {
		String sql = "SELECT  COUNT(1), TO_CHAR(R.TAR_DATA,'DD-MM-YYYY') "
				+ "FROM TAB_REQUISICAO R GROUP BY TO_CHAR(R.TAR_DATA,'DD-MM-YYYY') "
				+ "ORDER BY TO_DATE(TO_CHAR(R.TAR_DATA,'DD-MM-YYYY'),'DD-MM-YYYY')";
		List<Object[]> itens = getSession().createSQLQuery(sql).list();
		return itens;
	}

	@SuppressWarnings("unchecked")
	public List<Object[]> getMediaRequisicaoMetodo() {
		String sql = "SELECT COUNT(1), rp.tap_metodo_invocado FROM tab_requisicao r "
				+ "INNER JOIN tab_requisicao_parametro rp ON rp.tap_id = r.tar_id "
				+ "GROUP BY rp.tap_metodo_invocado";
		List<Object[]> itens = getSession().createSQLQuery(sql).list();
		return itens;
	}
	
	@SuppressWarnings("unchecked")
	public List<Object[]> getHealthCheckRequisicaoMetodo() {
		String sql = "SELECT erros.erros, (requisicao.ok-erros.erros) FROM (SELECT COUNT(1) AS erros "
				+ "FROM tab_requisicao_erro)  erros, (SELECT COUNT(1) as OK "
				+ "FROM tab_requisicao)  requisicao";
		List<Object[]> itens = getSession().createSQLQuery(sql).list();
		return itens;
	}
	
	@SuppressWarnings("unchecked")
	public List<Object[]> testeDao() {
		String sql = "SELECT COUNT(TAR_IP_ORIGEM), TAR_IP_ORIGEM "
				+ "FROM MONITORAMENTO_SERVICE.TAB_REQUISICAO "
				+ "GROUP BY TAR_IP_ORIGEM";
		List<Object[]> itens = getSession().createSQLQuery(sql).list();
		return itens;
	}
	
//	select count(1) from MONITORAMENTO_SERVICE.TAB_REQUISICAO where not EXISTS (select * from MONITORAMENTO_SERVICE.TAB_REQUISICAO_ERRO where MONITORAMENTO_SERVICE.TAB_REQUISICAO_ERRO.TAE_REQUISICAO_ID = TAR_ID) ;

}
