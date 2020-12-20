<%-- 
    Document   : menu
    Created on : 08/11/2020, 13:04:05
    Author     : Leonardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Cemsys</title>
        <link rel="icon" type="image/x-icon" href="bootstrap/assets/img/favicon.ico" />
        <!-- Font Awesome icons (free version)-->
        <script src="https://use.fontawesome.com/releases/v5.13.0/js/all.js" crossorigin="anonymous"></script>
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css" />
        <link href="https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic" rel="stylesheet" type="text/css" />
        <link href="https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700" rel="stylesheet" type="text/css" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="bootstrap/css/styles.css" rel="stylesheet" />
    </head>
    <body id="page-top">
        <!-- Navigation-->
        <nav class="navbar navbar-expand-lg navbar-dark fixed-top" id="mainNav">
            <div class="container">
                <a class="navbar-brand js-scroll-trigger" href="#page-top"><!--<img width="200" height="300" class="d-inline-block align-top" src="bootstrap/assets/img/logos/cemsys.png" alt="" />-->CEMSYS</a>
                <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                    Menu
                    <i class="fas fa-bars ml-1"></i>
                </button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav text-uppercase ml-auto">
                        <li class="nav-item"><a class="nav-link js-scroll-trigger" href="#home">Home</a></li>
                        <!--<li class="nav-item"><a class="nav-link js-scroll-trigger" href="#portfolio">Portfolio</a></li>
                        <li class="nav-item"><a class="nav-link js-scroll-trigger" href="#about">About</a></li>
                        <li class="nav-item"><a class="nav-link js-scroll-trigger" href="#team">Team</a></li>-->
                    </ul>
                </div>
            </div>
        </nav>
        <header class="masthead" id="home">
            <div class="container">                
                <div class="masthead-subheading">Seja bem-vindo NOMEFUNCIONARIO!</br></br>
                </div>
            </div>
        </header>
        <!-- Portfolio Grid-->
        <section class="page-section bg-light" id="portfolio">
            <div class="container">
                <div class="text-center">
                    <h2 class="section-heading text-uppercase">Menu Principal</h2>
                    <h3 class="section-subheading text-muted">Neste menu você pode efetuar cadastros e configurar seu Cemsys.</h3>
                </div>
                <div class="row">
                    <div class="col-lg-4 col-sm-6 mb-4 mb-sm-0">
                        <div class="portfolio-item">
                            <div class="portfolio-caption">
                                <div class="portfolio-caption-heading">Falecidos</div>
                                <div class="portfolio-caption-subheading text-muted">Cadastrar e consultar falecidos</div></br>
                                <a class="portfolio-link btn btn-dark" href="cadastrar-falecido.jsp">Cadastrar</a></br>
                                    <a class="portfolio-link btn btn-dark" href="listar-falecido.jsp">Gerenciar</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-sm-6 mb-4 mb-sm-0">
                        <div class="portfolio-item">
                            <div class="portfolio-caption">
                                <div class="portfolio-caption-heading">Setores</div>
                                <div class="portfolio-caption-subheading text-muted">Cadastrar e consultar setores</div></br>
                                    <a class="portfolio-link btn btn-dark" href="cadastrar-setor.jsp">Cadastrar</a></br>
                                    <a class="portfolio-link btn btn-dark" href="listar-setor.jsp">Gerenciar</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-sm-6 mb-4 mb-sm-0">
                        <div class="portfolio-item">
                            <div class="portfolio-caption">
                                <div class="portfolio-caption-heading">Quadras</div>
                                <div class="portfolio-caption-subheading text-muted">Cadastrar e consultar quadras</div></br>
                                    <a class="portfolio-link btn btn-dark" href="cadastrar-quadra.jsp">Cadastrar</a></br>
                                    <a class="portfolio-link btn btn-dark" href="listar-quadra.jsp">Gerenciar</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-sm-6 mb-4 mb-sm-0">
                        <div class="portfolio-item">
                            <div class="portfolio-caption">
                                <div class="portfolio-caption-heading">Lotes</div>
                                <div class="portfolio-caption-subheading text-muted">Cadastrar e consultar lotes</div></br>
                                    <a class="portfolio-link btn btn-dark" href="cadastrar-lote.jsp">Cadastrar</a></br>
                                    <a class="portfolio-link btn btn-dark" href="listar-lote.jsp">Gerenciar</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Footer-->
        <footer class="footer py-4 bg-dark">
            <div class="container">
                <div class="row align-items-center">
                    <div class="col-lg-4 text-lg-left text-light">Copyright© Erivelton Rossini - Leonardo Buzo</div>
                    <div class="col-lg-4 my-3 my-lg-0">
                        <a class="btn btn-dark btn-social mx-2" href="#!"><i class="fab fa-twitter"></i></a>
                        <a class="btn btn-dark btn-social mx-2" href="#!"><i class="fab fa-facebook-f"></i></a>
                        <a class="btn btn-dark btn-social mx-2" href="#!"><i class="fab fa-linkedin-in"></i></a>
                    </div>
                    <div class="col-lg-4 text-lg-right">
                        <div class="mr-3 text-light">Todos os direitos reservados - 2020</div>
                    </div>
                </div>
            </div>
        </footer>
    </body>
</html>
