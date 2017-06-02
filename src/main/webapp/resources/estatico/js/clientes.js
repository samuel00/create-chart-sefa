$(function() {

	$.get("../chart/clientes/", function(data) {
		var json = $.parseJSON(data);
		Highcharts.chart('quantidade_acesso_cliente', {
			title : {
				text : 'Quantidade de Acesso X Cliente',
				x : -20
			//center
			},
			xAxis: {
	            categories: json.ip
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
				valueSuffix : ' acessos'
			},
			legend : {
				layout : 'vertical',
				align : 'right',
				verticalAlign : 'middle',
				borderWidth : 0
			},
			series : [{
				name : 'quantidade',
				data: json.quantidade}]
		});
		var maxProp = null;
		var maxValue = -1;
		$.each(json.quantidade, function(index, item) {
			var value = json.quantidade[index];
		    if (value > maxValue) {
		      maxProp = json.quantidade[index];
		      maxValue = value;
		      indexAtual = index;
		    }
	    });
		
		$("#quantidade_de_acessos").text(json.quantidade[indexAtual] + "");
		$("#maior_cliente").text(json.ip[indexAtual] + "");
	});
	

});