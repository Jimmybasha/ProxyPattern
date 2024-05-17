<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>VideoDownloader</title>
</head>
<body>
    <form action="DownloadServlet" method="get">
        <input type="text" name="videoUrl" placeholder="Please Enter YouTube Video URL">
        <button type="submit">Download Video</button>
    </form>
</body>
</html>
