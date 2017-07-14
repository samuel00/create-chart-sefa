$(function() {

	$.get("../error/", function(data) {
		var json = $.parseJSON(data);
		
		
		$.each(json.erros, function(i, item) {
			var arr = item.classe.split('.');
			var classe = arr[arr.length-1];
			console.log("Classe : " + classe + "Metodo: " + item.metodo + "Causa: " + item.causa);
	
		$('#tabelaDeErros').DataTable({
			"processing" : true,
			data : erros,
			"columns" : [ {
				"data" : "id"
			}, {
				"data" : "classe"
			}, {
				"data" : "metodo"
			}, {
				"data" : "causa"
			}, {
				"data" : "idRequisicao"
			} ]
		});
	});
});

});
