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
	<link href="<c:url value="/resources/css/comum.css"/>" rel="stylesheet">
	<link href="<c:url value="/resources/font-awesome/css/font-awesome.css" />" rel="stylesheet" type='text/css'>
	
	<script src="<c:url value="/resources/js/jquery.js" />"></script>
	<script src="<c:url value="/resources/js/highcharts.js"/>"></script>
	<script src="<c:url value="/resources/js/exporting.js" />"></script>
	<script src="<c:url value="/resources/js/document.js" />"></script>

	<!--Header-part-->
	<div id="header">
		<h1>
			<a href="dashboard.html">Matrix Admin</a>
		</h1>
	</div>
	

	<!--sidebar-menu-->

	<%@include file="../comun/sidebar.jsp" %>
	<div id="content">
		<div id="content-header">
			<div id="breadcrumb">
				<a href="#" title="Go to Home" class="tip-bottom"><i
					class="icon-home"></i> Home</a> <a href="#" class="current">Gráficos</a>
			</div>
			<h1>Documentação</h1>
		</div>
		<div class="container-fluid">
			<hr>
			<div class="widget-box widget-plain">
			</div>
			<div class="row-fluid">
				<div class="span6">
					<div class="widget-box">
						<div class="widget-title">
							<span class="icon"> <i class="icon-inbox"></i>
							</span>
							<h5>Dados de Entrada</h5>
							<div>
							<select class="selectpicker" id="select_metodos">
							</select>
						</div>
						</div>
						<div class="widget-content">
							<pre id="entrada"></pre>
						</div>
					</div>
					
					<div class="widget-box">
						<div class="widget-title">
							<span class="icon"> <i class="icon-inbox"></i>
							</span>
							<h5>Dados do Header</h5>
						</div>
						<div class="widget-content">
							<pre id="cabecalho"></pre>
						</div>
					</div>
			</div>
				<div class="span6">
					<div class="widget-box">
						<div class="widget-title">
							<span class="icon"> <i class="icon-inbox"></i>
							</span>
							<h5>Dados de Saída</h5>
						</div>
						<div class="widget-content">
							<pre id="saida"></pre>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<div class="modal_aplicacao"></div>
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
	<script src="js/matrix.dashboard.js"></script>
</body>
</html>