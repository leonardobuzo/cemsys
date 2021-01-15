<%-- 
    Document   : listar-lote
    Created on : 17/12/2020, 20:11:01
    Author     : Leonardo
--%>

<%-- 
    Document   : listar-funcionario
    Created on : 17/12/2020, 20:10:29
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
                    <!--<li class="nav-item"><a class="nav-link js-scroll-trigger text-dark" href="#home">Home</a></li>
                    <li class="nav-item"><a class="nav-link js-scroll-trigger" href="#portfolio">Portfolio</a></li>
                    <li class="nav-item"><a class="nav-link js-scroll-trigger" href="#about">About</a></li>
                    <li class="nav-item"><a class="nav-link js-scroll-trigger" href="#team">Team</a></li>-->
                    <li class="nav-item"><a class="nav-link js-scroll-trigger text-dark" href="index.jsp">Página de Visitantes</a></li>
                    <li class="nav-item"><a class="nav-link js-scroll-trigger text-dark" href="index.jsp">Contato com suporte</a></li>
                </ul>
            </div>
        </div>
    </nav>
    <body>
        <section>
            <div class="text-center">
                <h2 class="section-heading text-uppercase">Gerenciamento de Lotes</h2>
                <h5 class="section-subheading">Utilize o campo abaixo para pesquisar os cadastros.</h5>
            </div></br>
            <div class="row justify-content-center pt-0 mb-5 pb-1">
                <div class="row justify-content-center pt-0 mb-8 pb-1">
                    <form action="ListarCliente" method="POST">
                        <select name="tipo">
                            <option value="codigo">CÓDIGO</option>
                            <option value="nome">DESCRICAO</option>
                        </select>
                        <input class="text-uppercase" type="text" size="30" name="pesquisa"/>
                        <input type="submit" value="Pesquisar"/> 
                    </form>
                </div>
                <h3>${msg}</h3>
                    <c:if test="${!empty lote}">
                        <table border="1" class="table table-dark mr-1 ml-1">
                            <tr>
                                <th>Id</th>
                                <th>Descrição</th>
                            </tr>
                            <c:forEach items="${lote}" var="lote">
                                <tr>
                                    <td>${setor.id}</td>
                                    <td>${setor.descricaoLote}</td>
                                    <td><a class="btn btn-primary py-3 px-4" href="CarregarLote?id=${lote.id}">
                                            Alterar</a></td>
                                    <td>
                                        <a class="btn btn-primary py-3 px-4" onclick="if (confirm('Confirma a exclusão?')) {
                                                    window.location.href = `ExcluirLote?id=${lote.id}`
                                                }">Excluir</a>
                                    </td>

                                </tr>
                            </c:forEach>
                        </table>
                    </c:if>
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
                    <div class="col-lg-4 text-lg-right text-light">
                        <div class="mr-3">Todos os direitos reservados - 2020</div>
                    </div>
                </div>
            </div>
        </footer>
        <!-- Portfolio Modals-->
        <!-- Modal 1-->
        <div class="portfolio-modal modal fade" id="portfolioModal1" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="close-modal" data-dismiss="modal"><img src="bootstrap/assets/img/close-icon.svg" alt="Close modal" /></div>
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-lg-8">
                                <div class="modal-body">
                                    <!-- Project Details Go Here-->
                                    <h2 class="text-uppercase">Project Name</h2>
                                    <p class="item-intro text-muted">Lorem ipsum dolor sit amet consectetur.</p>
                                    <img class="img-fluid d-block mx-auto" src="bootstrap/assets/img/portfolio/01-full.jpg" alt="" />
                                    <p>Use this area to describe your project. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Est blanditiis dolorem culpa incidunt minus dignissimos deserunt repellat aperiam quasi sunt officia expedita beatae cupiditate, maiores repudiandae, nostrum, reiciendis facere nemo!</p>
                                    <ul class="list-inline">
                                        <li>Date: January 2020</li>
                                        <li>Client: Threads</li>
                                        <li>Category: Illustration</li>
                                    </ul>
                                    <button class="btn btn-primary" data-dismiss="modal" type="button">
                                        <i class="fas fa-times mr-1"></i>
                                        Close Project
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
    <!-- Bootstrap core JS-->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.bundle.min.js"></script>
    <!-- Third party plugin JS-->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>
    <!-- Contact form JS-->
    <script src="bootstrap/assets/mail/jqBootstrapValidation.js"></script>
    <script src="bootstrap/assets/mail/contact_me.js"></script>
    <!-- Core theme JS-->
    <script src="bootstrap/js/scripts.js"></script>

</html>


