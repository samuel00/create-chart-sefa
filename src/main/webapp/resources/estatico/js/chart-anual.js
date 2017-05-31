$(function () {
	$.get('chart/quantidade/acesso', function (data) {
    	var dataSemAspas = data.replace(/\"/g, "");
    	var total_requisicoes = 0;
    	dataSemAspas = dataSemAspas.replace('acessos', '"acessos"');
    	
    	var json = $.parseJSON(dataSemAspas);
        Highcharts.chart('container', {
            chart: {
                zoomType: 'x'
            },
            title: {
                text: 'Quantidade de Acesso Diario'
            },
            subtitle: {
                text: 'Clique e arraste para aumenta o zoom'
            },
            xAxis: {
                type: 'datetime'
            },
            yAxis: {
                title: {
                    text: 'Quantidade'
                }
            },
            legend: {
                enabled: false
            },
            plotOptions: {
                area: {
                    fillColor: {
                        linearGradient: {
                            x1: 0,
                            y1: 0,
                            x2: 0,
                            y2: 1
                        },
                        stops: [
                            [0, Highcharts.getOptions().colors[0]],
                            [1, Highcharts.Color(Highcharts.getOptions().colors[0]).setOpacity(0).get('rgba')]
                        ]
                    },
                    marker: {
                        radius: 2
                    },
                    lineWidth: 1,
                    states: {
                        hover: {
                            lineWidth: 1
                        }
                    },
                    threshold: null
                }
            },

            series: [{
                type: 'area',
                name: 'acessos',
                data: json.acessos
            }]
        });
        
        $.each(json, function(i, item) {
            console.log(i);
            $.each(item, function (index, item) {
            	total_requisicoes += item[1];
            })
        $("#total_requisicoes").text(total_requisicoes + "");
        });
    });
});