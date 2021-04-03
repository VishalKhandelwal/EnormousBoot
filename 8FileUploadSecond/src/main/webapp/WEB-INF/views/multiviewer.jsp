<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags"%>
<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<c:url value="/upload/CRUD.html"/>
 <button type="button" onclick="myFunction('<c:url value="/Upload/CRUD.html"/>')">HTML</button>
 <button type="button" onclick="myFunction('<c:url value="/Upload/gift.PNG"/>')">Gift</button>
 <button type="button" onclick="myFunction('<c:url value="/Upload/Spoken-English-Guru-eBook.pdf"/>')">PDF</button>
 <button type="button" onclick="myFunction('<c:url value="/Upload/springCrudsql.txt"/>')">Text</button>
 
 <iframe style="height:500px;width:100%;"  name="idkl" id="idkl" ></iframe>
 <script>
    function myFunction(path) {
    	  console.log(path);
    	  document.getElementById("idkl").src = path;
    	}
      </script>
</body>
</html>