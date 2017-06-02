package sml.create.charts.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import sml.create.charts.modelo.RequisicaoErro;
import sml.create.charts.service.ErrorService;
import sml.create.charts.util.ConverterUtil;

@Controller
@RequestMapping("/error")
public class ErroController {
	
	private static final String ERROS = "erros";
	
	@Autowired
	private ErrorService errorService;

	@RequestMapping(value = "/requisicao", method = RequestMethod.GET)
	public @ResponseBody String getError(HttpServletRequest request) {
		List<RequisicaoErro> erro = errorService.getError();
		return ConverterUtil.ListaToJSON(ERROS, erro);
	}

}
