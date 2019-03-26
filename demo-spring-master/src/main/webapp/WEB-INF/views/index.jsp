<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css"
          integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">

    <title>Mon application</title>
</head>
<body>
<h1>Liste des formations</h1>
<ul>
    <c:forEach items="${formationList}" var="formation">
        <li>${formation.theme.toString()}
            <a href="delete.html?id=${formation.id}">
                <i class="fas fa-backspace"></i>
            </a>
            <a href="edit.html?id=${formation.id}">
                <i class="fas fa-keyboard"></i>
            </a>
        </li>
    </c:forEach>
</ul>
<a class="button" href="form.html">Créer une formation</a>
</body>
</html>
