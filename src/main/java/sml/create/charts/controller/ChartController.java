package sml.create.charts.controller;

import java.text.ParseException;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import sml.create.charts.service.ChartService;
import sml.create.charts.util.ConverterUtil;

@Controller
@RequestMapping("/chart")
public class ChartController {

	@Autowired
	private ChartService chartService;

	@RequestMapping(value = "/tempo", method = RequestMethod.GET)
	public String tempo(HttpServletRequest request) {
		return "gpiechart";
	}

	@RequestMapping(value = "/acesso", method = RequestMethod.GET)
	public String acesso(HttpServletRequest request) {
		return "grafico-diario";
	}
	
	@RequestMapping(value = "/quantidade/acesso/metodo", method = RequestMethod.GET)
	public @ResponseBody String getGraficoQuantidadeAcessoMetodo(HttpServletRequest request) throws ParseException {
		return ConverterUtil.ListaToJSON(chartService.getQuantidadeAcessoMetodo());
	}

	@RequestMapping(value = "/quantidade/acesso", method = RequestMethod.GET)
	public @ResponseBody String getGraficoQuantidadeAcesso(HttpServletRequest request) throws ParseException {
		return ConverterUtil.listObjectToGraficoAcesso(chartService.getQuantidadeAcesso());
	}

	@RequestMapping(value = "/media/tempo", method = RequestMethod.GET)
	public @ResponseBody String getGraficoMediaTempo() {
		return ConverterUtil.ListaToJSON(chartService.getMediaRequisicao());
	}
}
