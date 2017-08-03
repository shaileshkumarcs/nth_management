<div class="modal-content animate">
			<div class="imgcontainer">
				 <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
				<!-- <img src="${pageContext.request.contextPath }/resources/images/Store1.jpg" alt="Avatar" class="avatar"> -->
			</div>
			
			<div id="loginview" class="row modelbody" style="margin-bottom:5px;">
				<div class="col-md-6" style="border-right:1px solid #f1f1f1;">
					<h4>Login with your account</h4>
					<form action="" method="POST">
						<input class="form-control" 
										type="text" placeholder="Enter Username" name="uname" required/><br/>
						<input class="form-control" 
										type="password" placeholder="Enter Password" name="psw" required/><br/>
						<input type="checkbox" checked="checked"/> Remember me
						<button class="pull-right submitbtn" type="submit">Login<b>&rarr;</b></button>
					</form>
				</div>
				<div class="col-md-6">
					<h4>Or login with</h4>
					<a href="#" class="btn btn-primary">FACEBOOK</a>
					<a href="#" class="pull-right btn btn-primary">GOOGLE+</a>	
					<hr/>
					<h4>Forget your password?</h4>
					<p>no worries, click here to <a onclick="resetform()" href="#">reset</a> your password.</p>
					Don't have an account yet ?  <a onclick="showform()" href="#">Create an account</a>	
				</div>
			</div>
			<div id="signupview" class="row modelbody">
				<div class="col-md-6" style="border-right:1px solid #f1f1f1;padding-bottom:5px;">
					<h4>Sign Up</h4>
					<p>Enter your details below</p>
					<form action="/home/signupform" method="POST">
						<input class="form-control" 
										type="text" placeholder="Full Name" name="name" required/><br/>
						<input class="form-control" 
										type="text" placeholder="Enter Username" name="uername" required/><br/>
						<input class="form-control" 
										type="password" placeholder="Enter Password" name="pssword" required/><br/>
						<input class="form-control" 
										type="password" placeholder="ReEnter Password" name="pssword1" required/><br/>
						<a class="submitbtn btn" onclick="backform()" href="#"><b>&larr;</b>Back</a>
						<button class="pull-right submitbtn" type="submit">Sign Up<b>&rarr;</b></button>
					</form>
				</div>
				<div class="col-md-6">
					<h4>Or login with</h4>
					<a href="#" class="btn btn-primary">FACEBOOK</a>
					<a href="#" class="pull-right btn btn-primary">GOOGLE+</a>	
					<hr/>
					<h4>Forget your password?</h4>
					<p>no worries, click here to <a onclick="resetform()" href="#">reset</a> your password.</p>
					Don't have an account yet ?  <a onclick="showform()" href="#">Create an account</a>	
				</div>
			</div>
			<div id="resetview" class="row modelbody">
				<div class="col-md-6" style="border-right:1px solid #f1f1f1;padding-bottom:5px;">
					<h4>Forget Password?</h4>
					<p>Enter your e-mail address below to reset your password.</p>
					<form action="" method="POST">
						<input class="form-control" 
										type="text" placeholder="Enter Username" name="uname" required/><br/>
						<a class="submitbtn btn" onclick="backform()" href="#"><b>&larr;</b>Back</a>
						<button class="pull-right submitbtn" type="submit">Submit<b>&rarr;</b></button>
					</form>
				</div>
				<div class="col-md-6">
					<h4>Or login with</h4>
					<a href="#" class="btn btn-primary">FACEBOOK</a>
					<a href="#" class="pull-right btn btn-primary">GOOGLE+</a>	
					<hr/>
					<h4>Forget your password?</h4>
					<p>no worries, click here to <a onclick="resetform()" href="#">reset</a> your password.</p>
					Don't have an account yet ?  <a onclick="showform()" href="#">Create an account</a>	
				</div>
			</div>
			<div class="containerr">
				<p class="text-center">Thanks for being our part</p>
			</div>
		</div>