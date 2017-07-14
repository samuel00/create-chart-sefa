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
	<script src="<c:url value="/resources/js/chart-anual.js" />"></script>
	<script src="<c:url value="/resources/js/requisicao_ok.js" />"></script>

	<!--Header-part-->
	<div id="header">
		<h1>
			<a href="index.jsp">Matrix Admin</a>
		</h1>
	</div>
	
	<!--sidebar-menu-->
	<div id="sidebar">
		<a href="#" class="visible-phone"><i class="icon icon-home"></i>
			Dashboard</a>
		<ul>
			<li class="active"><a href="index.jsp"><i class="icon icon-home"></i> <span>Dashboard</span></a></li>
			<li><a href="paginas/charts.jsp"><i class="icon icon-signal"></i><span>Gráficos</span></a></li>
			<li><a href="paginas/document.jsp"><i class="icon icon-inbox"></i> <span>Documentação</span></a></li>
	</div>

	<!--main-container-part-->
	<div id="content">
		<!--breadcrumbs-->
		<div id="content-header">
			<div id="breadcrumb">
				<a href="index.jsp" title="Go to Home" class="tip-bottom"><i
					class="icon-home"></i> Home</a>
			</div>
		</div>

		<!--Action boxes-->
		<div class="container-fluid">
			<div class="quick-actions_homepage">
				<ul class="quick-actions">
					<li class="bg_lg span3"><a href="paginas/charts.jsp"> <i class="icon-signal"></i> Gráficos	</a></li>
					<li class="bg_ly"><a href="paginas/document.jsp"> <i class="icon-inbox"></i>Documentação</a></li>
					  <li class="bg_lr"><a href="paginas/error.jsp"> <i class="icon-info-sign"></i>Erros</a></li>
				</ul>
			</div>
		</div>
		<!--End-Action boxes-->

			<!--Chart-box-->
			<div class="row-fluid">
				<div class="widget-box">
					<div class="widget-title bg_lg">
						<span class="icon"><i class="icon-signal"></i></span>
						<h5>Site Analytics</h5>
					</div>
					<div class="widget-content">
						<div class="row-fluid">
							<div class="span9">
								<div id="container" class="chart"></div>
							</div>
							<div class="span3">
								<ul class="site-stats">
									<li class="bg_lh"><i class="icon-globe"></i> <strong id="total_requisicoes"></strong>
										<small>Total de Requisições</small></li>
									<li class="bg_lh"><i class="icon-ok"></i> <strong id="requisicoes_ok"></strong>
										<small>Requisições Ok</small></li>
									<li class="bg_lh"><i class="icon-info-sign"></i> <strong id="requisicoes_error"></strong>
										<small>Requisições com Erro</small></li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
	</div>
			<!--end-main-container-part-->

			<!--Footer-part-->

			<div class="row-fluid">
				<div id="footer" class="span12">
					2017 Desenvolvido por Samuel Santana
				</div>
			</div>

			<!--end-Footer-part-->

			<script type="text/javascript">
				// This function is called from the pop-up menus to transfer to
				// a different page. Ignore if the value returned is a null string:
				function goPage(newURL) {

					// if url is empty, skip the menu dividers and reset the menu selection to default
					if (newURL != "") {

						// if url is "-", it is this page -- reset the menu:
						if (newURL == "-") {
							resetMenu();
						}
						// else, send page to designated URL            
						else {
							document.location.href = newURL;
						}
					}
				}

				// resets the menu selection upon entry to this page:
				function resetMenu() {
					document.gomenu.selector.selectedIndex = 2;
				}
			</script>
</body>
</html>