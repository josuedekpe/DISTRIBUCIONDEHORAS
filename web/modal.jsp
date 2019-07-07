<%-- 
    Document   : modal
    Created on : 21/04/2019, 06:12:37 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Materialize CSS</title>
        
        <link rel='stylesheet' href='css/materialize.min.css'>
       <script src="js/materialize.min.js"></script>
       <script src="js/jquery-3.3.1.min.js"></script>
    </head>
    <body>
        <h1>Hello World!</h1>
        <div class="container">
            <h2>Modals</h2>
            <a href="#terms" class="btn orange modal-trigger">Terminos & Condiciones</a>
            <div class="modal" id="terms">
                terms
            </div>
            
        </div>
        <script>
            $(document).ready(function(){
                $('.modal').modal();
            });
        </script>
    </body>
</html>
