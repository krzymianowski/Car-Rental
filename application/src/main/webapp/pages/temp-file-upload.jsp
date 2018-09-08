<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
              content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Temp File Upload</title>
    </head>
    <body>
        <h1>Temp File Upload:</h1> <span>${message}</span>
        <form:form action="/images/upload" method="post" enctype="multipart/form-data">
            <input type="file" name="files" multiple>
            <input type="text" name="folder">
            <input type="submit" value="upload">
        </form:form>
    </body>
</html>