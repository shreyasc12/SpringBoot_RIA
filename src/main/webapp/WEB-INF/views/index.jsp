<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <!-- CSS only -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

<!-- JS, Popper.js, and jQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>

    <title>Registration Form</title>
    <body>
    <div class = "container">
       
        <div class="row">
            <div class="col-lg-4"></div>
            <div class="col-lg-4">
              
                    <form class="form" action="register">
          
                    <h5 class="display-5" align="center">SIGN UP</h5>
                    <div class="form-group">
                        <label for="number">Employee_id:</label>
                        <input type="number" class="form-control" id="name" placeholder="Enter EMPLOYEE ID" name="id">
                    </div>
                    <div class="form-group">
                        <label for="text">Name:</label>
                        <input type="text" class="form-control" id="name" placeholder="Enter Full Name" name="name">
                    </div>
                     <div class="form-group">
                        <label for="number">Salary:</label>
                        <input type="number" class="form-control" id="name" placeholder="Enter Salary" name="salary">
                    </div>
                    <div class="form-group">
                        <label for="text">City</label>
                        <input type="text" class="form-control" id="city" placeholder="Enter City" name="city">
                    </div>
                    <div class="form-group">
                        <label for="number">Pincode</label>
                        <input type="number" class="form-control" id="name" placeholder="Enter Pincode" name="pincode">
                    </div>
                    <div class="form-group">
                        <label for="text">Email:</label>
                        <input type="text" class="form-control" id="email" placeholder="Enter Email" name="user_id">
                    </div>
                    <div class="form-group">
                        <label for="password">Password:</label>
                        <input type="password" class="form-control" id="email" placeholder="Enter Password" name="pass">
                    </div>
						
                    <div class="form-group form-check">
                        <label class="form-check-label">
                        <input class="form-check-input" type="checkbox" name="remember">Remember me
                        </label>
                    </div>
                    <button type="submit" class="btn btn-success">Register</button>
                    

                     </form>
               
            </div>
        </div>
    </div>
        </form>
    </body>
</html>
