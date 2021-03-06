<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
        <link rel="stylesheet" href="../css/home-page.css">

        <title>Car rental - Home page</title>
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
                            <a href="../" class="nav-link active">Home</a>
                        </li>
                        <li class="nav-item">
                            <a href="../our-cars" class="nav-link">Check Our Cars</a>
                        </li>
                        <li class="nav-item">
                            <a href="../about-us" class="nav-link">About Us</a>
                        </li>
                        <li class="nav-item">
                            <a href="../contact" class="nav-link">Contact</a>
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
                            <h5 class="modal-title">Thanks you for subscribing!</h5>
                            <button class="close" data-dismiss="modal">&times;</button>
                        </div>
                        <div class="modal-body">
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Temporibus unde veniam harum
                            magnam molestias
                            dignissimos omnis
                            architecto, quod, obcaecati dolorum debitis dolore.
                        </div>
                        <div class="modal-footer">
                            <button class="btn btn-secondary" data-dismiss="modal">Close</button>
                        </div>
                    </div>
                </div>
            </div>
        </c:if>

        <!-- SHOWCASE SLIDER -->
        <section id="showcase">
            <div id="myCarousel" class="carousel slide" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                    <li data-target="#myCarousel" data-slide-to="1"></li>
                    <li data-target="#myCarousel" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner">
                    <div class="carousel-item carousel-image-1 active">
                        <div class="primary-overlay text-white">
                            <div class="container">
                                <div class="carousel-caption text-right mb-5">
                                    <h1 class="display-3">Heading One</h1>
                                    <p class="lead">Lorem ipsum dolor sit amet consectetur adipisicing elit. Iste,
                                        aperiam vel ullam deleniti
                                        reiciendis ratione quod aliquid inventore vero perspiciatis.</p>
                                    <a href="../our-cars" class="btn btn-danger btn-lg">Learn more</a>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="carousel-item carousel-image-2">
                        <div class="primary-overlay text-white">
                            <div class="container">
                                <div class="carousel-caption mb-5">
                                    <h1 class="display-3">Heading Two</h1>
                                    <p class="lead">Lorem ipsum dolor sit amet consectetur adipisicing elit. Iste,
                                        aperiam vel ullam deleniti
                                        reiciendis ratione quod aliquid inventore vero perspiciatis.</p>
                                    <a href="../about-us" class="btn btn-success btn-lg">Learn More</a>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="carousel-item carousel-image-3">
                        <div class="primary-overlay text-white">
                            <div class="container">
                                <div class="carousel-caption text-right mb-5">
                                    <h1 class="display-3">Heading Three</h1>
                                    <p class="lead">Lorem ipsum dolor sit amet consectetur adipisicing elit. Iste,
                                        aperiam vel ullam deleniti
                                        reiciendis ratione quod aliquid inventore vero perspiciatis.</p>
                                    <a href="../contact" class="btn btn-success btn-lg">Learn More</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <a href="#myCarousel" data-slide="prev" class="carousel-control-prev">
                    <span class="carousel-control-prev-icon"></span>
                </a>

                <a href="#myCarousel" data-slide="next" class="carousel-control-next">
                    <span class="carousel-control-next-icon"></span>
                </a>
            </div>
        </section>

        <!-- WHY US ICONS HEADING -->
        <section id="why-icons-heading" class="px-4 pt-4 pb-1">
            <div class="row">
                <div class="col">
                    <div class="container py-4">
                        <h1>Why you should choose us?</h1>
                        <p class="d-none d-md-block">Lorem ipsum dolor, sit amet consectetur adipisicing elit. Est eaque
                            magni sit dolores.
                            Nisi, dolor nam modi perspiciatis consequatur soluta.</p>
                    </div>
                </div>
            </div>
        </section>


        <!--WHY US ICONS BODY  -->
        <section id="why-us-icons" class="pt-2 pb-5">
            <div class="container">
                <div class="row">
                    <div class="col-md-4 py-4 text-center">
                        <i class="fas fa-car fa-3x mb-2"></i>
                        <h3>Our Cars</h3>
                        <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Libero, veniam.</p>
                    </div>
                    <div class="col-md-4 py-4 text-center">
                        <i class="fas fa-car-crash fa-3x mb-2"></i>
                        <h3>Accidents</h3>
                        <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Libero, veniam.</p>
                    </div>
                    <div class="col-md-4 py-4 text-center">
                        <i class="fas fa-id-card fa-3x mb-2"></i>
                        <h3>Driving License</h3>
                        <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Libero, veniam.</p>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-4 py-4 text-center">
                        <i class="fas fa-credit-card fa-3x mb-2"></i>
                        <h3>Payments</h3>
                        <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Libero, veniam.</p>
                    </div>
                    <div class="col-md-4 py-4 text-center">
                        <i class="fas fa-handshake fa-3x mb-2"></i>
                        <h3>Special Discounts</h3>
                        <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Libero, veniam.</p>
                    </div>
                    <div class="col-md-4 py-4 text-center">
                        <i class="fas fa-chart-line fa-3x mb-2"></i>
                        <h3>Still Growing!</h3>
                        <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Libero, veniam.</p>
                    </div>
                </div>
            </div>
        </section>

        <!-- CARS HEADING -->
        <section id="cars-heading" class="px-4 pt-2 pb-2 bg-light">
            <div class="row">
                <div class="col">
                    <div class="container py-4">
                        <h1>Do you want to check some of our cars?</h1>
                        <p class="d-none d-md-block">Lorem ipsum dolor, sit amet consectetur adipisicing elit. Est eaque
                            magni sit dolores.
                            Nisi, dolor nam modi perspiciatis consequatur soluta.</p>
                    </div>
                </div>
            </div>
        </section>

        <!-- CARS -->
        <section id="cars" class="pb-5 text-center bg-light">
            <div class="container">
                <div class="row">
                    <c:forEach items="${homePageCars}" var="car">
                        <a href="../car-details/${car.id}" class="col-lg-3 col-md-6 mb-4">
                            <div class="card">
                                <div class="card-body">
                                    <img src="${car.imageUrl}" alt="" class="img-fluid mb-2">
                                    <h3>${car.fullName}</h3>
                                    <h5 class="text-muted mb-3">${car.typeName}</h5>
                                    <p>${car.description}</p>
                                </div>
                            </div>
                        </a>
                    </c:forEach>

                </div>

                <div class="d-flex">
                    <a href="../our-cars" id="show-more-cars" class="btn ml-auto">Show more!</a>
                </div>
            </div>
        </section>

        <!-- NEWSLETTER -->
        <section id="newsletter" class="text-center p-5">
            <div class="container">
                <div class="row">
                    <div class="col">
                        <h1>Sign Up For Our Newsletter</h1>
                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Optio asperiores consectetur, quae
                            ducimus voluptates
                            vero repellendus architecto maiores recusandae mollitia?</p>
                        <form:form class="form-inline justify-content-center" action="/newsletter" method="post"
                                   modelAttribute="newsletterForm">

                            <div class="mb-2 mr-2">
                                <form:input path="subscriberName" type="text" class="form-control"
                                            cssErrorClass="form-control is-invalid" placeholder="Enter Name"
                                            pattern="[a-zA-Z]{3,30}" required="true"/>
                                <div class="invalid-tooltip text-left">
                                    <form:errors path="subscriberName"/>
                                </div>

                            </div>
                            <div class="mb-2 mr-2">
                                <form:input path="subscriberEmail" type="email" class="form-control"
                                            cssErrorClass="form-control is-invalid"
                                            placeholder="Enter Email" required="true"/>
                                <div class="invalid-tooltip text-left">
                                    <form:errors path="subscriberEmail"/>
                                </div>
                            </div>

                            <button class="btn btn-primary mb-2" type="submit">Submit</button>
                        </form:form>
                    </div>
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
        <!-- https://github.com/maaaaark/bcSwipe -->
        <script src="../js/jquery.bcSwipe.min.js"></script>

        <script>
            // Get the current year for the copyright
            $('#year').text(new Date().getFullYear());

            // Configure Slider
            $('.carousel').carousel({
                interval: 10000,
                pause: 'hover'
            });

            // Toggle modal if exists
            $('#successModal').modal();

            // Carousel mobile swipe
            $('.carousel').bcSwipe({threshold: 50});
        </script>
    </body>

</html>