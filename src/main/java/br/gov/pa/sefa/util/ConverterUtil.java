package br.gov.pa.sefa.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import br.gov.pa.sefa.modelo.DocumentoJSON;
import br.gov.pa.sefa.modelo.Parametro;
import br.gov.pa.sefa.modelo.RequisicaoErro;

public class ConverterUtil {
	
	public static DateFormat OUT_DATETIME_FORMAT = new SimpleDateFormat("d/M/yyyy H:mm:ss");
	public static SimpleDateFormat OUT_CALENDAR_FORMAT = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", new Locale("pt", "BR"));
	
	public static String ListaToJSON(List<Object[]> lista){
		JSONObject json = new JSONObject();
		List<Double> listaTempo = new ArrayList<>();
		List<String> listaMetodo = new ArrayList<>();
		for(Object [] objeto : lista){
			listaTempo.add(Double.valueOf(String.valueOf(objeto[0])));
			listaMetodo.add(String.valueOf(objeto[1]));
		}
		
		json.put("metodos", listaMetodo);
		json.put("tempo", listaTempo);
		return json.toString();
	}
	


	public static String ListaToJSON(String parametoEntrada, String parametoSaida, Parametro parametro) throws JsonProcessingException{
		DocumentoJSON documentoJSON = new DocumentoJSON(parametro);
		ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String jsonString = mapper.writeValueAsString(documentoJSON);
        return jsonString;
	}
	
	public static String ListaHealthToJSON(List<Object[]> lista){
		JSONObject json = new JSONObject();
		Integer ok = null;
		Integer error = null;
		for(Object [] objeto : lista){
			ok = Integer.valueOf(String.valueOf(objeto[0]));
			error = Integer.valueOf(String.valueOf(objeto[1]));
		}
		
		json.put("ok", ok);
		json.put("error", error);
		return json.toString();
		
	}

	public static String listObjectToGraficoAcesso(List<Object[]> object) throws ParseException {
		JSONObject json = new JSONObject();
		List<String> listaAcesso = new ArrayList<>();
		for(Object [] objeto : object){
			String string = String.valueOf(objeto[1]);
			DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
			format.setTimeZone(TimeZone.getTimeZone("UTC"));
			Date date = format.parse(string);
			listaAcesso.add(String.valueOf("[" + date.getTime() + "," + Integer.valueOf(String.valueOf(objeto[0])) + "]"));
		}
		json.put("acessos", listaAcesso);
		return json.toString();
	}


	public static String ListaToJSON(String erros, List<RequisicaoErro> listaErros) {
		JSONObject json = new JSONObject();
	    JSONArray jsonArray = new JSONArray();
	    
	    for(RequisicaoErro erro :listaErros){
	    	JSONObject formDetailsJson = new JSONObject();
	    	formDetailsJson.put("id", erro.getId());
	    	formDetailsJson.put("classe", erro.getClasse());
	        formDetailsJson.put("metodo", erro.getMetodo());
	        formDetailsJson.put("causa", erro.getMotivo());
	        formDetailsJson.put("idRequisicao", erro.getRequisicao().getId());
	        formDetailsJson.put("data", erro.getData());
	        jsonArray.put(formDetailsJson);
	    }

		json.put(erros, jsonArray);
		return json.toString();
	}



	public static String ListaToJSON(String keyIp, String keyQuantidade, List<Object[]> lista) {
		JSONObject json = new JSONObject();
		List<Double> listaQuantidade = new ArrayList<>();
		List<String> listaip = new ArrayList<>();
		for(Object [] objeto : lista){
			listaQuantidade.add(Double.valueOf(String.valueOf(objeto[0])));
			listaip.add(String.valueOf(objeto[1]));
		}
		json.put(keyIp, listaip);
		json.put(keyQuantidade, listaQuantidade);
		return json.toString();
	}
	
	public static String teste(String teste) throws ParseException{
		Calendar cal = new GregorianCalendar();
		cal.setTime(OUT_CALENDAR_FORMAT.parse(teste));
		return OUT_DATETIME_FORMAT.format(cal.getTime());
	}
}
