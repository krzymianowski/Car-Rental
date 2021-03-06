<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
        <link rel="stylesheet" href="../css/about-us.css">

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
                            <a href="../about-us" class="nav-link active">About Us</a>
                        </li>
                        <li class="nav-item">
                            <a href="../contact" class="nav-link">Contact</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

        <!-- PAGE HEADER -->
        <header id="page-header">
            <div class="primary-overlay">
                <div class="container py-5 h-100">
                    <div class="row">
                        <div class="col-md-6 m-auto text-center">
                            <h1>About us</h1>
                            <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Quas, temporibus?</p>
                        </div>
                    </div>
                </div>
            </div>
        </header>

        <!-- ABOUT US SECTION -->
        <section id="about-us" class="py-3">
            <div class="container">
                <div class="row my-5 mx-3">
                    <div class="col">
                        <h1>What We Do</h1>
                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Quos, fuga eaque. Amet, assumenda
                            aliquid tempore dolorum
                            error eveniet doloribus sed repellat quod, dolores fuga ipsam soluta. Aliquam accusantium
                            pariatur aut sint deleniti
                            laborum ducimus voluptatem? Architecto cumque quod suscipit officiis soluta, voluptate dicta
                            blanditiis similique
                            praesentium temporibus adipisci debitis labore!</p>
                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Quos, fuga eaque. Amet, assumenda
                            aliquid tempore dolorum
                            error eveniet doloribus sed repellat quod, dolores fuga ipsam soluta. Aliquam accusantium
                            pariatur aut sint deleniti
                            laborum ducimus voluptatem? Architecto cumque quod suscipit officiis soluta, voluptate dicta
                            blanditiis similique
                            praesentium temporibus adipisci debitis labore!</p>
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

        <script>
            // Get the current year for the copyright
            $('#year').text(new Date().getFullYear());
        </script>
    </body>

</html>