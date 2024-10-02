<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body class="container my-5">
    <h2 class="mb-4">Add Student Record</h2>
    
    <form action="/addStudent" method="POST" class="bg-light p-4 border rounded">
        <div class="mb-3">
            <label for="id" class="form-label">ID</label>
            <input type="number" class="form-control" id="id" name="id" placeholder="Enter Student ID" required>
        </div>
        
        <div class="mb-3">
            <label for="name" class="form-label">Name</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="Enter Student Name" required>
        </div>
        
        <div class="mb-3">
            <label for="batch" class="form-label">Batch</label>
            <input type="text" class="form-control" id="batch" name="batch" placeholder="Enter Student Batch" required>
        </div>
        
        <button type="submit" class="btn btn-primary">Create Record</button>
    </form>
    
    <!-- Bootstrap JS (optional for advanced interactions) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
