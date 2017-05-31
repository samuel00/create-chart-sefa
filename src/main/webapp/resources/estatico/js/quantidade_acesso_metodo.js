$(function() {

	$.get("../chart/quantidade/acesso/metodo", function(data) {
		var json = $.parseJSON(data);
		Highcharts.chart('quantidade_acesso_metodo', {
			title : {
				text : 'Quantidade de Acesso X Metodo',
				x : -20
			//center
			},
			xAxis: {
	            categories: json.metodos
	        },
			yAxis : {
				title : {
					text : 'Quantidade'
				},
				plotLines : [ {
					value : 0,
					width : 1,
					color : '#808080'
				} ]
			},
			tooltip : {
				valueSuffix : ' ms'
			},
			legend : {
				layout : 'vertical',
				align : 'right',
				verticalAlign : 'middle',
				borderWidth : 0
			},
			series : [{
				name : 'quantidade',
				data: json.tempo}]
		});
		var maxProp = null;
		var maxValue = -1;
		console.log(json.tempo[0]);
		$.each(json.tempo, function(index, item) {
			var value = json.tempo[index];
		    if (value > maxValue) {
		      maxProp = json.tempo[index];
		      maxValue = value;
		      indexAtual = index;
		    }
	    });
		
		$("#quantidade_metodo_mais_acessado").text(json.tempo[indexAtual] + "");
		$("#nome_metodo_mais_acessado").text(json.metodos[indexAtual] + "");
	});
	

});