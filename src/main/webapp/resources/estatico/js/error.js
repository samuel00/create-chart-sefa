$(function() {

$.get("../error/", function(data) {
		
		something = JSON.stringify(data);
		var json = $.parseJSON(something);
		
		
		/*$('#tabelaDeErros').DataTable({
	        "processing" : true,
	        "ajax" : {
	            "url" : "../error/",
	            dataSrc : ''
	        },
	        "columns" : [ {
	            "data.erros" : "id"
	        }, {
	            "data.erros" : "classe"
	        }, {
	            "data.erros" : "metodo"
	        }, {
	            "data.erros" : "causa"
	        }]
	    });*/
		
		$('#tabelaDeErros').DataTable({
	        "processing" : true,
	        data : json.erros,
	        "columns" : [ {
		        "data" : "data"
		    },  {
	            "data" : "classe"
	        },  {
	            "data" : "metodo"
	        }, {
	            "data" : "causa"
	        }, {
	            "data" : "idRequisicao"
	        }]
	    });
});

});
