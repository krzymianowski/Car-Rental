<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">

        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css"
              integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU"
              crossorigin="anonymous">
        <link type="text/css" rel="stylesheet" href="../css/bootstrap.css">
        <link type="text/css" rel="stylesheet" href="../css/login-page.css">

        <title>Car rental - Login page</title>
    </head>

    <body class=" bg-light ">

        <!-- LOGIN -->
        <section id="login" class="d-flex py-5 px-2">
            <div class="container">
                <div class="row">
                    <div class="col-sm-8 col-md-6 col-lg-5 col-xl-4 mx-auto">
                        <div class="card">
                            <div class="card-header">
                                <a href="/" class="px-2">
                                    <img src="../img/temp-logo.png" width="50" height="50" alt="">
                                    <p class="d-inline align-middle ml-2"><b>Car Rental</b>: Login</p>
                                </a>
                            </div>
                            <div class="card-body mt-2">
                                <form:form action="/authenticate" method="post">
                                    <c:choose>
                                        <c:when test="${param.error != null}">
                                            <div class="my-3 text-danger">
                                                Lorem ipsum dolor sit amet consectetur adipisicing elit. Dolorem, atque.
                                            </div>
                                        </c:when>
                                        <c:when test="${param.logout != null}">
                                            <div class="my-3 text-success">
                                                Yoy have been logged out.
                                            </div>
                                        </c:when>
                                        <c:otherwise>
                                            <div class="my-3 text-primary">
                                                Lorem ipsum dolor sit amet consectetur adipisicing elit. Dolorem, atque.
                                            </div>
                                        </c:otherwise>
                                    </c:choose>

                                    <div class="input-group mb-2">
                                        <div class="input-group-prepend">
                                            <span class="input-group-text ${param.error != null ? 'border border-danger' : ''}"><i
                                                    class="fas fa-user"></i></span>
                                        </div>
                                        <input class="form-control ${param.error != null ? 'is-invalid' : ''}"
                                               type="text" placeholder="Username" name="username">
                                    </div>

                                    <div class="input-group mb-5">
                                        <div class="input-group-prepend">
                                            <span class="input-group-text ${param.error != null ? 'border border-danger' : ''}"><i
                                                    class="fas fa-unlock-alt"></i></span>
                                        </div>
                                        <input class="form-control ${param.error != null ? 'is-invalid' : ''}"
                                               type="password" placeholder="Password" name="password">
                                    </div>
                                    <input type="submit" value="Login" class="btn btn-primary btn-block mt-4">
                                </form:form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <script src="../js/jquery-3.3.1.min.js"></script>
        <script src="../js/popper.min.js"></script>
        <script src="../js/bootstrap.min.js"></script>

    </body>

</html>