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
		String sql = "select count(r.tar_data), to_char(r.tar_data,'dd-MM-yyyy') from tab_requisicao r group by to_char(r.tar_data,'dd-MM-yyyy')  ORDER by to_char(r.tar_data,'dd-MM-yyyy')";
		List<Object[]> itens = getSession().createSQLQuery(sql).list();
		return itens;
	}

	@SuppressWarnings("unchecked")
	public List<Object[]> getMediaRequisicaoMetodo() {
		String sql = "SELECT count(1), rp.tap_metodo_invocado FROM tab_requisicao r "
				+ "INNER JOIN tab_requisicao_parametro rp ON rp.tap_id = r.tar_id "
				+ "GROUP BY rp.tap_metodo_invocado";
		List<Object[]> itens = getSession().createSQLQuery(sql).list();
		return itens;
	}
	
	@SuppressWarnings("unchecked")
	public List<Object[]> getHealthCheckRequisicaoMetodo() {
		String sql = " SELECT 0, COUNT(1) as ok FROM tab_requisicao";
		List<Object[]> itens = getSession().createSQLQuery(sql).list();
		return itens;
	}
}
