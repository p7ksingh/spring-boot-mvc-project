<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Registration</title>
    <style>
        form {
            width: 50%;
            margin: 20px auto;
        }
        label {
            display: block;
            margin-bottom: 5px;
        }
        input[type="text"], input[type="number"] {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

<h2>Employee Registration</h2>

<form action="add" method="POST">
    <label for="empId">Employee ID:</label>
    <input type="number" id="empId" name="empId" required>

    <label for="empName">Employee Name:</label>
    <input type="text" id="empName" name="empName" required>

    <label for="empSal">Employee Salary:</label>
    <input type="number" id="empSal" name="empSal" step="0.01" required>

    <input type="submit" value="Submit">
</form>

<script>
    document.getElementById("registrationForm").addEventListener("submit", function(event) {
        event.preventDefault(); // Prevent form submission
        // Retrieve form values
        var empId = document.getElementById("empId").value;
        var empName = document.getElementById("empName").value;
        var empSal = document.getElementById("empSal").value;

        // Display form values (you can perform further processing here)
        alert("Employee ID: " + empId + "\nEmployee Name: " + empName + "\nEmployee Salary: " + empSal);
    });
</script>

</body>
</html>
