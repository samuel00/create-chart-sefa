package sml.create.charts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sml.create.charts.dao.DocumentDao;
import sml.create.charts.modelo.Parametro;

@Service
public class DocumentService {
	@Autowired
	private DocumentDao documentDao;
		
	@Transactional
	public Parametro getParametrosPorMetodo(String nomeMetodo) {
		return this.documentDao.getParametrosPorMetodo(nomeMetodo);
	}
}
