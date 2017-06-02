$(function() {
	
	$.get("../error/",function(data) {
			var json = $.parseJSON(data);
			console.log(json.erros);
	});

});