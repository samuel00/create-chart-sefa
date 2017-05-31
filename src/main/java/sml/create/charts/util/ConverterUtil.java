package sml.create.charts.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.json.JSONObject;

import sml.create.charts.modelo.HealthCheck;

public class ConverterUtil {
	
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
}
