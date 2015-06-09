<!DOCTYPE html>
<head>
<meta charset="ISO-8859-1">
</head>
<body onLoad="exec()">

<script type="text/javascript">

function exec() {
	if("${src}".length>0)
	location.href=decodeURIComponent("${src}");
}
</script>

${message}<br>
${backlink}
</body>
</html>