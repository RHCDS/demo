<!DOCTYPE html>
<html>
   <head>
      <title>Blog-Register</title>
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
     
      <link rel="stylesheet" media="all" href="/demo/res/css/bootstrap.css" >
      <link rel="stylesheet" media="all" href="/demo/res/css/main.css" >
      
      <script src="/demo/res/js/jquery-1.11.3.min.js"></script>
      <script src="/demo/res/js/bootstrap.js"></script>
      <script src="/demo/res/js/myself.js"></script>   
      
      <style type="text/css">
      	.form-register{
      		max-width:330px;
      		padding:15px;
      		margin:0 auto;
      	}
      	input{
      		margin-bottom:8px;
      	}
      
  
		.header {  
		  height: 100%;  
		  min-height: 100%;  
		  height: auto !important;  
		}  
  
		.footer{ 
		  background-color: #333;  
		  color: white;  
		  height: 200px;  
		  position:fixed;
		  bottom:0;
		  width:100%;
		}  		
	</style>
      	
  </head>
   
   
   <body>
   
	<div class="header">  
      <div class="navbar navbar-inverse navbar-swapper">  
        <div class="navbar-inner">  
          <div class="container">  
            <a class="brand" href="login">Blog</a>  
            <ul class="menu nav pull-right">  
              <li><a href="login">login</a></li>  
              <li><a href="register">register</a></li>  
            </ul>  
          </div>  
        </div>  
      </div>  
      <div id="content" class="content container" ng-view></div>  
    </div>  
  </div> 
  
  	<div class="container">
   	<form class="form-register" role="form" method="POST">
   		<div class="control-group">  
      		<label class="control-label" for="inputNameAndPsw">Register</label>  
    	</div> 
   		 <input type="text" class="form-control" id="username"  
   		 	placeholder="Input your name"  required autofocus>
   		 <input type="password" class="form-control" id="password"  
   		 	placeholder="Input your psw"  required autofocus>	
   		 <input type="test" class="form-control" id="age"  
   		 	placeholder="Input your age"  required autofocus>

		<button type="button" class="btn btn-lg btn-primary btn-block" onclick="register()">注册
		</button>
	
	</form>	
	</div>
	<div class="footer">  
	   	 <div class="container">  
	      <p>  
	        version1.0  
	      </p>  
	    </div>  
  </div>

   </body>
</html>