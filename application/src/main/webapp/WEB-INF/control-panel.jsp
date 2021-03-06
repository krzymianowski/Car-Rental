<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
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
        <link rel="stylesheet" href="../css/admin-panel.css">

        <title>Car rental - Control Panel</title>
    </head>

    <body>
        <div class="d-flex">
            <div id="collapse-menu" class="collapse show">
                <div class="menu sticky-top">
                    <div class="menu-header pl-4 pr-2 py-2 d-flex justify-content-center align-items-center text-white">
                        <i class="fas fa-cogs" style="font-size: 1.2rem;"></i>
                        <div class="w-100 px-3 d-flex flex-column">
                            <h5 class="m-0">CAR RENTAL</h5>
                            <p class="m-0 d-flex align-items-top">ADMIN PANEL</p>
                        </div>
                        <button id="toggle-menu-1" class="btn text-white" data-toggle="collapse"
                                data-target="#collapse-menu" aria-expanded="true"
                                aria-controls="collapse-menu">
                            <i class="fas fa-arrow-alt-circle-left"></i>
                        </button>
                    </div>

                    <div class="scroll" dir="rtl">

                        <!-- USER INFO -->
                        <section id="user-info" dir="ltr">
                            <div class="primary-overlay">
                                <div class="container h-100">
                                    <div class="d-flex h-100">
                                        <div class="d-flex py-4 px-1">
                                            <div class="fill ml-auto">
                                                <img src="../img/temp-person.jpg" alt=""
                                                     class="img-fluid rounded-circle">
                                            </div>
                                        </div>
                                        <div class="w-100 pl-1 mt-4 d-flex flex-column">
                                            <b class="username pt-2">Tomasz Krzymianowski</b>
                                            <p><security:authentication property="principal.authorities"/></p>
                                            <form:form action="/logout" method="POST" class="d-flex mt-auto">
                                                <button type="submit" class="btn ml-auto text-white bg-none">
                                                    <i class="fas fa-sign-out-alt"></i>
                                                </button>
                                            </form:form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </section>

                        <!-- NAVBAR -->
                        <section id="menu-items" dir="ltr">
                            <nav class="navbar text-white p-0 mt-2">
                                <ul class="navbar-nav d-flex flex-column w-100 p-0">
                                    <a href="/control-panel" class="active">
                                        <li class="nav-item py-2 px-4">
                                            <i class="fas fa-home pr-3"></i>Home
                                        </li>
                                    </a>

                                    <a href="#">
                                        <li class="nav-item py-2 px-4">
                                            <i class="fas fa-chart-line pr-3"></i>Dashboard
                                        </li>
                                    </a>

                                    <li class="nav-item py-2 px-4 d-flex align-items-center collapsed"
                                        data-toggle="collapse" data-target="#messages-colapse-body"
                                        aria-expanded="true" aria-controls="messages-colapse-body">
                                        <i class="fas fa-envelope pr-3"></i>Messages and alerts<i
                                            class="fas fa-caret-down ml-auto"></i><i
                                            class="fas fa-caret-up ml-auto"></i>
                                    </li>
                                    <li id="messages-colapse-body" class=" py-0 collapse">
                                        <ul class="navbar-nav d-flex flex-column w-100">
                                            <li class="nav-item py-2 pr-2 pl-5">
                                                <i class="fas fa-envelope pr-3"></i>Inbox
                                            </li>
                                            <li class="nav-item py-2 pr-2 pl-5">
                                                <i class="fas fa-envelope-open-text pr-3"></i>Outbox
                                            </li>
                                            <li class="nav-item py-2 pr-2 pl-5">
                                                <i class="fas fa-external-link-alt pr-3"></i>New message
                                            </li>
                                        </ul>
                                    </li>

                                    <li class="nav-item py-2 px-4 d-flex align-items-center collapsed"
                                        data-toggle="collapse" data-target="#users-colapse-body"
                                        aria-expanded="true" aria-controls="users-colapse-body">
                                        <i class="fas fa-users pr-3"></i>Users<i
                                            class="fas fa-caret-down ml-auto"></i><i
                                            class="fas fa-caret-up ml-auto"></i>
                                    </li>
                                    <li id="users-colapse-body" class=" py-0 collapse">
                                        <ul class="navbar-nav d-flex flex-column w-100 ">
                                            <li class="nav-item py-2 pr-2 pl-5">
                                                <i class="fas fa-users-cog pr-3"></i>Manage users
                                            </li>
                                            <li class="nav-item py-2 pr-2 pl-5">
                                                <i class="fas fa-user-plus pr-3"></i>Add new user
                                            </li>
                                        </ul>
                                    </li>

                                    <li class="nav-item py-2 px-4 d-flex align-items-center collapsed"
                                        data-toggle="collapse" data-target="#cars-colapse-body"
                                        aria-expanded="true" aria-controls="cars-colapse-body">
                                        <i class="fas fa-car pr-3"></i>Cars<i class="fas fa-caret-down ml-auto"></i><i
                                            class="fas fa-caret-up ml-auto"></i>
                                    </li>
                                    <li id="cars-colapse-body" class=" py-0 collapse">
                                        <ul class="navbar-nav d-flex flex-column w-100">
                                            <li class="nav-item py-2 pr-2 pl-5">
                                                <i class="fas fa-car pr-3"></i>Manage cars
                                            </li>
                                            <a href="/control-panel/add-car">
                                                <li class="nav-item py-2 pr-2 pl-5">
                                                    <i class="fas fa-car pr-3"></i>Add new car
                                                </li>
                                            </a>
                                        </ul>
                                    </li>

                                    <li class="nav-item py-2 px-4 d-flex align-items-center collapsed"
                                        data-toggle="collapse" data-target="#website-content-colapse-body"
                                        aria-expanded="true" aria-controls="website-content-colapse-body">
                                        <i class="fas fa-file-invoice pr-3"></i>Website content<i
                                            class="fas fa-caret-down ml-auto"></i><i
                                            class="fas fa-caret-up ml-auto"></i>
                                    </li>
                                    <li id="website-content-colapse-body" class=" py-0 collapse">
                                        <ul class="navbar-nav d-flex flex-column w-100">
                                            <li class="nav-item py-2 pr-2 pl-5">
                                                <i class="far fa-file pr-3"></i>Home page
                                            </li>
                                            <li class="nav-item py-2 pr-2 pl-5">
                                                <i class="far fa-file pr-3"></i>About us
                                            </li>
                                            <li class="nav-item py-2 pr-2 pl-5">
                                                <i class="far fa-file pr-3"></i>Contact
                                            </li>
                                        </ul>
                                    </li>

                                    <li class="nav-item py-2 px-4 d-flex align-items-center collapsed"
                                        data-toggle="collapse" data-target="#newsletter-colapse-body"
                                        aria-expanded="true" aria-controls="newsletter-colapse-body">
                                        <i class="fas fa-mail-bulk pr-3"></i>Newsletter<i
                                            class="fas fa-caret-down ml-auto"></i><i
                                            class="fas fa-caret-up ml-auto"></i>
                                    </li>
                                    <li id="newsletter-colapse-body" class=" py-0 collapse">
                                        <ul class="navbar-nav d-flex flex-column w-100">
                                            <li class="nav-item py-2 pr-2 pl-5">
                                                <i class="fas fa-external-link-alt pr-3"></i>Send new
                                            </li>
                                            <li class="nav-item py-2 pr-2 pl-5">
                                                <i class="fas fa-users pr-3"></i>Subscribers
                                            </li>
                                            <li class="nav-item py-2 pr-2 pl-5">
                                                <i class="fas fa-history pr-3"></i>History
                                            </li>
                                        </ul>
                                    </li>

                                    <a href="#">
                                        <li class="nav-item py-2 px-4">
                                            <i class="fas fa-code pr-3"></i>Log
                                        </li>
                                    </a>

                                </ul>
                            </nav>
                        </section>


                    </div>

                </div>
            </div>

            <!-- INFO BAR -->
            <div id="info-bar" class="w-100 m-0 p-0">
                <div class="nav sticky-top p-2 d-flex justify-content-center align-items-center">
                    <div class="w-100">
                        <div class="d-flex row-hl">
                            <button id="toggle-menu-2" class="item-hl btn" data-toggle="collapse"
                                    data-target="#collapse-menu" aria-expanded="true" aria-controls="collapse-menu">
                                <i class="fas fa-arrow-alt-circle-right"></i>
                            </button>
                            <div class="p-2 item-hl ml-auto">
                                <h6>Home - Last news and notifications</h6>
                            </div>
                            <a href="#" class="p-2 item-hl ml-auto d-flex align-items-center">
                                <i class="fas fa-envelope"></i>
                            </a>
                            <a href="#" class="p-2 item-hl d-flex align-items-center">
                                <i class="fas fa-bell"></i>
                            </a>
                            <a href="#" class="p-2 item-hl d-flex align-items-center">
                                <i class="fas fa-sign-out-alt"></i>
                            </a>
                        </div>

                    </div>
                </div>

                <!-- CONTENT HERE -->
                <section id="content">
                    <div class="container my-3">

                        <!-- SAMPLE NOTIFICATION -->
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title">Welcome in control panel!</h4>
                                <p class="card-text">Lorem ipsum dolor sit amet consectetur, adipisicing elit. Similique
                                    sequi voluptatem sint
                                    veritatis corporis enim, autem quae reprehenderit pariatur illo non nisi est quod
                                    quasi unde sunt magnam
                                    quo. Dignissimos recusandae excepturi dicta provident nostrum minus, necessitatibus
                                    omnis molestiae ducimus
                                    doloremque reiciendis optio? Corrupti, quo molestias porro consequuntur, veritatis
                                    neque magnam deleniti
                                    rerum in, quis quibusdam fugiat nemo! Quam minima in consectetur. Dicta sit quasi
                                    laudantium nemo, quae veniam,
                                    eaque neque eos provident, dolores culpa exercitationem aperiam in similique
                                    nesciunt! Minima, atque dolor
                                    id nulla iure recusandae, numquam, aperiam placeat in labore ducimus quidem
                                    reiciendis ea deserunt. Ipsam,
                                    facilis tempore?</p>
                            </div>
                            <div class="card-footer text-muted text-right">
                                2 Days Ago
                            </div>
                        </div>

                    </div>
                </section>
            </div>
        </div>


        <script src="../js/jquery-3.3.1.min.js"></script>
        <script src="../js/popper.min.js"></script>
        <script src="../js/bootstrap.min.js"></script>

        <script>
            // Hide menu on small screens
            $(document).ready(function () {
                if (($(window).width() <= 575.98)) {
                    $('#collapse-menu').removeClass('show');
                    $('#toggle-menu-2').show();
                } else {
                    $('#toggle-menu-2').hide();
                }
            });

            // Buttons hiding script
            $("#toggle-menu-2").click(function () {
                $('#toggle-menu-2').hide();
            });
            $("#toggle-menu-1").click(function () {
                $('#toggle-menu-2').show();
            });
        </script>
    </body>

</html>