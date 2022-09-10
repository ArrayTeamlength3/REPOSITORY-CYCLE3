package com.Ciclo3.ProyectoArray.models;

public class Empresa {
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">

    <head>
    <title>AGREGAR NUEVA EMPRESA</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

    <style>
    a{
        color:white;
    }
    a:hover {
        color: black;
        text-decoration:none;
    }
            </style>
    </head>


    <body>
        <div class="container">
    <h1>Agregue aqui los datos de la nueva empresa</h1> <!--Titulo -->
            <br>
            <!--Crear formulario para llenar los datos de la empresa y guardarlo en el objeto emp -->
            <form th:action="@{/GuardarEmpresa}" th:object="${empNueva}" method="post">

                <!--Campo para nombre-->
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3" for="nombre">Nombre de la empresa:</label>
                        <div class="col-md-6">
                            <input type="text" th:field="*{nombre}" class="form-control" id="nombre" required="required">
                        </div>
                    </div>
                </div>

                <!--Campo para direccion-->
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3" for="direccion">Direccion de la Empresa:</label>
                        <div class="col-md-6">
                            <input type="text" th:field="*{direccion}" class="form-control" id="direccion" required="required">
                        </div>
                    </div>
                </div>

                <!--Campo para telefono-->
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3" for="telefono">Telefono de la Empresa:</label>
                        <div class="col-md-6">
                            <input type="text" th:field="*{telefono}" class="form-control" id="telefono" required="required">
                        </div>
                    </div>
                </div>

                <!--Campo para NIT-->
                <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3" for="NIT">NIT o RUT de la Empresa:</label>
                        <div class="col-md-6">
                            <input type="text" th:field="*{NIT}" class="form-control" id="NIT" required="required">
                        </div>
                    </div>
                </div>


                <!--Boton para enviar todo y ejecutar accion -->
                <div class="row">
                    <div class="col-md-2">
                        <button class="btn btn-success">Crear Empresa</button>
                    </div>
                </div>
            </form>

            <br>
            <a href="javascript: history.go(-1)" class="btn btn-info" role="button">Atrás</a>

        </div>
    </body>
</html>
}

