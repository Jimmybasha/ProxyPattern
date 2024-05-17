<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Video Player</title>
</head>
<body>
    <h1>Video Player</h1>
    <video width="640" height="480" controls>
        <source src="${videoUrl}" type="video/mp4">
        Your browser does not support the video tag.
    </video>
    <br>
    <a href="${pageContext.request.contextPath}/DownloadServlet?videoUrl=${videoUrl}">Download Video</a>
</body>
</html>
