<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>API DashBoard</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

</head>
<body>
	
	<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
	<link href="<c:url value="/resources/css/bootstrap-responsive.min.css"/>" rel="stylesheet">
	<link href="<c:url value="/resources/css/fullcalendar.css" />" rel="stylesheet">
	<link href="<c:url value="/resources/css/matrix-style.css" />" rel="stylesheet">
	<link href="<c:url value="/resources/css/matrix-media.css"/>" rel="stylesheet">
	<link href="<c:url value="/resources/css/jquery.gritter.css"/>" rel="stylesheet">
	<link href="<c:url value="/resources/font-awesome/css/font-awesome.css" />" rel="stylesheet" type='text/css'>
	
	<script src="<c:url value="/resources/js/jquery.js" />"></script>
	<script src="<c:url value="/resources/js/highcharts.js"/>"></script>
	<script src="<c:url value="/resources/js/exporting.js" />"></script>
	<script src="<c:url value="/resources/js/chart.js" />"></script>
	<script src="<c:url value="/resources/js/quantidade_acesso_metodo.js" />"></script>
	<script src="<c:url value="/resources/js/clientes.js" />"></script>

	<!--Header-part-->
	<div id="header">
		<h1>
			<a href="dashboard.html">Matrix Admin</a>
		</h1>
	</div>

	<div id="sidebar">
		<a href="#" class="visible-phone"><i class="icon icon-signal"></i>
			Charts &amp; graphs</a>
		<ul>
			<li><a href="../index.jsp"><i class="icon icon-home"></i> <span>Dashboard</span></a>
			</li>
			<li class="active"><a href="charts.html"><i
					class="icon icon-signal"></i> <span>Charts &amp; graphs</span></a></li>
			<li><a href="widgets.html"><i class="icon icon-inbox"></i> <span>Documentação</span></a></li>
	</div>
	<div id="content">
		<div id="content-header">
			<div id="breadcrumb">
				<a href="#" title="Go to Home" class="tip-bottom"><i
					class="icon-home"></i> Home</a> <a href="#" class="current">Gráficos</a>
			</div>
			<h1>Gráficos</h1>
		</div>
		<div class="container-fluid">
			<hr>
			<div class="row-fluid">
				<div class="span12">
					<div class="widget-box">
						<div class="widget-title">
							<span class="icon"> <i class="icon-signal"></i>
							</span>
							<h5>Média Tempo de Execução Por Método</h5>
						</div>
						<div class="widget-content">
							<div id="container"></div>
						</div>
					</div>
				</div>
			</div>
			<div class="row-fluid">
				<div class="span12">
					<div class="widget-box">
						<div class="widget-title">
							<span class="icon"> <i class="icon-signal"></i>
							</span>
							<h5>Quantidade Acesso Método</h5>
						</div>
						<div class="widget-content">
							<div id="quantidade_acesso_metodo"></div>
						</div>
					</div>
				</div>
			</div>
			<div class="widget-box widget-plain">
				<div class="pagination-centered">
					<ul class="stat-boxes2">
						<li>
							<div class="left peity_line_good">
								<span><span style="display: none;"></span>
									<canvas width="50" height="24"></canvas> </span><strong id="quantidade_metodo_mais_acessado"></strong>
							</div>
							<div class="right">
								<strong id="nome_metodo_mais_acessado"></strong> Método mais acessado
							</div>
						</li>
					</ul>
				</div>
			</div>
			<div class="row-fluid">
				<div class="span12">
					<div class="widget-box">
						<div class="widget-title">
							<span class="icon"> <i class="icon-signal"></i>
							</span>
							<h5>Quantidade Acesso Clientes</h5>
						</div>
						<div class="widget-content">
							<div id="quantidade_acesso_cliente"></div>
						</div>
					</div>
				</div>
			</div>
			<div class="widget-box widget-plain">
				<div class="pagination-centered">
					<ul class="stat-boxes2">
						<li>
							<div class="left peity_line_good">
								<span><span style="display: none;"></span>
									<canvas width="50" height="24"></canvas> </span><strong id="quantidade_de_acessos"></strong>
							</div>
							<div class="right">
								<strong id="maior_cliente"></strong> Maior cliente
							</div>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<!--Footer-part-->
	<div class="row-fluid">
		<div id="footer" class="span12">
			2017 Desenvolvido por Samuel Santana
		</div>
	</div>
	<!--end-Footer-part-->
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.flot.min.js"></script>
	<script src="js/jquery.flot.pie.min.js"></script>
	<script src="js/matrix.charts.js"></script>
	<script src="js/jquery.flot.resize.min.js"></script>
	<script src="js/matrix.js"></script>
	<script src="js/jquery.peity.min.js"></script>
	<!--Turning-series-chart-js-->
	<script src="js/matrix.dashboard.js"></script>
</body>
</html>