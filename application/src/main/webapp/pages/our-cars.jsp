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
        <link rel="stylesheet" href="../css/our-cars.css">

        <title>Car rental - Home page</title>
    </head>

    <body>
        <!-- NAVBAR -->
        <nav class="navbar navbar-expand-md navbar-light fixed-top py-4" id="main-nav">
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
                            <a href="../our-cars" class="nav-link active">Check Our Cars</a>
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


        <!-- SEARCH SETTINGS SECTION -->
        <section id="search-settings" class="px-4 pt-4 bg-light">
            <div class="row">
                <div class="col">
                    <div class="container py-1">
                        <h4>Search settings:</h4>
                        <p class="d-none text-muted d-md-block">Lorem ipsum dolor sit, amet consectetur adipisicing
                            elit. Dolorum, repellat!</p>
                    </div>
                </div>
            </div>

            <form:form action="/our-cars" method="post" class="container pt-3">
                <div class="row">
                    <div class="col-md-3">
                        <div class="form-group">
                            <select class="form-control">
                                <option>All Types</option>
                                <option>Type 1</option>
                                <option>Type 2</option>
                                <option>Type 3</option>
                            </select>
                        </div>
                    </div>

                    <div class="col-md-3">
                        <div class="form-group">
                            <select class="form-control">
                                <option>All Brands</option>
                                <option>Brand 1</option>
                                <option>Brand 2</option>
                                <option>Brand 3</option>
                            </select>
                        </div>
                    </div>

                    <div class="col-md-3">
                        <div class="form-group">
                            <select class="form-control">
                                <option>Select Brand First!</option>
                            </select>
                        </div>
                    </div>

                    <div class="col-md-3">
                        <div class="form-group">
                            <select class="form-control">
                                <option>All Fuel Types</option>
                                <option>Fuel Type 1</option>
                                <option>Fuel Type 2</option>
                                <option>Fuel Type 3</option>
                            </select>
                        </div>
                    </div>

                </div>

                <div class="row pt-5 ">
                    <div id="search-tabs" class="col-md-7">
                        <ul class="nav nav-tabs">
                            <li class="nav-item">
                                <a class="nav-link active" href="#">All
                                    <span class="badge badge-success ml-1 d-none d-md-inline-flex ">37</span>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">Available
                                    <span class="badge badge-dark ml-1 d-none d-md-inline-flex ">30</span>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">Not Available
                                    <span class="badge badge-dark ml-1 d-none d-md-inline-flex ">7</span>
                                </a>
                            </li>
                        </ul>
                    </div>

                    <div class="col-md-2">
                        <div class="row">
                            <div class="col">
                                <button class="btn btn-success btn-block btn-sm" type="submit">
                                    Search
                                </button>
                            </div>
                        </div>
                    </div>

                    <div class="col-md-3">
                        <div class="form-group p-0 m-0">
                            <select class="form-control form-control-sm" id="gender">
                                <option>Sort by: Price</option>
                                <option>Type 2</option>
                                <option>Type 3</option>
                            </select>
                        </div>
                    </div>

                </div>
            </form:form>
        </section>


        <!-- CARS -->
        <section id="cars" class="pt-5 text-center">
            <div class="container">
                <div class="row">

                    <c:forEach items="${cars}" var="car">
                        <a href="/car-details/${car.id}" class="btn col-12 mb-2">
                            <div class="card bg-light overflow-hide">
                                <div class="card-body p-0">
                                    <div class="row m-0">
                                        <div class="col-md-4 col-lg-3 p-0 fill">
                                            <img src="/images/${car.id}/${car.images.get(0).url}" alt=""
                                                 class="img-fluid">
                                        </div>
                                        <div class="col-md-8 col-lg-9 d-flex align-items-center py-3">
                                            <div class="container text-left">
                                                <div class="row pb-2 text-primary">
                                                    <div class="col-md-6 ">
                                                        <h5>${car.model.brand.brandName} ${car.model.modelName}</h5>
                                                    </div>
                                                    <div class="col-md-6 text-right ">
                                                        <h6>${car.rentPrice} pln/day</h6>
                                                    </div>
                                                </div>

                                                <div class="row text-muted">
                                                    <div class="col-md-6 col-lg-4 my-2">
                                                        <b>Type:</b> Cabriolet
                                                    </div>
                                                    <div class="col-md-6 col-lg-4 my-2">
                                                        <b>Engine:</b> 2.3 cm3 ecodrive
                                                    </div>
                                                    <div class="col-md-6 col-lg-4 my-2">
                                                        <b>Power:</b> 330 km
                                                    </div>
                                                    <div class="col-md-6 col-lg-4 my-2">
                                                        <b>Fuel Type:</b> Diesel
                                                    </div>
                                                    <div class="col-md-6 col-lg-4 my-2">
                                                        <b>Color:</b> White
                                                    </div>
                                                    <div class="col-md-6 col-lg-4 my-2">
                                                        <b>Status:</b> Available
                                                    </div>

                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </a>
                    </c:forEach>
                </div>
            </div>
        </section>

        <!-- PAGINATOR -->
        <section id="paginator" class="text-center py-3">
            <div class="container bg-success"></div>
            <ul class="pagination justify-content-center">
                <li class="page-item disabled"><a class="page-link" href="#">Previous</a></li>
                <li class="page-item active"><a class="page-link" href="#">1</a></li>
                <li class="page-item"><a class="page-link" href="#">2</a></li>
                <li class="page-item"><a class="page-link" href="#">3</a></li>
                <li class="page-item"><a class="page-link" href="#">Next</a></li>
            </ul>
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
        </script>
    </body>

</html>