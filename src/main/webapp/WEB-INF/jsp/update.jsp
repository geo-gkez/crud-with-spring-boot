<%-- 
    Document   : update
    Created on : Jun 24, 2020, 6:23:18 PM
    Author     : georg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="springForm"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
    
  
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Form</title>
        
        <!-- CSS only -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">




<!-- JS, Popper.js, and jQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
 
<link href="css/trainerCSS.css" rel="stylesheet" type="text/css">
 
    </head>
    <body>
        
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
                   <a class="nav-link  " style="  color: #D9D9D9; " href="/">Home </a>
                 </li>
             
                 <li class="nav-item dropdown active">
                   <a class="nav-link "  id="trainer" style=" color: #D98E04;" href="/new">New Trainer</a>

                 </li>
                
                
               </ul>
             </div>
           </nav>
         </div>
     
     
           <div class="col-3"></div>
     
         </div>
            
         </div>
        
        
        <div class="container">
        
            <div align="center">
              <h2>Edit Trainer</h2>
            </div>
            
            <springForm:form novalidate="novalidate"  cssClass="needs-validation" action="/update" method="post" modelAttribute="tr">
            
  <div class="form-row">
      
  <div class="col-md-4 mb-3">
      <springForm:label path="name">First name</springForm:label>

      <springForm:input path="name"  cssClass="form-control" placeholder="First name" required="required" maxlength="45" minlength="2" pattern="[A-Za-z]+$" title="only letters, without spaces (for two or more names use - or _)"/>      
      <springForm:errors path= "name"   cssClass="error"/>
   
      <div class="invalid-feedback">
            only letters, without spaces (for two or more surnames use - or _)
            </div>
    </div>
      
      
    <div class="col-md-4 mb-3 " >
      <springForm:label path="surname">Last name</springForm:label>
      <springForm:input  path="surname"  cssClass="form-control"  placeholder="Last name"  required="required" maxlength="45" minlength="2" pattern="[A-Za-z]+$" title="only letters, without spaces (for two or more surnames use - or _)"/>     
    <springForm:errors path= "surname"   cssClass="error"/>
    
    <div class="invalid-feedback">
            only letters, without spaces (for two or more surnames use - or _)
            </div>
      
    </div>
    
       
       
     <div class="col-md-4 mb-3">
       <springForm:label path="subject">Subject</springForm:label>
     <springForm:input  path="subject"  cssClass="form-control"  placeholder="subject"  required="required" maxlength="45" minlength="2" pattern="[A-Za-z]+$" title="only letters, without spaces (for two or more subjects use - or _)"/>
   <springForm:errors path= "subject"   cssClass="error"/>
   
   <div class="invalid-feedback">
            only letters, without spaces (for two or more surnames use - or _)
            </div>
   
  </div>
 
  <springForm:hidden path="trainerid"/>
  <button class="btn btn-primary" type="submit"> Save</button>
  
 
  
</springForm:form>
        
  
  
   <div class="error" align="center">  ${duplicate}  </div>
  
  
      </div>  
        
   <script>
       (function() {
        'use strict';
        window.addEventListener('load', function() {
          
          var forms = document.getElementsByClassName('needs-validation');

          var validation = Array.prototype.filter.call(forms, function(form) {
            form.addEventListener('submit', function(event) {
              if (form.checkValidity() === false) {
                event.preventDefault();
                event.stopPropagation();
              }
              form.classList.add('was-validated');
            }, false);
          });
        }, false);
      })();
   </script>
              
    </body>
    
 
    
</html>
