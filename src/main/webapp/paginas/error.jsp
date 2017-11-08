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
	<link href="<c:url value="/resources/css/uniform.css" />" rel="stylesheet">
	<link href="<c:url value="/resources/css/select2.css"/>" rel="stylesheet">
	<link href="<c:url value="/resources/css/matrix-style.css" />" rel="stylesheet">
	<link href="<c:url value="/resources/css/matrix-media.css"/>" rel="stylesheet">
	<link href="<c:url value="/resources/css/font-awesome.css"/>" rel="stylesheet">
	<link href="<c:url value="/resources/css/google-font.css/css?family=Open+Sans:400,700,800'"/>" rel="stylesheet">
	
	<script src="<c:url value="/resources/js/jquery.js" />"></script>
	<script src="<c:url value="/resources/js/jquery.min.js" />"></script>
<%-- 	<script src="<c:url value="/resources/js/jquery.ui.custom.js" />"></script> --%>
<%-- 	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script> --%>
<%-- 	<script src="<c:url value="/resources/js/jquery.uniform.js" />"></script> --%>
<%-- 	<script src="<c:url value="/resources/js/select2.min.js" />"></script> --%>
<%-- 	<script src="<c:url value="/resources/js/jquery.dataTables.min.js" />"></script> --%>
		
	<script src="<c:url value="/resources/js/datatable/jquery.dataTables.js" />"></script>
	<script src="<c:url value="/resources/js/datatable/dataTables.rowReorder.js" />"></script>
<%-- 	<script src="<c:url value="/resources/js/matrix.js" />"></script> --%>
<%-- 	<script src="<c:url value="/resources/js/matrix.tables.js" />"></script> --%>
	<script src="<c:url value="/resources/js/error.js" />"></script>

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
					class="icon-home"></i> Home</a> <a href="#" class="current">Erros</a>
			</div>
			<h1>Erros</h1>
		</div>
		<div class="container-fluid">
			<hr>
    		<div class="row-fluid">
      			<div class="span12">
        			<div class="widget-box">
        			<div class="widget-title"> <span class="icon"><i class="icon-th"></i></span>
            			<h5>Tabela de Erros</h5>
          			</div>
          			<div class="widget-content nopadding">
            			<table class="table table-bordered data-table" id="tabelaDeErros">
              				<thead>
                				<tr>
                					<th>Data</th>
                  					<th>Classe</th>
                  					<th>Método</th>
                  					<th>Causa</th>
                  					<th>ID Requisicao</th>
                				</tr>
              					</thead>
              					
            				</table>
          				</div>
        			</div>
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
</body>
</html>