<%@ page language="java" contentType="text/html; charset=uft-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/jquery-3.5.1.min.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<title>Login</title>
</head>
<body class='container'>
 <style>
        #lg {
            border: 1px solid steelblue;
            width: 500px;
            height: 350px;
            position: absolute;
            left: 50%;
            top: 50%;
            transform: translate(-50%,-50%);
            border-radius: 5%;
        }

        form{
            margin-top: 20px;
            margin-left: 15px;
            margin-right: 15px;
            text-align: center;
        }

        form input{
            margin-top: 30px;
        }

        h3{
            font-size: 50px;
            color: steelblue;
        }
    </style>
	<section id='lg'>
		<form action="login" method='post'>
			<h3>Login</h3>
			<input class='form-control' type='text' name='un' placeholder="Username">
			<input class='form-control' type='password' name='pass' placeholder="Pass">
			<input class='btn btn-success btn-lg' type='submit' value='Login'>
		</form>
	</section>
	
</body>
</html>