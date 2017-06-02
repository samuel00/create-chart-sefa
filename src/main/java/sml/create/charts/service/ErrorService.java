package sml.create.charts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sml.create.charts.dao.ErrorDao;
import sml.create.charts.modelo.RequisicaoErro;

@Service
public class ErrorService {
	
	@Autowired
	private ErrorDao errorDao;
		
	@Transactional
	public List<RequisicaoErro> getError() {
		return this.errorDao.getError();
	}
}
