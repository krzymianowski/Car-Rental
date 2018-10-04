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
        <link rel="stylesheet" href="../css/style.css">
        <link rel="stylesheet" href="../css/contact.css">

        <title>Car rental - About us</title>
    </head>

    <body>
        <!-- NAVBAR -->
        <nav class="navbar navbar-expand-md navbar-light fixed-top py-1" id="main-nav">
            <div class="container">
                <a href="../" class="navbar-brand d-flex">
                    <img src="../img/temp-logo.png" width="50" height="50" alt="">
                    <div class="d-inline-block ml-3 m-0 p-0">
                        <div class="m-0 p-0"><b>Car</b> rental</div>
                        <small class="text-muted m-0 p-0 d-flex">Best
                            cars, best prices!</small>
                    </div>
                </a>
                <button class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarCollapse">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item ">
                            <a href="../" class="nav-link">Home</a>
                        </li>
                        <li class="nav-item">
                            <a href="../our-cars" class="nav-link">Check Our Cars</a>
                        </li>
                        <li class="nav-item">
                            <a href="../about-us" class="nav-link">About Us</a>
                        </li>
                        <li class="nav-item">
                            <a href="../contact" class="nav-link active">Contact</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

        <c:if test="${success}">
            <!-- MODAL -->
            <div class="modal show" id="successModal">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title">your message has been successfully sent</h5>
                            <button class="close" data-dismiss="modal">&times;</button>
                        </div>
                        <div class="modal-body">
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Temporibus unde veniam harum
                            magnam molestias
                            dignissimos omnis
                            architecto, quod, obcaecati dolorum debitis dolore porro qui, iusto quo accusantium
                            voluptates pariatur illo.
                        </div>
                        <div class="modal-footer">
                            <button class="btn btn-secondary" data-dismiss="modal">Close</button>
                        </div>
                    </div>
                </div>
            </div>
        </c:if>

        <!-- PAGE HEADER -->
        <header id="page-header">
            <div class="primary-overlay">
                <div class="container py-5 h-100">
                    <div class="row">
                        <div class="col-md-6 m-auto text-center">
                            <h1>Contact Us</h1>
                            <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Quas, temporibus?</p>
                        </div>
                    </div>
                </div>
            </div>
        </header>


        <!-- CONTACT SECTION -->
        <section id="contact" class="py-3">
            <div class="container">
                <div class="row">
                    <div class="col-md-4">
                        <div class="card p-4 mb-2 bg-light">
                            <div class="card-body">
                                <h4>Get In Touch</h4>
                                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Pariatur, odio!</p>
                                <h4>Address</h4>
                                <p>ul. Inowrocławska 56, 53-648 Wrocław</p>
                                <h4>Email</h4>
                                <p>test@test.com</p>
                                <h4>Phone</h4>
                                <p>123 456 789</p>
                            </div>
                        </div>
                    </div>
                    <form:form action="/contact" method="post" modelAttribute="contactForm" class="col-md-8">
                        <div class="card p-4 bg-light">
                            <div class="card-body">
                                <h3 class="text-center">Please fill out this form to contact us</h3>
                                <hr>

                                <!-- if errors -->
                                <form:errors path="*">
                                    <div class="row">
                                        <div id="#ertest" class="col-12 m-2 text-danger">
                                            Please fix errors to continue
                                        </div>
                                    </div>
                                    <hr>
                                </form:errors>
                                <!-- end if errors -->

                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <form:input path="firstName" type="text" class="form-control"
                                                        cssErrorClass="form-control is-invalid" placeholder="First Name"
                                                        pattern="[a-zA-Z]{3,30}" required="true"/>
                                            <div class="invalid-feedback">
                                                <form:errors path="firstName"/>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <form:input path="lastName" type="text" class="form-control"
                                                        cssErrorClass="form-control is-invalid"
                                                        placeholder="Last Name"/>
                                            <div class="invalid-feedback">
                                                <form:errors path="lastName"/>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <form:input path="email" type="email" class="form-control"
                                                        cssErrorClass="form-control is-invalid"
                                                        placeholder="Email" required="true"/>
                                            <div class="invalid-feedback">
                                                <form:errors path="email"/>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <form:input path="phone" type="text" class="form-control"
                                                        cssErrorClass="form-control is-invalid"
                                                        placeholder="Phone Number"/>
                                            <div class="invalid-feedback">
                                                <form:errors path="phone"/>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-12">
                                        <div class="form-group">
                                            <form:textarea path="message" class="form-control"
                                                           cssErrorClass="form-control is-invalid"
                                                           placeholder="Message" required="true"></form:textarea>
                                            <div class="invalid-feedback">
                                                <form:errors path="message"/>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-12">
                                        <div class="form-group">
                                            <input type="submit" value="Submit"
                                                   class="btn btn-outline-danger btn-block btn-white">
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </form:form>
                </div>
            </div>
        </section>

        <!-- FOOTER -->
        <footer id="main-footer" class="text-center p-4">
            <div class="container">
                <div class="row">
                    <div class="col">
                        <p>Copyright &copy;
                            <span id="year"></span> Car rental</p>
                    </div>
                </div>
            </div>
        </footer>

        <script src="../js/jquery-3.3.1.min.js"></script>
        <script src="../js/popper.min.js"></script>
        <script src="../js/bootstrap.min.js"></script>

        <script>
            // Get the current year for the copyright
            $('#year').text(new Date().getFullYear());

            // Toggle modal if exists
            $('#successModal').modal();
        </script>
    </body>

</html>