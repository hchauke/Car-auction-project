<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<!DOCTYPE html>
<html lang="en">
<head>
<!-- let's add tag srping:url -->
<spring:url value="/resources/css/testcss.css" var="crunchifyCSS" />
<spring:url value="/resources/js/testjs.js" var="crunchifyJS" />
<spring:url value="/resources/js/jquery.min.js" var="jqueryJS"/>

<link href="${crunchifyCSS}" rel="stylesheet" />
<script src="${jqueryJS}"></script>
<script src="${crunchifyJS}"></script>
<!-- Finish adding tags -->
</head>
<body>${message}
<div
style="font-family: verdana; padding: 10px; border-radius: 10px; font-size: 12px; text-align: center;">


    Login Message : Ooops!!!


    <h2>Checkout this font color. Loaded from 'crunchify.css' file under '/WebContent/resources/' folder</h2>

    		<div id="crunchifyMessage"></div>

    		<br> Spring MCV Tutorial by <a href="http://crunchify.com">Crunchify</a>.

    		<br> <br> Click <a
    			href="http://crunchify.com/category/java-web-development-tutorial/"
    			target="_blank">here</a> for all Java and <a
    			href='http://crunchify.com/category/spring-mvc/' target='_blank'>here</a>
    		for all Spring MVC, Web Development examples.<br>
    	</div>
</body>

</html>