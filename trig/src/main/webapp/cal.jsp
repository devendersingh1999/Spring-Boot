
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bootstrap Calculator</title>

    <!-- Bootstrap CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center mb-4">Simple Calculator</h1>
        
        <form action="/cal" method="get" class="bg-light p-4 border rounded">
            <div class="mb-3">
                <label for="num1" class="form-label">Enter First Number:</label>
                <input type="number" class="form-control" id="a" name="a" placeholder="First Number" required>
            </div>

            <div class="mb-3">
                <label for="num2" class="form-label">Enter Second Number:</label>
                <input type="number" class="form-control" id="b" name="b" placeholder="Second Number" required>
            </div>

            <div class="mb-3">
                <label for="operation" class="form-label">Choose Operation:</label>
                <select class="form-select" id="opr" name="opr" required>
                    <option value="add">Addition (+)</option>
                    <option value="subtract">Subtraction (-)</option>
                    <option value="multiply">Multiplication (*)</option>
                    <option value="divide">Division (/)</option>
                </select>
            </div>

            <div class="text-center">
                <button type="submit" class="btn btn-primary">Calculate</button>
            </div>
        </form>
    </div>

   
</body>
</html>

