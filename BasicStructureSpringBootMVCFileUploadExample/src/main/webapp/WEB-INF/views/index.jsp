<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
</head>
<body>
    <h2>${filesuccess}</h2>
	<form:form method="post" action="savefile"
		enctype="multipart/form-data">
		<p>
			<label for="file">Choose file</label>
		</p>
		<p>
			<input name="file" id="fileToUpload" type="file" />
		</p>
		<p>
			<input type="submit" value="Upload">
		</p>
	</form:form>	
</body>
</html>