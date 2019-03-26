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
<h1>Créer une formation</h1>
<form method="post">
    <div>
        <label for="theme">Formation :</label>
        <input placeholder="Thème" id="theme" name="theme">
    </div>
    <a class="button" href="index.html">Retour</a>
    <button class="button" type="submit">OK</button>
</form>
</body>