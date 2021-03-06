package br.gov.pa.sefa.controller;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.gov.pa.sefa.service.ChartService;
import br.gov.pa.sefa.util.ConverterUtil;

@Controller
@RequestMapping("/health-check")
public class HealthCheckController {
	
	@Autowired
	private ChartService chartService;
	
	@RequestMapping(value = "/requisicoes", method = RequestMethod.GET)
	public @ResponseBody String getGraficoQuantidadeAcessoMetodo(HttpServletRequest request) throws ParseException {
		return ConverterUtil.ListaHealthToJSON(chartService.getHealthCheckRequisicaoMetodo());
	}
}
