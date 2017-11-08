package br.gov.pa.sefa.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.gov.pa.sefa.modelo.Parametro;
import br.gov.pa.sefa.service.DocumentService;
import br.gov.pa.sefa.util.ConverterUtil;

@Controller
@RequestMapping("/document")
public class DocumentController {
	
	private static final String PARAMETO_ENTRADA = "entrada";
	private static final String PARAMETO_SAIDA = "saida";
	
	@Autowired
	private DocumentService documentService;

	@RequestMapping(value = "/parametro/metodo", method = RequestMethod.GET)
	public @ResponseBody String parametrosPorMetodo(@RequestParam(value = "nomeMetodo") String nomeMetodo, HttpServletRequest request) throws JsonProcessingException {
		Parametro parametro = documentService.getParametrosPorMetodo(nomeMetodo);
		
		return ConverterUtil.ListaToJSON(PARAMETO_ENTRADA, PARAMETO_SAIDA,parametro);
	}
}
