<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <H1> Hello there. Answer some questions :) </H1>
</head>
<body>
<form action="/FilmsServlet" method="POST">
    <p><b>Your favorite movie genre:</b></p>
    <p>
        <input type="radio" name="movie" value="Comedy">Comedy<br>
        <input type="radio" name="movie" value="Drama">Drama<br>
        <input type="radio" name="movie" value="Action">Action<br>
        <input type="radio" name="movie" value="Fiction">Fiction<br>
    </p>


    <p><b> Your favorite actor: </b></p>
    <p>
        <input type="radio" name="actor" value="Brad Pitt">Brad Pitt<br>
        <input type="radio" name="actor" value="Anthony Hopkins">Anthony Hopkins<br>
        <input type="radio" name="actor" value="Johny Depp">Johny Depp<br>
        <input type="radio" name="actor" value="Matthew McConaughey">Matthew McConaughey<br>
    </p>

    <input type="submit"/>
</form>
</body>
</html>