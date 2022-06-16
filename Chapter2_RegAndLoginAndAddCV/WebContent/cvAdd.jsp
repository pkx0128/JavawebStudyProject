<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="utf-8">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="https://fastly.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.30/favicon.ico">
    <link rel="canonical" href="https://getbootstrap.com/docs/3.4/examples/signin/">

    <title>Signin Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="https://fastly.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.30/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="https://fastly.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.30/assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="https://fastly.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.30/examples/signin/signin.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="https://fastly.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.30/assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="https://fastly.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.30/assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
<body>
    <div class="container">
    <form action="" class="form-horizontal">
    	<h2 class="text-center">简历添加 </h2>
    	<div class="form-group">
    		<label for="name" class="col-sm-2 control-label">姓名</label>
    		<div class="col-sm-10">
    			<input type="text" class="form-control" id="name" name="name" placeholder="姓名" required autofocus>
    		</div>
    	</div>
    	
    	<div class="form-group">
    		<label for="sex" class="col-sm-2 control-label">性别</label>
    		<div class="col-sm-10">
    			<label class="radio-inline"> <input type="radio" name="sex" id="inlineRadio1" value="1">男</label>
    			<label class="radio-inline"> <input type="radio" name="sex" id="inlineRadio2" value="2">女</label>
    		</div>
    	</div>
    	
    	<div class="form-group">
    		<label for="phone" class="col-sm-2 control-label">联系电话</label>
    		<div class="col-sm-10">
    			<input type="text" class="form-control" id="phone" name="phone" placeholder="联系电话" required autofocus>
    		</div>
    	</div>
    	
    	<div class="form-group">
    		<label for="intro" class="col-sm-2 control-label">个人简介</label>	
    		<div class="col-sm-10" >
    			<textarea rows="3" cols="5" class="form-control" id="intro" name="intro"></textarea>
    		</div>
    	</div>
    	
    	<div class="form-group text-center">
    	<button class="btn btn-lg btn-primary" type="submit">添加</button>
    	</div>
    	
    </form>
    </div>
</body>
</html>