$(function() {

	$.get("../chart/media/tempo", function(data) {
		var exemplo_json = '{"professorResponsavel":"Prof. Dr. Ari Estotolis","area":"Tecnologia da Informacao","nome":"ITEC"}';
		var json = $.parseJSON(exemplo_json);
		
		var jsonPretty = JSON.stringify(json, undefined, 2);
		$("#json").text(jsonPretty);
		
	});

});