<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Shop Management System</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- navbar css -->
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/home.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/footer.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/loginfrom.css" />
<link href='https://fonts.googleapis.com/css?family=Codystar' rel='stylesheet'>
<style>

</style>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<nav class="navbar navbar">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> 
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand shopname" href="#">Nutan Hardware & Tent House</a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">AboutUs</a></li>
					<li><a href="#">Contact Us</a></li>
					<li><a href="#">Career</a></li>
					<li><a href="#">FAQ</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<!-- <li><a onclick="document.getElementById('id01').style.display='block'" href="#"><span class="glyphicon glyphicon-user"></span>
							Sign Up</a></li> -->
					<li><a onclick="document.getElementById('id01').style.display='block'" href="#"><span class="glyphicon glyphicon-log-in"></span>
							Login/Sign Up</a>
					</li>
				</ul>
			</div>
		</div>
	</nav>
	<!-- Login Form -->
	<div id="id01" class="modal">
		 <%@ include file="loginmodule.jsp"%>
	</div>
	<!-- End Login Form -->
	<!-- carousel Start -->
	<div id="myCarousel" class="carousel slide" data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
		</ol>
		<!-- Wrapper for slides -->
		<div class="carousel-inner">

			<div class="item active">
				<img src="${pageContext.request.contextPath}/resources/images/nuts_volts.jpg"
					alt="Nuts Volts" style="width: 100%;">
				<div class="carousel-caption">
					<h3>Nuts volts</h3>
					<p></p>
				</div>
			</div>

			<div class="item">
				<img src="${pageContext.request.contextPath}/resources/images/paints.jpg"
					alt="paits" style="width: 100%;">
				<div class="carousel-caption">
					<h3>Paints</h3>
					<p>We have different colors</p>
				</div>
			</div>

			<div class="item">
				<img src="${pageContext.request.contextPath}/resources/images/Store1.jpg"
					alt="store1" style="width: 100%;">
				<div class="carousel-caption">
					<h3>Equipment</h3>
					<p>We are selling all hardware things.</p>
				</div>
			</div>
			<div class="item">
				<img src="${pageContext.request.contextPath}/resources/images/kohli-tent-house-9.jpg"
					alt="store1" style="width: 100%;">
				<div class="carousel-caption">
					<h3>Marriage Decoration</h3>
					<p>We are doing full decoration.</p>
				</div>
			</div>

		</div>

		<!-- Left and right controls -->
		<a class="left carousel-control" href="#myCarousel" data-slide="prev">
			<span class="glyphicon glyphicon-chevron-left"></span> <span
			class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#myCarousel"
			data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right"></span> <span
			class="sr-only">Next</span>
		</a>
	</div>
	<!-- Short details about our SHOP -->
	<div class="about">
		<div class="container">
			<div class="row">
				<div class="col-md-8 col-xs-12">
					<h2>NTH is one of leading shop in this market.</h2>
					<ul>
						<li>
						<p>We are a rapidly growing Hardware and Tent House SHOP, focused on good product, services.</p></li>
						<li><p>Since our beginning in 2002, we have grown in size and scale. We are providing good service according to our customers.</p></li>
						<li><p>We have more then 2000 products for Hardware shop and More then 500 type of decoration in Tent House.</p></li>
						<li><p>We are selling quality of product, where we assured that product will worthy according to your investment.</p></li>
						<li><p>Our customer are valuable for us. We are taking care about his requirement.</p></li>
					</ul>
				</div>
				<div class="col-md-4 col-xs-12 text-center">
					<span class="glyphicon glyphicon-signal logo"></span>
				</div>
			</div>
		</div>
	</div>
	<!-- ENd Short details -->
	<!-- Start Service in our shop -->
	<div id="services" class="container-fluid text-center">
		<h2>SERVICES</h2>
		<h4>What we offer</h4>
		<br>
		<div class="row slideanim">
			<div class="col-sm-4">
				<span class="glyphicon glyphicon-off logo-small"></span>
				<h4>POWER</h4>
				<p>Lorem ipsum dolor sit amet..</p>
			</div>
			<div class="col-sm-4">
				<span class="glyphicon glyphicon-heart logo-small"></span>
				<h4>LOVE</h4>
				<p>Lorem ipsum dolor sit amet..</p>
			</div>
			<div class="col-sm-4">
				<span class="glyphicon glyphicon-lock logo-small"></span>
				<h4>JOB DONE</h4>
				<p>Lorem ipsum dolor sit amet..</p>
			</div>
		</div>
		<br><br>
		<div class="row slideanim">
			<div class="col-sm-4">
				<span class="glyphicon glyphicon-leaf logo-small"></span>
				<h4>GREEN</h4>
				<p>Lorem ipsum dolor sit amet..</p>
			</div>
			<div class="col-sm-4">
				<span class="glyphicon glyphicon-certificate logo-small"></span>
				<h4>CERTIFIED</h4>
				<p>Lorem ipsum dolor sit amet..</p>
			</div>
			<div class="col-sm-4">
				<span class="glyphicon glyphicon-wrench logo-small"></span>
				<h4 style="color:#303030;">HARD WORK</h4>
				<p>Lorem ipsum dolor sit amet..</p>
			</div>
		</div>
	</div>
	<!-- End service Part of our shop -->
	<%@ include file="footer.jsp"%>
</body>
</html>
<script type="text/javascript">
// Get the modal
var modal = document.getElementById('id01');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}
</script>
<script type="text/javascript">
		$(document).ready(function(){
			$("#signupview").hide();
			$("#resetview").hide();
		});
		function showform(){
			$("#loginview").hide();
			$("#resetview").hide();
			$("#signupview").show();
		}
		function backform(){
			$("#loginview").show();
			$("#signupview").hide();
			$("#resetview").hide();
		}
		function resetform(){
			$("#loginview").hide();
			$("#signupview").hide();
			$("#resetview").show();
		}
	
</script>











