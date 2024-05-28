

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Seleccionar Rol</title>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background-color: #f8f9fc;
            font-family: Arial, sans-serif;
        }

        .container {
            text-align: center;
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 40px;
        }

        h1 {
            color: #4e73df;
            margin-bottom: 20px;
        }

        .rolAdmin, .rolUser {
            display: inline-block;
            padding: 10px 20px;
            margin: 10px;
            font-size: 16px;
            color: white;
            background-color: #4e73df;
            text-decoration: none;
            border-radius: 10rem;
            text-align: center;
            transition: background-color 0.3s;
        }

        .rolAdmin:hover, .rolUser:hover {
            background-color: #2e59d9;
        }

        .bg-register-image, .bg-login-image, .bg-password-image {
            background-position: center;
            background-size: cover;
        }

        .bg-login-image {
            background-image: url('https://unsplash.com/photos/YOUR_LOGIN_IMAGE_URL');
        }

        .bg-register-image {
            background-image: url('https://unsplash.com/photos/YOUR_REGISTER_IMAGE_URL');
        }

        .bg-password-image {
            background-image: url('https://unsplash.com/photos/YOUR_PASSWORD_IMAGE_URL');
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Escoge tu rol</h1>
        <a class="rolAdmin" href="loginAdmin.jsp">Soy Administrador</a>
        <a class="rolUser" href="loginUsuario.jsp">Soy Usuario</a>
    </div>
</body>
</html>

