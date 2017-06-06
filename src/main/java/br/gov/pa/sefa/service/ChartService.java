package br.gov.pa.sefa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.gov.pa.sefa.dao.ChartDao;

@Service
public class ChartService {
	
	@Autowired
	private ChartDao testeDao;
		
	@Transactional
	public List<Object[]> getMediaRequisicao() {
		return this.testeDao.getMediaRequisicao();
	}
	
	@Transactional
	public List<Object[]> getQuantidadeAcesso() {
		return this.testeDao.getQuantidadeAcesso();
	}
	
	@Transactional
	public List<Object[]> getQuantidadeAcessoMetodo() {
		return this.testeDao.getMediaRequisicaoMetodo();
	}
	
	@Transactional
	public List<Object[]> getHealthCheckRequisicaoMetodo() {
		return this.testeDao.getHealthCheckRequisicaoMetodo();
	}
	
	@Transactional
	public List<Object[]> getclientes() {
		return testeDao.testeDao();
	}
}
