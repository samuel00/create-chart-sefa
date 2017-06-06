package br.gov.pa.sefa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.gov.pa.sefa.dao.ErrorDao;
import br.gov.pa.sefa.modelo.RequisicaoErro;

@Service
public class ErrorService {
	
	@Autowired
	private ErrorDao errorDao;
		
	@Transactional
	public List<RequisicaoErro> getError() {
		return this.errorDao.getError();
	}
}
