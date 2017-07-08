<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Expedia Hotel Offers Filter</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<link rel="stylesheet" href="resources/datepicker/css/datepicker.css" />
<link rel="stylesheet" href="resources/style/style.css" />

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
		integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
		crossorigin="anonymous"></script>
	<script src="resources/datepicker/js/bootstrap-datepicker.js"></script>
	<script src="resources/js/date-picker-init.js"></script>
	<script src="resources/js/star-rating-init.js"></script>
	<div class="container">
		<div class="row">
			<h1>Expedia</h1>

			<form class="form-inline">
				<div class="input-group col-md-5">
					<label for="city" class="input-group">City</label> <input
						name="cityName" type="text" class="form-control"
						placeholder="City Name">
				</div>
				<div class="input-group col-md-3">
					<label for="checkin-date" class=" input-group">Check In
						Date</label> <input id="check-in-date" name="checkInDate" type="text"
						class="form-control" placeholder="Check In Date">
				</div>
				<div class="input-group col-md-3">
					<label for="checkout-date" class="input-group">Check Out
						Date</label> <input id="check-out-date" name="checkOutDate" type="text"
						class="form-control" placeholder="Check Out Date">
				</div>
				<div class="input-group col-md-9">
					<label for="stars" class="input-group">Minimum Property
						Class</label>
					<div id="stars" class="starrr"></div>
					<input id="minimum-stars-count" name="minimumNumberOfStart"
						class="hidden" />

				</div>
				<div class="input-group col-sm-6">
					<button type="submit" class="btn btn-primary">Search</button>
				</div>
			</form>
		</div>

		<hr />
		
		<div class="row">
			<c:forEach items="${offers}" var="offer">
				<a href="<c:out value="${offer.hotelUrl}"></c:out>">
					<div class="col-md-4">
						<div class="thumbnail">
							<img src="<c:out value="${offer.hotelImage}"/>">
							<div class=" text-center">
								<c:forEach begin="1" end="${offer.numberOfStar}"
									varStatus="loop">
									<span class="glyphicon glyphicon-star gold big"></span>
								</c:forEach>
							</div>
							<h4 class="text-center">
								<small><c:out value="${offer.cityName}"></c:out></small>
							</h4>
							<div class="caption">
								<h4 class="pull-right" style="margin-top: 0px">
									$
									<c:out value="${offer.currentPrice}"></c:out>
								</h4>
								<h4 class="pull-right space"
									style="margin-top: 0px; color: red; text-decoration: line-through">
									$
									<c:out value="${offer.oldPrice}"></c:out>
								</h4>
								<h4 style="margin-top: 0px">
									<c:out value="${offer.hotelName}"></c:out>
								</h4>
								<p class="text-justify">
									<c:out value="${offer.description}"></c:out>
								</p>
								<h4 class="pull-right">
									<small><c:out value="${offer.checkInDate}"></c:out> To
										<c:out value="${offer.checkOutDate}"></c:out></small>
								</h4>
								<h4>
									<small>User Ratings : </small>
									<c:out value="${offer.userRating}"></c:out>
									<small>/ 5</small>
								</h4>
							</div>
						</div>
					</div>
				</a>
			</c:forEach>
		</div>

		<hr />

		<ul class="pager">
			<li><a href="#">Previous</a></li>
			<li><a href="#">Next</a></li>
		</ul>
	</div>

</body>
</html>