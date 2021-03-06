<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
 	<title>App Admin</title>
 
   <jsp:include page="/WEB-INF/jsp/components/defaultHead.jsp" /> 
  </head>
<body>
<section id="container" class="">
   <!-- Default header -->
<jsp:include page="/WEB-INF/jsp/components/defaultHeader.jsp" /> 


 <!-- Default Menue -->
<jsp:include page="/WEB-INF/jsp/appAdmin/components/appAdminMenu.jsp" /> 

 
 <!-- Default Containt -->
   <aside>
  <section id="main-content">
          <section class="wrapper">  
          <c:if test="${!empty ErrorMessage}">
  					  <div class="alert alert-block alert-danger fade in">
                                  <button data-dismiss="alert" class="close close-sm" type="button">
                                      <i class="icon-remove"></i>
                                  </button>
                                <strong> ${ErrorMessage} </strong> 
                              </div>
		</c:if>
              <div class="row">
                  <div class="col-lg-12">
                      <section class="panel">
                          <header class="panel-heading">
                            Add Institute
                          </header>
                          <div class="panel-body">
                              <div class="form">
                                 <form:form class="form-validate form-horizontal " id="register_form" method="post" action="SaveInstituteAdmin" modelAttribute="Teacher">
                                      <div class="form-group ">
                                          <label for="fullname" class="control-label col-lg-2">First Name <span class="required">*</span></label>
                                          <div class="col-lg-10">
                                              <form:input path="fname" class=" form-control" id="fname" name="fname" type="text" autocomplete="off" required="required" maxlength="50"/>
                                          </div>
                                          <label for="fullname" class="control-label col-lg-2">Surname <span class="required">*</span></label>
                                          <div class="col-lg-10">
                                              <form:input path="lname" class=" form-control" id="address" name="address" type="text" autocomplete="off" required="required" maxlength="50"/>
                                          </div>
                                           <label for="fullname" class="control-label col-lg-2">Contact Number <span class="required">*</span></label>
                                          <div class="col-lg-10">
                                              <form:input path="contactno" class=" form-control" id="contactno" name="contactno" pattern="[789][0-9]{9}" title="Please enter Valid contact number" type="text" autocomplete="off" required="required" maxlength="100"/>
                                          </div>
                                          <label for="fullname" class="control-label col-lg-2">Email Id <span class="required">*</span></label>
                                          <div class="col-lg-10">
                                              <form:input path="email" class=" form-control" id="email" name="email" type="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" autocomplete="off" required="required" maxlength="50"/>
                                          </div>
                                         
                                          
                                          
                                          
                                      </div>
                                   
                                      <div class="form-group">
                                          <div class="col-lg-offset-2 col-lg-10">
                                              <button class="btn btn-primary" type="submit">Save</button>
                                                                                      </div>
                                      </div>
                                          <div class="alert alert-info fade in">
                               				   <button data-dismiss="alert" class="close close-sm" type="button">
                                		    		  <i class="icon-remove"></i>
                               				   </button>
                               			   <strong>Note..!!!</strong> For Institute Admin currently Username will be: Email-Id and Password Will be: Contact Number  
                              </div>
                                    
                                  </form:form>
                              </div>
                          </div>
                      </section>
                  </div>
              </div>
              
              
             
               </aside>
              <!-- page end-->
 </section>
 

 
     <!-- container section start -->
<jsp:include page="/WEB-INF/jsp/components/defaultScript.jsp" />
   </section>
 <!-- container section start -->
  </body>
</html>