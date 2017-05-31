<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>API DashBoard</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

</head>
<body>

	<link href="<c:url value="/resources/css/bootstrap.min.css" />"
		rel="stylesheet">
	<link
		href="<c:url value="/resources/css/bootstrap-responsive.min.css"/>"
		rel="stylesheet">
	<link href="<c:url value="/resources/css/fullcalendar.css" />"
		rel="stylesheet">
	<link href="<c:url value="/resources/css/matrix-style.css" />"
		rel="stylesheet">
	<link href="<c:url value="/resources/css/matrix-media.css"/>"
		rel="stylesheet">
	<link href="<c:url value="/resources/css/jquery.gritter.css"/>"
		rel="stylesheet">
	<link
		href="<c:url value="/resources/font-awesome/css/font-awesome.css" />"
		rel="stylesheet" type='text/css'>

	<script src="<c:url value="/resources/js/jquery.js" />"></script>
	<script src="<c:url value="/resources/js/highcharts.js"/>"></script>
	<script src="<c:url value="/resources/js/exporting.js" />"></script>
	<div id="sidebar">
		<a href="#" class="visible-phone"><i class="icon icon-signal"></i>
			Charts &amp; graphs</a>
		<ul>
			<li><a href="../index.jsp"><i class="icon icon-home"></i> <span>Dashboard</span></a>
			</li>
			<li class="active"><a href="charts.jsp"><i
					class="icon icon-signal"></i> <span>Charts &amp; graphs</span></a></li>
			<li><a href="document.jsp"><i class="icon icon-inbox"></i> <span>Documentação</span></a></li>
			<!-- 			<li><a href="tables.html"><i class="icon icon-th"></i> <span>Tables</span></a></li> -->
			<!-- 			<li><a href="grid.html"><i class="icon icon-fullscreen"></i> -->
			<!-- 					<span>Full width</span></a></li> -->
			<!-- 			<li class="submenu"><a href="#"><i class="icon icon-th-list"></i> -->
			<!-- 					<span>Forms</span> <span class="label label-important">3</span></a> -->
			<!-- 				<ul> -->
			<!-- 					<li><a href="form-common.html">Basic Form</a></li> -->
			<!-- 					<li><a href="form-validation.html">Form with Validation</a></li> -->
			<!-- 					<li><a href="form-wizard.html">Form with Wizard</a></li> -->
			<!-- 				</ul></li> -->
			<!-- 			<li><a href="buttons.html"><i class="icon icon-tint"></i> <span>Buttons -->
			<!-- 						&amp; icons</span></a></li> -->
			<!-- 			<li><a href="interface.html"><i class="icon icon-pencil"></i> -->
			<!-- 					<span>Eelements</span></a></li> -->
			<!-- 			<li class="submenu"><a href="#"><i class="icon icon-file"></i> -->
			<!-- 					<span>Addons</span> <span class="label label-important">5</span></a> -->
			<!-- 				<ul> -->
			<!-- 					<li><a href="index2.html">Dashboard2</a></li> -->
			<!-- 					<li><a href="gallery.html">Gallery</a></li> -->
			<!-- 					<li><a href="calendar.html">Calendar</a></li> -->
			<!-- 					<li><a href="invoice.html">Invoice</a></li> -->
			<!-- 					<li><a href="chat.html">Chat option</a></li> -->
			<!-- 				</ul></li> -->
			<!-- 			<li class="submenu"><a href="#"><i -->
			<!-- 					class="icon icon-info-sign"></i> <span>Error</span> <span -->
			<!-- 					class="label label-important">4</span></a> -->
			<!-- 				<ul> -->
			<!-- 					<li><a href="error403.html">Error 403</a></li> -->
			<!-- 					<li><a href="error404.html">Error 404</a></li> -->
			<!-- 					<li><a href="error405.html">Error 405</a></li> -->
			<!-- 					<li><a href="error500.html">Error 500</a></li> -->
			<!-- 				</ul></li> -->
			<!-- 			<li class="content"><span>Monthly Bandwidth Transfer</span> -->
			<!-- 				<div -->
			<!-- 					class="progress progress-mini progress-danger active progress-striped"> -->
			<!-- 					<div style="width: 77%;" class="bar"></div> -->
			<!-- 				</div> <span class="percent">77%</span> -->
			<!-- 				<div class="stat">21419.94 / 14000 MB</div></li> -->
			<!-- 			<li class="content"><span>Disk Space Usage</span> -->
			<!-- 				<div class="progress progress-mini active progress-striped"> -->
			<!-- 					<div style="width: 87%;" class="bar"></div> -->
			<!-- 				</div> <span class="percent">87%</span> -->
			<!-- 				<div class="stat">604.44 / 4000 MB</div></li> -->
			<!-- 		</ul> -->
	</div>
	<!--Turning-series-chart-js-->
	<script src="js/matrix.dashboard.js"></script>
</body>
</html>