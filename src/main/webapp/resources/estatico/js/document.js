$(function() {
	
	$("#select_metodos").change(function () {
		$body = $("body");
		$body.addClass("loading");
		var metodo = $(this).find('option:selected').text();
		$.get("../document/parametro/metodo",
			{nomeMetodo : metodo},
				function(data) {
					var dataSemBackSlash = data.replace(/\\/g, ''); //Remove barra invertida
					dataSemBackSlash = dataSemBackSlash.replace(/\"{/g, '{'); //Remove aspas do "{
					dataSemBackSlash = dataSemBackSlash.replace(/\}"/g, '}'); //Remove aspas do }"
					var json = $.parseJSON(dataSemBackSlash);
					var jsonPrettyEntrada = getJson(json.entrada);
					var jsonPrettySaida = getJson(json.saida);
					var jsonPrettySaida = getJson(json.saida);
					$("#entrada").text(jsonPrettyEntrada);
					$("#saida").text(jsonPrettySaida);
					$("#cabecalho").text(json.cabecalho.replace(/\Nome do Header/g, '\nNome do Header').replace(/\Valor do Header/g, '\nValor do Header'));
					$body.removeClass("loading");
			});
        
    });	
	
	$.get("../chart/quantidade/acesso/metodo",function(data) {
			var json = $.parseJSON(data);
			console.log(json.metodos)
			 $.each(json.metodos, function(i, value) {
		        $('#select_metodos').append($('<option>').text(value).attr('value', value));
		     });
	});
	
	function getJson(json){
		if(typeof json =='object'){
			return JSON.stringify(json, undefined, 2);
		}else{
			return json;
		}
	}

});