$(function () {
	$.get('health-check/requisicoes', function (data) {
    	
    	var json = $.parseJSON(data);
    	$("#requisicoes_error").text(json.ok + "");
    	$("#requisicoes_ok").text(json.error + "");
    });
});