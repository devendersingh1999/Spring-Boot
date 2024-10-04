
<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<title>First JSP</title>
</head>
<body>
	<div class="container mt-5">
		<h1 class="text-center mb-4">Trigonometry Calculator</h1>

		<!-- Adjusted width using Bootstrap grid system -->
		<div class="row justify-content-center">
			<div class="col-md-6 col-lg-6">
				<form action="calc" method="post">
				  <div class="mb-3">
				    <label for="angle" class="form-label">Angle</label>
				    <input type="number" class="form-control" id="angle" name="angle" placeholder="Enter angle" required>
				  </div>
				  
				  <div class="mb-3">
				    <label for="func" class="form-label">Trigonometry Function</label>
				    <select class="form-select" id="func" name="func" required>
				    	<option value="sin">sin</option>
				    	<option value="cos">cos</option>
				    	<option value="tan">tan</option>
				    	<option value="sec">sec</option>
				    	<option value="cosec">cosec</option>
				    	<option value="cot">cot</option>
				    </select>
				  </div>
			  <div class="text-center">
			      <button type="submit" class="btn btn-primary w-75">Submit</button>
			  </div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
