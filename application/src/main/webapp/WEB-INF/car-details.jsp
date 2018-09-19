<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
        <link rel="stylesheet" href="../css/car-details.css">

        <title>Car rental - Car details</title>
    </head>

    <body>
        <!-- NAVBAR -->
        <nav class="navbar navbar-expand-md navbar-light fixed-top py-1" id="main-nav">
            <div class="container">
                <a href="../" class="navbar-brand">
                    <img src="../img/temp-logo.png" width="50" height="50" alt="">
                    <h5 class="d-inline align-middle ml-1">Car rental</h5>
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
                            <a href="../contact" class="nav-link">Contact</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

        <section class="${car==null ? 'd-none' : ''}">

            <!-- CAR DETAILS HEADER -->
            <section id="car-details-header" class="px-4 py-4 bg-light">
                <div class="container">
                    <div class="row">
                        <div class="col-md-6 ">
                            <h5>${car.brand} ${car.model}</h5>
                            <p class="text-muted">${car.description}</p>
                        </div>
                        <div class="col-md-6 text-right ">
                            <h6>${car.rentPrice} pln / day</h6>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-4">
                            <p class="text-muted my-1">Economy:</p>
                            <div class="progress">
                                <div class="progress-bar bg-info text-light" style="width:${car.economyRating/5*100}%;">
                                    <b>${car.economyRating} / 5</b></div>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <p class="text-muted m-1">Comfort:</p>
                            <div class="progress">
                                <div class="progress-bar bg-info text-light" style="width:${car.comfortRating/5*100}%;">
                                    <b>${car.comfortRating} / 5</b></div>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <p class="text-muted m-1">Power:</p>
                            <div class="progress">
                                <div class="progress-bar bg-danger text-light" style="width:${car.powerRating/5*100}%;">
                                    <b>${car.powerRating} / 5</b></div>
                            </div>
                        </div>

                    </div>
                </div>
            </section>

            <!-- CAR DETAILS SHOWCASE -->
            <section id="car-detail-showcase">

                <div id="myCarousel" class="carousel slide carousel-fade" data-ride="carousel">
                    <ol class="carousel-indicators">
                        <c:forEach items="${car.images}" varStatus="status">
                            <li data-target="#myCarousel" data-slide-to="${status.count-1}"
                                class="${status.first ? 'active' : ''}"></li>
                        </c:forEach>
                    </ol>
                    <div class="carousel-inner" style="min-height: 50vh">
                        <c:forEach items="${car.images}" var="image" varStatus="status">
                            <div class="carousel-item ${status.first ? 'active' : ''}">
                                <div class="row"
                                     style="background: url('${image.url}') no-repeat center center;
                                             -webkit-background-size: cover;
                                             -moz-background-size: cover;
                                             -o-background-size: cover;
                                             background-size: cover;">
                                    <div class="primary-overlay">
                                        <div class="container p-0" style="height: 50vh;">
                                            <div class="d-flex justify-content-center align-items-center h-100">
                                                <a href="${image.url}" data-toggle="lightbox"
                                                   data-gallery="img-gallery"
                                                   data-height="560" data-width="560">
                                                    <img src="${image.url}" alt="" class="img-fluid">
                                                </a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>

                    <a href="#myCarousel" data-slide="prev" class="carousel-control-prev">
                        <span class="carousel-control-prev-icon"></span>
                    </a>
                    <a href="#myCarousel" data-slide="next" class="carousel-control-next">
                        <span class="carousel-control-next-icon"></span>
                    </a>
                </div>
            </section>


            <!-- CAR DETAILS WITH COLLAPSE -->
            <section id="car-details" class="bg-light">
                <div class="pt-1 pb-1">
                    <button class="btn btn-white d-block m-0 w-100" data-toggle="collapse"
                            data-target="#car-details-colapse" aria-expanded="true"
                            aria-controls="car-equipment-colapse">Car Details
                    </button>
                </div>

                <div class="container collapse show" id="car-details-colapse">
                    <div class="row text-muted  pb-3 pt-3 px-4 ">
                        <div class="col-md-6 col-lg-4 my-2 ${car.type==null ? 'd-none' : ''}">
                            <b>Type:</b> ${car.type}
                        </div>
                        <div class="col-md-6 col-lg-4 my-2 ${car.engine==null ? 'd-none' : ''}">
                            <b>Engine:</b> ${car.engine}
                        </div>
                        <div class="col-md-6 col-lg-4 my-2 ${car.horsePower==null||car.horsePower==0 ? 'd-none' : ''}">
                            <b>Power:</b> ${car.horsePower} km
                        </div>
                        <div class="col-md-6 col-lg-4 my-2 ${car.fuelType==null ? 'd-none' : ''}">
                            <b>Fuel Type:</b> ${car.fuelType}
                        </div>
                        <div class="col-md-6 col-lg-4 my-2 ${car.color==null ? 'd-none' : ''}">
                            <b>Color:</b> ${car.color}
                        </div>
                        <div class="col-md-6 col-lg-4 my-2 ${car.state==null ? 'd-none' : ''}">
                            <b>Status:</b> ${car.state}
                        </div>
                        <div class="col-md-6 col-lg-4 my-2 ${car.brand==null ? 'd-none' : ''}">
                            <b>Brand:</b> ${car.brand}
                        </div>
                        <div class="col-md-6 col-lg-4 my-2 ${car.model==null ? 'd-none' : ''}">
                            <b>Model:</b> ${car.model}
                        </div>
                        <div class="col-md-6 col-lg-4 my-2 ${car.prodDate==null ? 'd-none' : ''}">
                            <b>Production Date:</b> ${car.prodDate}
                        </div>
                        <div class="col-md-6 col-lg-4 my-2 ${car.mileage==null||car.mileage==0 ? 'd-none' : ''}">
                            <b>Mileage:</b> ${car.mileage}
                        </div>
                        <div class="col-md-6 col-lg-4 my-2 ${car.transmission==null ? 'd-none' : ''}">
                            <b>Transmission:</b> ${car.transmission}
                        </div>
                        <div class="col-md-6 col-lg-4 my-2 ${car.drivingGear==null ? 'd-none' : ''}">
                            <b>Driving Gear:</b> ${car.drivingGear}
                        </div>
                        <div class="col-md-6 col-lg-4 my-2 ${car.numberOfDoors==null||car.numberOfDoors==0 ? 'd-none' : ''}">
                            <b>Number of doors:</b> ${car.numberOfDoors}
                        </div>
                        <div class="col-md-6 col-lg-4 my-2 ${car.numberOfSeats==null||car.numberOfSeats==0 ? 'd-none' : ''}">
                            <b>Number of seats:</b> ${car.numberOfSeats}
                        </div>

                    </div>
                </div>
            </section>

            <!-- CAR EQUIPMENT WITH COLLAPSE -->
            <section id="car-equipment" class="bg-light">
                <div class="pt-0 pb-1">
                    <button class="btn btn-white d-block m-0 w-100" data-toggle="collapse"
                            data-target="#car-equipment-colapse" aria-expanded="true"
                            aria-controls="car-equipment-colapse">Car Equipment
                    </button>
                </div>

                <div class="container collapse show" id="car-equipment-colapse">
                    <div class="row text-muted  pb-3 pt-3 px-4 ">
                        <c:forEach items="${car.equipment}" var="item">
                            <div class="col-12 col-sm-6 col-md-4 ttt col-lg-3 my-2">
                                <i class="far fa-check-square"></i> ${item.itemName}
                            </div>
                        </c:forEach>
                    </div>
                </div>
            </section>

            <!-- CAR DESCTIPTION -->
            <section id="car-description">
                <div class="container">
                    <div class="row my-5 mx-3">
                        <div class="col">
                            <h2 class="mb-4">Descriprion: </h2>
                            ${car.fullDescription}
                        </div>
                    </div>
                </div>
            </section>

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
            })

            // Collapse car details and car equipment on small screens
            $(document).ready(function () {
                if (($(window).width() <= 767.98)) {
                    $('#car-details-colapse').removeClass('show');
                    $('#car-equipment-colapse').removeClass('show');
                }
            });

            // Carousel mobile swipe
            $('.carousel').bcSwipe({ threshold: 50 });
        </script>
    </body>

</html>