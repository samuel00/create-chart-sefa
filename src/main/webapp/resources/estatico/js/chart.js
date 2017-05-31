$(function() {

	$.get("../chart/media/tempo", function(data) {
		var json = $.parseJSON(data);
		console.log(json.metodos);
		Highcharts.chart('container', {
			title : {
				text : 'Media tempo de requisao X Metodo',
				x : -20
			//center
			},
			xAxis: {
	            categories: json.metodos
	        },
			yAxis : {
				title : {
					text : 'Tempo em ms'
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
				name : 'tempo',
				data: json.tempo}]
		});
		
		
		var jsonPretty = JSON.stringify(json, undefined, 2);
		$("#json_teste").text(jsonPretty);
		
	});

});