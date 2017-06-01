package sml.create.charts.dao;

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
		String sql = "SELECT COUNT(r.tar_data), TO_CHAR(r.tar_data,'dd-MM-yyyy') "
				+ "FROM tab_requisicao r GROUP BY TO_CHAR(r.tar_data,'dd-MM-yyyy')  "
				+ "ORDER BY TO_DATE(TO_CHAR(r.tar_data,'dd-MM-yyyy'))";
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
}
