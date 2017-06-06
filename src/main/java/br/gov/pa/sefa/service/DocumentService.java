package br.gov.pa.sefa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.gov.pa.sefa.dao.DocumentDao;
import br.gov.pa.sefa.modelo.Parametro;

@Service
public class DocumentService {
	@Autowired
	private DocumentDao documentDao;
		
	@Transactional
	public Parametro getParametrosPorMetodo(String nomeMetodo) {
		return this.documentDao.getParametrosPorMetodo(nomeMetodo);
	}
}
