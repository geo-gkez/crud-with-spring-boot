<%-- 
    Document   : index
    Created on : Jun 20, 2020, 1:07:25 AM
    Author     : georg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
         <script src="https://code.jquery.com/jquery-3.5.1.js" integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc=" crossorigin="anonymous"></script>
     
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trainers</title>
        
        <script src="js/trainerJs.js"></script>
        
      
        <!-- CSS only -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

<!-- JS, Popper.js, and jQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    </head>
    <body >
        
        <div class="my-4 container sticky-top" >

        <div class="row">
            
            <div class="col-3"> </div>
     
            <div class="col-6">
         <nav class=" navbar rounded navbar-expand-md navbar-light  " style="background-color: #A6430A; ">
             <a class="navbar-brand" style="color: #000000;" href="/"> Trainer List </a>
             <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" 
             aria-expanded="false" aria-label="Toggle navigation">
               <span class="navbar-toggler-icon"></span>
             </button>
             <div class="collapse navbar-collapse" id="navbarNav">
               <ul class="navbar-nav">
                 <li class="nav-item ">
                   <a class="nav-link  " style="color: #D98E04; " href="/">Home </a>
                 </li>
               
                 <li class="nav-item dropdown active">
                   <a class="nav-link "  id="trainer" style=" color: #D9D9D9;" href="/new">New Trainer</a>

                 </li>
                
                
               </ul>
             </div>
           </nav>
         </div>
     
     
           <div class="col-3"></div>
     
         </div>
            
         </div>
        
      <div class="container" >
          <div align="center">
        <h2>Trainers List</h2>
 
        <button class="btn btn-success">Insert new Trainer</button> 
        <br></br> 
        </div>
    <table class="table table-editable table-striped table-borderedb table-dark" id="table" >
        <thead >
          <tr  >
            
            <th scope="col">First name</th>
            <th scope="col">Last name</th>
            <th scope="col">Subject</th>
            <th  scope="col">Actions</th>
          </tr>
        </thead>
       
        <tbody >
        <c:forEach items="${allTrainers}" var="t">
                <tr>
                    <td>${t.name}</td>
                    <td>${t.surname}</td>
                    <td>${t.subject}</td>
                    <td> <button   class="btn btn-primary" >Edit</button>&nbsp
                        <button  class="btn btn-danger" >Delete</button></td>
                </tr>
        
                
            </c:forEach>
        </tbody>
      </table
      

      
</div>
        
        
   
        
    </body>
</html>
