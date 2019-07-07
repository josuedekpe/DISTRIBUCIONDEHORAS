<%-- 
    Document   : index
    Created on : 27/04/2019, 10:58:41 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CDH QUISPICANCHI</title>     
        <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/css/materialize.min.css'>
        <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/font/material-design-icons/Material-Design-Icons.woff'>
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/modal.css">
        <link rel="stylesheet" href="css/modall.css">
        <!-- Remember to include jQuery :) -->
        <script src="js/jquery3.4.1.min.js"></script>
    </head>

    <body>

    <head>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <script>
            $(document).ready(function () {
                $("#m1").click(function () {
                    alert('holaaaaaaaaaa');
                    $("#m2").modal();
                });
                $("#m3").click(function () {
                    alert('holaaaaaaaaaa');
                    $("#modal1").modal();
                });
            });

        </script>
        <script>
                      function submitContactForm() {
                        var Apaterno=$('#Apaterno').val();
                        var Amaterno = $('#Amaterno').val();
                        var Nombres = $('#Nombres').val();
                        var DNI = $('#DNI').val();
                        var CodigoModular = $('#CodigoModular').val();
                        var Fecha_Nac = $('#Fecha_Nac').val();
                        var Fecha_Ingreso = $('#Fecha_Ingreso').val();
                        var Telefono = $('#Telefono').val();
                        var Correo = $('#Correo').val();
                        var Telefono = $('#Telefono').val();
                        var EscalaMagisterial = $('#EscalaMagisterial').val();
                        var Cargo = $('#Cargo').val();
                        
                        if (name.trim() == '') {
                            alert('Please enter your name.');
                            $('#inputName').focus();
                            return false;
                        } else if (email.trim() == '') {
                            alert('Please enter your email.');
                            $('#inputEmail').focus();
                            return false;
                        } else if (email.trim() != '' && !reg.test(email)) {
                            alert('Please enter valid email.');
                            $('#inputEmail').focus();
                            return false;
                        } else if (message.trim() == '') {
                            alert('Please enter your message.');
                            $('#inputMessage').focus();
                            return false;
                        } else {
                            $.ajax({
                                type: 'POST',
                                url : '/SDocente',
                                data: 'InsertarDocente=1&=' + Apaterno + '&email=' + Amaterno + '&message=' + message,
                                beforeSend: function () {
                                    $('.submitBtn').attr("disabled", "disabled");
                                    $('.modal-body').css('opacity', '.5');
                                },
                                success: function (msg) {
                                    if (msg == 'ok') {
                                        $('#inputName').val('');
                                        $('#inputEmail').val('');
                                        $('#inputMessage').val('');
                                                $('.statusMsg').html('<span style="color:green;">Thanks for contacting us, we'll get back to you soon. < /p>');
                                    } else {
                                        $('.statusMsg').html('<span style="color:red;">Some problem occurred, please try again.</span>');
                                    }
                                    $('.submitBtn').removeAttr("disabled");
                                    $('.modal-body').css('opacity', '');
                                }
                            });
                        }
                    }
    </script>
</head>

<body>

    <!-- Modal Structure -->
    <div id="modal3" class="modal">
        <div class="modal-content">
            <h4>Modal Header</h4>
            <p>A bunch of text</p>
        </div>
        <div class="modal-footer">
            <a href="#!" class="modal-close waves-effect waves-green btn-flat">Agree</a>
        </div>
    </div>


    <ul id="slide-out" class="side-nav fixed z-depth-2">
        <li class="center no-padding">
            <div class="indigo darken-2 white-text" style="height: 180px;">
                <div class="row">
                    <img style="margin-top: 5%;" width="100" height="100" src="https://res.cloudinary.com/dacg0wegv/image/upload/t_media_lib_thumb/v1463990208/photo_dkkrxc.png" class="circle responsive-img" />

                    <p style="margin-top: -13%;">
                        Tirth Patel
                    </p>
                </div>
            </div>
        </li>

        <li id="dash_dashboard"><a class="waves-effect" href="#!"><b>Inicio</b></a></li>

        <ul class="collapsible" data-collapsible="accordion">
            <li id="dash_users">
                <div id="dash_users_header" class="collapsible-header waves-effect"><b>Mantenimiento</b></div>
                <div id="dash_users_body" class="collapsible-body">
                    <ul>
                        <li id="users_seller">
                            <a class="waves-effect" style="text-decoration: none;" href="#!">Usuario</a>
                        </li>

                        <li id="users_customer">
                            <a class="waves-effect" style="text-decoration: none;" href="#!">Docente</a>
                        </li>
                        <li id="users_customer">
                            <a class="waves-effect" style="text-decoration: none;" href="#!">Institucion Educativa</a>
                        </li>

                    </ul>
                </div>
            </li>

            <li id="dash_products">
                <div id="dash_products_header" class="collapsible-header waves-effect"><b>Administrar</b></div>
                <div id="dash_products_body" class="collapsible-body">
                    <ul>
                        <li id="products_product">
                            <a class="waves-effect" style="text-decoration: none;" href="#!">Carga Horaria</a>
                            <a class="waves-effect" style="text-decoration: none;" href="#!">Plan de Estudio</a>
                            <a class="waves-effect" style="text-decoration: none;" href="#!">Plazas</a>
                        </li>
                    </ul>
                </div>
            </li>

            <li id="dash_categories">
                <div id="dash_categories_header" class="collapsible-header waves-effect"><b>Principal</b></div>
                <div id="dash_categories_body" class="collapsible-body">
                    <ul>
                        <li id="categories_category">
                            <a class="waves-effect" style="text-decoration: none;" href="#!">CDH</a>
                        </li>
                    </ul>
                </div>
            </li>

            <li id="dash_brands">
                <div id="dash_brands_header" class="collapsible-header waves-effect"><b>Reportes</b></div>
                <div id="dash_brands_body" class="collapsible-body">
                    <ul>
                        <li id="brands_brand">
                            <a class="waves-effect" style="text-decoration: none;" href="#!">CD Horas</a>
                        </li>

                        <li id="brands_sub_brand">
                            <a class="waves-effect" style="text-decoration: none;" href="#!">Plan de Estudios</a>
                        </li<li id="brands_sub_brand">
                            <a class="waves-effect" style="text-decoration: none;" href="#!">Carga Horaria</a>
                        </li>
                    </li<li id="brands_sub_brand">
                    <a class="waves-effect" style="text-decoration: none;" href="#!">Actas de Adjudicacion</a>
                </li>

            </ul>
        </div>
    </li>
</ul>
</ul>

<header>
    <ul class="dropdown-content" id="user_dropdown">
        <li><a class="indigo-text" href="#!">Usuario</a></li>
        <li><a class="indigo-text" href="#!">Salir</a></li>
    </ul>

    <nav class="indigo" role="navigation">
        <div class="nav-wrapper">
            <a data-activates="slide-out" class="button-collapse show-on-" href="#!"><img style="margin-top: 17px; margin-left: 5px;" src="https://res.cloudinary.com/dacg0wegv/image/upload/t_media_lib_thumb/v1463989873/smaller-main-logo_3_bm40iv.gif" /></a>

            <ul class="right hide-on-med-and-down">
                <li>
                    <a class='right dropdown-button' href='' data-activates='user_dropdown'><i class=' material-icons'>account_circle</i></a>
                </li>
            </ul>

            <a href="#" data-activates="slide-out" class="button-collapse"><i class="mdi-navigation-menu"></i></a>
        </div>
    </nav>

    <nav>
        <div class="nav-wrapper indigo darken-2">
            <a style="margin-left: 20px;" class="breadcrumb" href="#!">Inicio</a>
            <a class="breadcrumb" href="#!">Index</a>

            <div style="margin-right: 20px;" id="timestamp" class="right"></div>
        </div>
    </nav>
</header>




<main>



    <div class="row">
        <div class="col s12">

            <div class="row section">



                <!-- Modal Structure -->
                <div id="modal1" class="modal">
                    <div class="modal-content">
                        <h4>Ingrese los datos del docente</h4>
                        <div class="row">
                            <form class="col s12">
                                <div class="row">
                                    <div class="input-field col s12 m4">
                                        <i class="material-icons prefix">account_box  </i>
                                        <input id="icon_prefix" type="text" id="Nombres" name="Nombres" class="validate">
                                        <label for="icon_prefix">Nombres</label>
                                    </div>
                                    <div class="input-field col s12 m4">
                                        <i class="material-icons prefix">group</i>
                                        <input id="icon_telephone" type="tel" id="Apaterno" name="Apaterno" class="validate">
                                        <label for="icon_telephone">Apellido Paterno </label>
                                    </div>
                                    <div class="input-field col s12 m4">
                                        <i class="material-icons prefix">group</i>
                                        <input id="icon_prefix" type="text" id="Amaterno" name="Amaterno" class="validate">
                                        <label for="icon_prefix">Apellido Materno</label>
                                    </div>
                                    <div class="input-field col s12 m6">
                                        <i class="material-icons prefix">comment</i>
                                        <input id="icon_telephone" type="text" id="DNI" name="DNI" class="validate" data-length="8">
                                        <label for="icon_telephone">DNI</label>
                                    </div>

                                    <div class="input-field col s12 m6">
                                        <i class="material-icons prefix">comment</i>
                                        <input id="icon_telephone" type="text"id="CodigoModular" Name="CodigoModular" class="validate">
                                        <label for="icon_telephone">Codigo Modular</label>
                                    </div>
                                    <script>
                                                $(function () {
                                                    $('.datepicker').pickadate({
                                                        monthsFull: ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'],
                                                        monthsShort: ['Ene', 'Feb', 'Mar', 'Abr', 'May', 'Jun', 'Jul', 'Ago', 'Sep', 'Oct', 'Nov', 'Dic'],
                                                        weekdaysFull: ['Domingo', 'Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado'],
                                                        weekdaysShort: ['Dom', 'Lun', 'Mar', 'Mié', 'Jue', 'Vie', 'Sáb'],
                                                        selectMonths: true,
                                                        selectYears: 100, // Puedes cambiarlo para mostrar más o menos años
                                                        today: 'Hoy',
                                                        clear: 'Limpiar',
                                                        close: 'Ok',
                                                        labelMonthNext: 'Siguiente mes',
                                                        labelMonthPrev: 'Mes anterior',
                                                        labelMonthSelect: 'Selecciona un mes',
                                                        labelYearSelect: 'Selecciona un año'
                                                    });
                                                });
                                    </script>
                                    <div class="input-field col s12 m4">
                                        <input type="date" id="fecha" id="Fecha_Nac" name="Fecha_Nac" class="datepicker">

                                    </div>
                                    <div class="input-field col s12 m4">
                                        <input type="date" id="Fecha_Ingreso" name="Fecha_Ingreso" class="datepicker">

                                    </div>
                                    <div class="input-field col s12 m4">
                                        <i class="material-icons prefix">phone</i>
                                        <input id="icon_telephone" type="text" id="Telefono" name="Telefono" class="validate">
                                        <label for="icon_telephone">Telefono</label>
                                    </div>
                                    <div class="input-field col s12 m6">
                                        <i class="material-icons prefix">email</i>
                                        <input id="icon_telephone" type="text" id="Correo" name="Correo" class="validate">
                                        <label for="icon_telephone">Correo</label>
                                    </div>
                                    <div class="input-field col s12 m6">
                                        <select id="EscalaMagisterial" name="EscalaMagisterial">
                                            <option value="0" disabled selected>Seleccione su opcion</option>
                                            <option value="1">Escala 1</option>
                                            <option value="2">Escala 2</option>
                                            <option value="3">Escala 3</option>
                                            <option value="2">Escala 4</option>
                                            <option value="3">Escala 5</option>
                                        </select>
                                        <label>Escala Magisterial</label>
                                    </div>
                                    <div class="input-field col s12 m6">
                                        <select id="Cargo" name="Cargo">
                                            <option value="0" disabled selected>Seleccione su opcion</option>
                                            <option value="1">Docente</option>
                                            <option value="2">Director</option>
                                            <option value="3">Otro</option>
                                        </select>
                                        <label>Cargo</label>
                                    </div>

                                </div>
                            </form>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <a href="#" class="modal-close btn waves-effect waves-green red">Agree</a>
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary submitBtn" onclick="submitContactForm()">SUBMIT</button>
                    </div>
                </div>


            </div>

            <div class="col s12">
                <div style="padding: 35px;" align="center" class="card">
                    <div class="row">
                        <!-- Modal Trigger -->

                        <div class="left">
                            <a class="waves-effect waves-light btn modal-trigger red" id="m3" href="#modal1">Agregar Docente</a>
                        </div>
                    </div>


                </div>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col s12">
            <div style="padding: 35px;" align="center" class="card">
                <div class="row">
                    <div class="left card-title">
                        <b>Brand Management</b>
                    </div>
                </div>

                <div class="row">
                    <a href="#!">
                        <div style="padding: 30px;" class="grey lighten-3 col s5 waves-effect">
                            <i class="indigo-text text-lighten-1 large material-icons">local_offer</i>
                            <span class="indigo-text text-lighten-1"><h5>Brand</h5></span>
                        </div>
                    </a>

                    <div class="col s1">&nbsp;</div>
                    <div class="col s1">&nbsp;</div>

                    <a href="#!">
                        <div style="padding: 30px;" class="grey lighten-3 col s5 waves-effect">
                            <i class="indigo-text text-lighten-1 large material-icons">loyalty</i>
                            <span class="indigo-text text-lighten-1"><h5>Sub Brand</h5></span>
                        </div>
                    </a>
                </div>
            </div>
        </div>

        <div class="col s6">
            <div style="padding: 35px;" align="center" class="card">
                <div class="row">
                    <div class="left card-title">
                        <b>Category Management</b>
                    </div>
                </div>
                <div class="row">
                    <a href="#!">
                        <div style="padding: 30px;" class="grey lighten-3 col s5 waves-effect">
                            <i class="indigo-text text-lighten-1 large material-icons">view_list</i>
                            <span class="indigo-text text-lighten-1"><h5>Category</h5></span>
                        </div>
                    </a>
                    <div class="col s1">&nbsp;</div>
                    <div class="col s1">&nbsp;</div>

                    <a href="#!">
                        <div style="padding: 30px;" class="grey lighten-3 col s5 waves-effect">
                            <i class="indigo-text text-lighten-1 large material-icons">view_list</i>
                            <span class="truncate indigo-text text-lighten-1"><h5>Sub Category</h5></span>
                        </div>
                    </a>
                </div>
            </div>
        </div>
    </div>

    <div class="fixed-action-btn click-to-toggle" style="bottom: 45px; right: 24px;">
        <a class="btn-floating btn-large pink waves-effect waves-light">
            <i class="large material-icons">add</i>
        </a>

        <ul>
            <li>
                <a class="btn-floating red"><i class="material-icons">note_add</i></a>
                <a href="" class="btn-floating fab-tip">Add a note</a>
            </li>

            <li>
                <a class="btn-floating yellow darken-1"><i class="material-icons">add_a_photo</i></a>
                <a href="" class="btn-floating fab-tip">Add a photo</a>
            </li>

            <li>
                <a class="btn-floating green"><i class="material-icons">alarm_add</i></a>
                <a href="" class="btn-floating fab-tip">Add an alarm</a>
            </li>

            <li>
                <a class="btn-floating blue"><i class="material-icons">vpn_key</i></a>
                <a href="" class="btn-floating fab-tip">Add a master password</a>
            </li>
        </ul>
    </div>
</main>

<footer class="indigo page-footer">
    <div class="container">
        <div class="row">
            <div class="col s12">
                <h5 class="white-text">Desarrollado por:</h5>
                <ul id='credits'>
                    <li>
                        System 01 <a href="https://formtypemaker.appspot.com/" title="Form Type Maker">Form Type Maker</a> from <a href="https://github.com/romannurik/FORMTypeMaker" title="romannurik">romannurik</a>
                    </li>
                    <li>
                        Icons made by <a href="https://material.io/icons/">Google</a>, available under <a href="https://www.apache.org/licenses/LICENSE-2.0" target="_blank">Apache License Version 2.0</a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <div class="footer-copyright">
        <div class="container">
            <span>Made By <a style='font-weight: bold;' href="https://github.com/piedcipher" target="_blank">Tirth Patel</a></span>
        </div>
    </div>
</footer>
</body>

</html>

<script src='js/materialize.min.js'></script>
<script  src="js/index.js"></script>
<script src='https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/js/materialize.min.js'></script>
</body>

</html>