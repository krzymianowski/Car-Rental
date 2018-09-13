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
                            elit. Dolorum,
                            repellat!</p>
                    </div>
                </div>
            </div>

            <div class="container pt-3">
                <div class="row">
                    <div class="col-md-3">
                        <div class="dropdown">
                            <label>Type: </label>
                            <button class="btn btn-white btn-block dropdown-toggle overflow-hidden" type="button"
                                    data-toggle="dropdown">
                                <span class="prefix">Type: </span>${typeParam.value}
                            </button>
                            <div class="dropdown-menu">
                                <c:url var="typeUrlAll" value="/our-cars">
                                    <c:if test="${!brandParam.equalsDefaultValue}">
                                        <c:param name="brand" value="${brandParam.value}"/>
                                    </c:if>
                                    <c:if test="${!modelParam.equalsDefaultValue}">
                                        <c:param name="model" value="${modelParam.value}"/>
                                    </c:if>
                                    <c:if test="${!fuelParam.equalsDefaultValue}">
                                        <c:param name="fuel" value="${fuelParam.value}"/>
                                    </c:if>
                                    <c:if test="${!sortParam.equalsDefaultValue}">
                                        <c:param name="sort" value="${sortParam.value}"/>
                                    </c:if>
                                    <c:if test="${!dirParam.equalsDefaultValue}">
                                        <c:param name="dir" value="${dirParam.value}"/>
                                    </c:if>
                                    <c:if test="${!stateParam.equalsDefaultValue}">
                                        <c:param name="state" value="${stateParam.value}"/>
                                    </c:if>
                                </c:url>
                                <a class="dropdown-item" href="${typeUrlAll}">Show All</a>

                                <c:forEach items="${carTypes}" var="type">
                                    <c:url var="typeUrl" value="/our-cars">
                                        <c:param name="type" value="${type.typeName}"/>
                                        <c:if test="${!brandParam.equalsDefaultValue}">
                                            <c:param name="brand" value="${brandParam.value}"/>
                                        </c:if>
                                        <c:if test="${!modelParam.equalsDefaultValue}">
                                            <c:param name="model" value="${modelParam.value}"/>
                                        </c:if>
                                        <c:if test="${!fuelParam.equalsDefaultValue}">
                                            <c:param name="fuel" value="${fuelParam.value}"/>
                                        </c:if>
                                        <c:if test="${!sortParam.equalsDefaultValue}">
                                            <c:param name="sort" value="${sortParam.value}"/>
                                        </c:if>
                                        <c:if test="${!dirParam.equalsDefaultValue}">
                                            <c:param name="dir" value="${dirParam.value}"/>
                                        </c:if>
                                        <c:if test="${!stateParam.equalsDefaultValue}">
                                            <c:param name="state" value="${stateParam.value}"/>
                                        </c:if>
                                    </c:url>
                                    <a class="dropdown-item" href="${typeUrl}" data-toggle="tooltip"
                                       data-placement="bottom"
                                       title="${type.typeDescription}">${type.typeName}</a>
                                </c:forEach>
                            </div>
                        </div>
                    </div>

                    <div class="col-md-3">
                        <div class="dropdown">
                            <label>Brand: </label>
                            <button class="btn btn-white btn-block dropdown-toggle overflow-hidden" type="button"
                                    data-toggle="dropdown">
                                <span class="prefix">Brand: </span>${brandParam.value}
                            </button>
                            <div class="dropdown-menu">
                                <c:url var="brandUrlAll" value="/our-cars">
                                    <c:if test="${!typeParam.equalsDefaultValue}">
                                        <c:param name="type" value="${typeParam.value}"/>
                                    </c:if>
                                    <c:if test="${!fuelParam.equalsDefaultValue}">
                                        <c:param name="fuel" value="${fuelParam.value}"/>
                                    </c:if>
                                    <c:if test="${!sortParam.equalsDefaultValue}">
                                        <c:param name="sort" value="${sortParam.value}"/>
                                    </c:if>
                                    <c:if test="${!dirParam.equalsDefaultValue}">
                                        <c:param name="dir" value="${dirParam.value}"/>
                                    </c:if>
                                    <c:if test="${!stateParam.equalsDefaultValue}">
                                        <c:param name="state" value="${stateParam.value}"/>
                                    </c:if>
                                </c:url>
                                <a class="dropdown-item" href="${brandUrlAll}">Show All</a>

                                <c:forEach items="${carBrands}" var="brand">
                                    <c:url var="brandUrl" value="/our-cars">
                                        <c:if test="${!typeParam.equalsDefaultValue}">
                                            <c:param name="type" value="${typeParam.value}"/>
                                        </c:if>
                                        <c:param name="brand" value="${brand.brandName}"/>
                                        <c:if test="${!fuelParam.equalsDefaultValue}">
                                            <c:param name="fuel" value="${fuelParam.value}"/>
                                        </c:if>
                                        <c:if test="${!sortParam.equalsDefaultValue}">
                                            <c:param name="sort" value="${sortParam.value}"/>
                                        </c:if>
                                        <c:if test="${!dirParam.equalsDefaultValue}">
                                            <c:param name="dir" value="${dirParam.value}"/>
                                        </c:if>
                                        <c:if test="${!stateParam.equalsDefaultValue}">
                                            <c:param name="state" value="${stateParam.value}"/>
                                        </c:if>
                                    </c:url>
                                    <a class="dropdown-item" href="${brandUrl}">${brand.brandName}</a>
                                </c:forEach>
                            </div>
                        </div>
                    </div>

                    <div class="col-md-3">
                        <div class="dropdown">
                            <label>Model: </label>
                            <button class="btn btn-white btn-block dropdown-toggle overflow-hidden" type="button"
                                    data-toggle="dropdown">
                                <span class="prefix">Model: </span>${modelParam.value}
                            </button>
                            <div class="dropdown-menu">
                                <c:url var="modelUrlAll" value="/our-cars">
                                    <c:if test="${!typeParam.equalsDefaultValue}">
                                        <c:param name="type" value="${typeParam.value}"/>
                                    </c:if>
                                    <c:if test="${!brandParam.equalsDefaultValue}">
                                        <c:param name="brand" value="${brandParam.value}"/>
                                    </c:if>
                                    <c:if test="${!fuelParam.equalsDefaultValue}">
                                        <c:param name="fuel" value="${fuelParam.value}"/>
                                    </c:if>
                                    <c:if test="${!sortParam.equalsDefaultValue}">
                                        <c:param name="sort" value="${sortParam.value}"/>
                                    </c:if>
                                    <c:if test="${!dirParam.equalsDefaultValue}">
                                        <c:param name="dir" value="${dirParam.value}"/>
                                    </c:if>
                                    <c:if test="${!stateParam.equalsDefaultValue}">
                                        <c:param name="state" value="${stateParam.value}"/>
                                    </c:if>
                                </c:url>
                                <a class="dropdown-item" href="${modelUrlAll}">Show All</a>

                                <c:forEach items="${carModels}" var="model">
                                    <c:url var="modelUrl" value="/our-cars">
                                        <c:if test="${!typeParam.equalsDefaultValue}">
                                            <c:param name="type" value="${typeParam.value}"/>
                                        </c:if>
                                        <c:if test="${!brandParam.equalsDefaultValue}">
                                            <c:param name="brand" value="${brandParam.value}"/>
                                        </c:if>
                                        <c:param name="model" value="${model.modelName}"/>
                                        <c:if test="${!fuelParam.equalsDefaultValue}">
                                            <c:param name="fuel" value="${fuelParam.value}"/>
                                        </c:if>
                                        <c:if test="${!sortParam.equalsDefaultValue}">
                                            <c:param name="sort" value="${sortParam.value}"/>
                                        </c:if>
                                        <c:if test="${!dirParam.equalsDefaultValue}">
                                            <c:param name="dir" value="${dirParam.value}"/>
                                        </c:if>
                                        <c:if test="${!stateParam.equalsDefaultValue}">
                                            <c:param name="state" value="${stateParam.value}"/>
                                        </c:if>
                                    </c:url>
                                    <a class="dropdown-item" href="${modelUrl}">${model.modelName}</a>
                                </c:forEach>
                            </div>
                        </div>
                    </div>

                    <div class="col-md-3">
                        <div class="dropdown">
                            <label>Fuel Type: </label>
                            <button class="btn btn-white btn-block dropdown-toggle overflow-hidden" type="button"
                                    data-toggle="dropdown">
                                <span class="prefix">Fuel Type: </span>${fuelParam.value}
                            </button>
                            <div class="dropdown-menu">
                                <c:url var="fuelUrlAll" value="/our-cars">
                                    <c:if test="${!typeParam.equalsDefaultValue}">
                                        <c:param name="type" value="${typeParam.value}"/>
                                    </c:if>
                                    <c:if test="${!brandParam.equalsDefaultValue}">
                                        <c:param name="brand" value="${brandParam.value}"/>
                                    </c:if>
                                    <c:if test="${!modelParam.equalsDefaultValue}">
                                        <c:param name="model" value="${modelParam.value}"/>
                                    </c:if>
                                    <c:if test="${!sortParam.equalsDefaultValue}">
                                        <c:param name="sort" value="${sortParam.value}"/>
                                    </c:if>
                                    <c:if test="${!dirParam.equalsDefaultValue}">
                                        <c:param name="dir" value="${dirParam.value}"/>
                                    </c:if>
                                    <c:if test="${!stateParam.equalsDefaultValue}">
                                        <c:param name="state" value="${stateParam.value}"/>
                                    </c:if>
                                </c:url>
                                <a class="dropdown-item" href="${fuelUrlAll}">Show All</a>

                                <c:forEach items="${carFuel}" var="fuel">
                                    <c:url var="fuelUrl" value="/our-cars">
                                        <c:if test="${!typeParam.equalsDefaultValue}">
                                            <c:param name="type" value="${typeParam.value}"/>
                                        </c:if>
                                        <c:if test="${!brandParam.equalsDefaultValue}">
                                            <c:param name="brand" value="${brandParam.value}"/>
                                        </c:if>
                                        <c:if test="${!modelParam.equalsDefaultValue}">
                                            <c:param name="model" value="${modelParam.value}"/>
                                        </c:if>
                                        <c:param name="fuel" value="${fuel.fuelTypeName}"/>
                                        <c:if test="${!sortParam.equalsDefaultValue}">
                                            <c:param name="sort" value="${sortParam.value}"/>
                                        </c:if>
                                        <c:if test="${!dirParam.equalsDefaultValue}">
                                            <c:param name="dir" value="${dirParam.value}"/>
                                        </c:if>
                                        <c:if test="${!stateParam.equalsDefaultValue}">
                                            <c:param name="state" value="${stateParam.value}"/>
                                        </c:if>
                                    </c:url>
                                    <a class="dropdown-item" href="${fuelUrl}">${fuel.fuelTypeName}</a>
                                </c:forEach>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="row pt-5 ">
                    <div id="search-tabs" class="col-md-8">
                        <ul class="nav nav-tabs">
                            <li class="nav-item">
                                <c:url var="allUrl" value="/our-cars">
                                    <c:if test="${!typeParam.equalsDefaultValue}">
                                        <c:param name="type" value="${typeParam.value}"/>
                                    </c:if>
                                    <c:if test="${!brandParam.equalsDefaultValue}">
                                        <c:param name="brand" value="${brandParam.value}"/>
                                    </c:if>
                                    <c:if test="${!modelParam.equalsDefaultValue}">
                                        <c:param name="model" value="${modelParam.value}"/>
                                    </c:if>
                                    <c:if test="${!fuelParam.equalsDefaultValue}">
                                        <c:param name="fuel" value="${fuelParam.value}"/>
                                    </c:if>
                                    <c:if test="${!sortParam.equalsDefaultValue}">
                                        <c:param name="sort" value="${sortParam.value}"/>
                                    </c:if>
                                    <c:if test="${!dirParam.equalsDefaultValue}">
                                        <c:param name="dir" value="${dirParam.value}"/>
                                    </c:if>
                                    <c:if test="${!stateParam.defaultValue.equals('All')}">
                                        <c:param name="state" value="All"/>
                                    </c:if>
                                </c:url>
                                <a class="nav-link ${stateParam.value.toLowerCase().equals('all') ? 'active' : ''}"
                                   href="${allUrl}">All
                                    <span class="badge badge-success ml-1 d-none d-md-inline-flex ">${all_results}</span>
                                </a>
                            </li>
                            <li class="nav-item">
                                <c:url var="availableUrl" value="/our-cars">
                                    <c:if test="${!typeParam.equalsDefaultValue}">
                                        <c:param name="type" value="${typeParam.value}"/>
                                    </c:if>
                                    <c:if test="${!brandParam.equalsDefaultValue}">
                                        <c:param name="brand" value="${brandParam.value}"/>
                                    </c:if>
                                    <c:if test="${!modelParam.equalsDefaultValue}">
                                        <c:param name="model" value="${modelParam.value}"/>
                                    </c:if>
                                    <c:if test="${!fuelParam.equalsDefaultValue}">
                                        <c:param name="fuel" value="${fuelParam.value}"/>
                                    </c:if>
                                    <c:if test="${!sortParam.equalsDefaultValue}">
                                        <c:param name="sort" value="${sortParam.value}"/>
                                    </c:if>
                                    <c:if test="${!dirParam.equalsDefaultValue}">
                                        <c:param name="dir" value="${dirParam.value}"/>
                                    </c:if>
                                    <c:if test="${!stateParam.defaultValue.equals('Available')}">
                                        <c:param name="state" value="Available"/>
                                    </c:if>
                                </c:url>
                                <a class="nav-link ${stateParam.value.toLowerCase().equals('available') ? 'active' : ''}"
                                   href="${availableUrl}">Available
                                    <span class="badge badge-dark ml-1 d-none d-md-inline-flex ">${available}</span>
                                </a>
                            </li>
                            <li class="nav-item">
                                <c:url var="notAvailableUrl" value="/our-cars">
                                    <c:if test="${!typeParam.equalsDefaultValue}">
                                        <c:param name="type" value="${typeParam.value}"/>
                                    </c:if>
                                    <c:if test="${!brandParam.equalsDefaultValue}">
                                        <c:param name="brand" value="${brandParam.value}"/>
                                    </c:if>
                                    <c:if test="${!modelParam.equalsDefaultValue}">
                                        <c:param name="model" value="${modelParam.value}"/>
                                    </c:if>
                                    <c:if test="${!fuelParam.equalsDefaultValue}">
                                        <c:param name="fuel" value="${fuelParam.value}"/>
                                    </c:if>
                                    <c:if test="${!sortParam.equalsDefaultValue}">
                                        <c:param name="sort" value="${sortParam.value}"/>
                                    </c:if>
                                    <c:if test="${!dirParam.equalsDefaultValue}">
                                        <c:param name="dir" value="${dirParam.value}"/>
                                    </c:if>
                                    <c:if test="${!stateParam.defaultValue.equals('Disabled')}">
                                        <c:param name="state" value="Disabled"/>
                                    </c:if>
                                </c:url>
                                <a class="nav-link ${stateParam.value.toLowerCase().equals('disabled') ? 'active' : ''}"
                                   href="${notAvailableUrl}">Not Available
                                    <span class="badge badge-dark ml-1 d-none d-md-inline-flex ">${nonAvailable}</span>
                                </a>
                            </li>
                        </ul>
                    </div>

                    <div class="col-md-4">
                        <div class="dropdown">
                            <button class="btn btn-white btn-block btn-sm dropdown-toggle overflow-hidden" type="button"
                                    data-toggle="dropdown">
                                Sort by: ${dirParam.value=="asc" ? "Low" : "High"} ${sortParam.value}
                            </button>
                            <div class="dropdown-menu">
                                <c:url var="sortByPriceAscUrl" value="/our-cars">
                                    <c:if test="${!typeParam.equalsDefaultValue}">
                                        <c:param name="type" value="${typeParam.value}"/>
                                    </c:if>
                                    <c:if test="${!brandParam.equalsDefaultValue}">
                                        <c:param name="brand" value="${brandParam.value}"/>
                                    </c:if>
                                    <c:if test="${!modelParam.equalsDefaultValue}">
                                        <c:param name="model" value="${modelParam.value}"/>
                                    </c:if>
                                    <c:if test="${!fuelParam.equalsDefaultValue}">
                                        <c:param name="fuel" value="${fuelParam.value}"/>
                                    </c:if>
                                    <c:if test="${!sortParam.defaultValue.equals('price')}">
                                        <c:param name="sort" value="price"/>
                                    </c:if>
                                    <c:if test="${!dirParam.defaultValue.equals('asc')}">
                                        <c:param name="dir" value="asc"/>
                                    </c:if>
                                    <c:if test="${!stateParam.equalsDefaultValue}">
                                        <c:param name="state" value="${stateParam.value}"/>
                                    </c:if>
                                </c:url>
                                <c:url var="sortByPriceDescUrl" value="/our-cars">
                                    <c:if test="${!typeParam.equalsDefaultValue}">
                                        <c:param name="type" value="${typeParam.value}"/>
                                    </c:if>
                                    <c:if test="${!brandParam.equalsDefaultValue}">
                                        <c:param name="brand" value="${brandParam.value}"/>
                                    </c:if>
                                    <c:if test="${!modelParam.equalsDefaultValue}">
                                        <c:param name="model" value="${modelParam.value}"/>
                                    </c:if>
                                    <c:if test="${!fuelParam.equalsDefaultValue}">
                                        <c:param name="fuel" value="${fuelParam.value}"/>
                                    </c:if>
                                    <c:if test="${!sortParam.defaultValue.equals('price')}">
                                        <c:param name="sort" value="price"/>
                                    </c:if>
                                    <c:if test="${!dirParam.defaultValue.equals('desc')}">
                                        <c:param name="dir" value="desc"/>
                                    </c:if>
                                    <c:if test="${!stateParam.equalsDefaultValue}">
                                        <c:param name="state" value="${stateParam.value}"/>
                                    </c:if>
                                </c:url>
                                <a class="dropdown-item" href="${sortByPriceAscUrl}">Low price</a>
                                <a class="dropdown-item" href="${sortByPriceDescUrl}">High price</a>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
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
                                            <img src="${car.imageUrl}" alt=""
                                                 class="img-fluid">
                                        </div>
                                        <div class="col-md-8 col-lg-9 d-flex align-items-center py-3">
                                            <div class="container text-left">
                                                <div class="row pb-2 text-primary">
                                                    <div class="col-md-6 ">
                                                        <h5>${car.fullName}</h5>
                                                    </div>
                                                    <div class="col-md-6 text-right ">
                                                        <h6>${car.rentPrice} pln/day</h6>
                                                    </div>
                                                </div>

                                                <div class="row text-muted">
                                                    <div class="col-md-6 col-lg-4 my-2">
                                                        <b>Type:</b> ${car.type}
                                                    </div>
                                                    <div class="col-md-6 col-lg-4 my-2">
                                                        <b>Engine:</b> ${car.engine}
                                                    </div>
                                                    <div class="col-md-6 col-lg-4 my-2">
                                                        <b>Power:</b> ${car.horsePower} km
                                                    </div>
                                                    <div class="col-md-6 col-lg-4 my-2">
                                                        <b>Fuel Type:</b> ${car.fuelType}
                                                    </div>
                                                    <div class="col-md-6 col-lg-4 my-2">
                                                        <b>Color:</b> ${car.color}
                                                    </div>
                                                    <div class="col-md-6 col-lg-4 my-2">
                                                        <b>Status:</b> ${car.state}
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

        <!-- PAGINATION -->
        <section id="pagination" class="text-center py-3">
            <nav aria-label="pagination" class="${allPages==0 ? 'd-none' : ''}">
                <ul class="pagination mb-0 justify-content-center">

                    <c:url var="previousPageUrl" value="/our-cars">
                        <c:if test="${!typeParam.equalsDefaultValue}">
                            <c:param name="type" value="${typeParam.value}"/>
                        </c:if>
                        <c:if test="${!brandParam.equalsDefaultValue}">
                            <c:param name="brand" value="${brandParam.value}"/>
                        </c:if>
                        <c:if test="${!modelParam.equalsDefaultValue}">
                            <c:param name="model" value="${modelParam.value}"/>
                        </c:if>
                        <c:if test="${!fuelParam.equalsDefaultValue}">
                            <c:param name="fuel" value="${fuelParam.value}"/>
                        </c:if>
                        <c:if test="${!sortParam.equalsDefaultValue}">
                            <c:param name="sort" value="${sortParam.value}"/>
                        </c:if>
                        <c:if test="${!dirParam.equalsDefaultValue}">
                            <c:param name="dir" value="${dirParam.value}"/>
                        </c:if>
                        <c:if test="${!stateParam.equalsDefaultValue}">
                            <c:param name="state" value="${stateParam.value}"/>
                        </c:if>
                        <c:param name="page" value="${pageParam.value-1}"/>
                    </c:url>
                    <!--Arrow left-->
                    <li class="page-item d-sm-none ${pageParam.value.equals('1') ? 'disabled' : ''}">
                        <a class="page-link" aria-label="Previous" href="${previousPageUrl}">
                            <span aria-hidden="true">&laquo;</span>
                            <span class="sr-only">Previous</span>
                        </a>
                    </li>

                    <!--Numbers-->
                    <li class="page-item d-none d-sm-block ${pageParam.value.equals('1') ? 'disabled' : ''}"><a
                            class="page-link" href="${previousPageUrl}">Previous</a></li>

                    <c:forEach var="i" begin="1" end="${allPages}">
                        <c:url var="pageUrl" value="/our-cars">
                            <c:if test="${!typeParam.equalsDefaultValue}">
                                <c:param name="type" value="${typeParam.value}"/>
                            </c:if>
                            <c:if test="${!brandParam.equalsDefaultValue}">
                                <c:param name="brand" value="${brandParam.value}"/>
                            </c:if>
                            <c:if test="${!modelParam.equalsDefaultValue}">
                                <c:param name="model" value="${modelParam.value}"/>
                            </c:if>
                            <c:if test="${!fuelParam.equalsDefaultValue}">
                                <c:param name="fuel" value="${fuelParam.value}"/>
                            </c:if>
                            <c:if test="${!sortParam.equalsDefaultValue}">
                                <c:param name="sort" value="${sortParam.value}"/>
                            </c:if>
                            <c:if test="${!dirParam.equalsDefaultValue}">
                                <c:param name="dir" value="${dirParam.value}"/>
                            </c:if>
                            <c:if test="${!stateParam.equalsDefaultValue}">
                                <c:param name="state" value="${stateParam.value}"/>
                            </c:if>
                            <c:param name="page" value="${i}"/>
                        </c:url>
                        <li class="page-item ${pageParam.value.equals(i.toString()) ? 'active' : ''}">
                            <a class="page-link" href="${pageUrl}">${i}</a></li>
                    </c:forEach>
                    <li class="page-item disabled"><a class="page-link">...</a></li>
                    <c:url var="lastPageUrl" value="/our-cars">
                        <c:if test="${!typeParam.equalsDefaultValue}">
                            <c:param name="type" value="${typeParam.value}"/>
                        </c:if>
                        <c:if test="${!brandParam.equalsDefaultValue}">
                            <c:param name="brand" value="${brandParam.value}"/>
                        </c:if>
                        <c:if test="${!modelParam.equalsDefaultValue}">
                            <c:param name="model" value="${modelParam.value}"/>
                        </c:if>
                        <c:if test="${!fuelParam.equalsDefaultValue}">
                            <c:param name="fuel" value="${fuelParam.value}"/>
                        </c:if>
                        <c:if test="${!sortParam.equalsDefaultValue}">
                            <c:param name="sort" value="${sortParam.value}"/>
                        </c:if>
                        <c:if test="${!dirParam.equalsDefaultValue}">
                            <c:param name="dir" value="${dirParam.value}"/>
                        </c:if>
                        <c:if test="${!stateParam.equalsDefaultValue}">
                            <c:param name="state" value="${stateParam.value}"/>
                        </c:if>
                        <c:param name="page" value="${allPages}"/>
                    </c:url>
                    <li class="page-item ${pageParam.value.equals(allPages.toString()) ? 'disabled' : ''}"><a
                            class="page-link" href="${lastPageUrl}">${allPages}</a></li>

                    <c:url var="nextPageUrl" value="/our-cars">
                        <c:if test="${!typeParam.equalsDefaultValue}">
                            <c:param name="type" value="${typeParam.value}"/>
                        </c:if>
                        <c:if test="${!brandParam.equalsDefaultValue}">
                            <c:param name="brand" value="${brandParam.value}"/>
                        </c:if>
                        <c:if test="${!modelParam.equalsDefaultValue}">
                            <c:param name="model" value="${modelParam.value}"/>
                        </c:if>
                        <c:if test="${!fuelParam.equalsDefaultValue}">
                            <c:param name="fuel" value="${fuelParam.value}"/>
                        </c:if>
                        <c:if test="${!sortParam.equalsDefaultValue}">
                            <c:param name="sort" value="${sortParam.value}"/>
                        </c:if>
                        <c:if test="${!dirParam.equalsDefaultValue}">
                            <c:param name="dir" value="${dirParam.value}"/>
                        </c:if>
                        <c:if test="${!stateParam.equalsDefaultValue}">
                            <c:param name="state" value="${stateParam.value}"/>
                        </c:if>
                        <c:param name="page" value="${pageParam.value+1}"/>
                    </c:url>
                    <li class="page-item d-none d-sm-block ${pageParam.value.equals(allPages.toString()) ? 'disabled' : ''}">
                        <a class="page-link" href="${nextPageUrl}">Next</a></li>

                    <!--Arrow right-->
                    <li class="page-item d-sm-none ${pageParam.value.equals(allPages.toString()) ? 'disabled' : ''}">
                        <a class="page-link" aria-label="Next" href="${nextPageUrl}">
                            <span aria-hidden="true">&raquo;</span>
                            <span class="sr-only">Next</span>
                        </a>
                    </li>

                </ul>
            </nav>
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

            // Init tooltips
            $('[data-toggle="tooltip"]').tooltip();
        </script>
    </body>

</html>