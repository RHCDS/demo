
function login()
{
	var username =$.trim($('#username').val());
	var password =$('#password').val();
	
	console.log("username: ");
	console.log(username);
	
	if(!username || !password){
		alert("用户名或密码不能为空！ ");
		return null;
	}
	
	$.ajax({
        url : 'login',
        type : 'POST',
        async: true, 
        data : {username1:username, password1:password},
        dataType : 'JSON',
        
        success : function(data) {
        	username=data.user_name ;
        	$('#username').val(username);
        	password=data.password;
        	alert(username);
        	document.write(Date());
        	window.location.href = 'welcome';
        },
        
        error : function(data) {
        	alert('stop');
            alert('提示', '系统异常，请联系管理员！', 'error');
        }
	});
}

function register(){
	var username =$.trim($('#username').val());
	var password =$('#password').val();
	var age= $('#age').val();
	
	if(!username || !password){
		alert("用户名或密码不能为空！ ");
		return null;
	}
	
	$.ajax({
        url : 'register',
        type : 'POST',
        async: true, 
        data : {username:username, password:password, age:age},
        dataType : 'JSON',
        
        success : function(data) {
        	
        	window.location.href = 'welcome';
        	document.write(Date());
        },
        
        error : function(data) {
        	window.location.href = 'register';
        }
	});
	
}


	