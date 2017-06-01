$(function() {
	
	$("#select_metodos").change(function () {
		var metodo = $(this).find('option:selected').text();
		$.get("../document/parametro/metodo",
			{nomeMetodo : metodo},
				function(data) {
					var dataSemAspas = data.replace(/\\/g, '');
					dataSemAspas = dataSemAspas.replace(/\"{/g, '{');
					dataSemAspas = dataSemAspas.replace(/\}"/g, '}');
					var json = $.parseJSON(dataSemAspas);
		
					var jsonPrettyEntrada = JSON.stringify(json.entrada, undefined, 2);
					var jsonPrettySaida = JSON.stringify(json.saida, undefined, 2);
					$("#entrada").text(jsonPrettyEntrada);
					$("#saida").text(jsonPrettySaida);
		
			});
        
    });	
	
	$.get("../chart/quantidade/acesso/metodo",function(data) {
			var json = $.parseJSON(data);
			console.log(json.metodos)
			 $.each(json.metodos, function(i, value) {
		        $('#select_metodos').append($('<option>').text(value).attr('value', value));
		     });
	});

});