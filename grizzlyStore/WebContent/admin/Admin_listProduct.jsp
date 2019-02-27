<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Product</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="styles/main.css" >
    <script src="scripts/main.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
 <div  class="main_bodypage ">
        <div class="row">
            <div class="col">
                <img src="images/logo.jpg" width=200px  height=65px>
                <input  type="text" placeholder="Search" class="search_input" >
                <i id="nav_search_icon" class="fa fa-search"></i>
            </div>
            <div class="mg60 float_left"  >
                    <label class="mg60 fa fa-bell " ></label>
                    <label  class="mg20 ">Welcome , ${userName}</label>
                    <button class="logoutbutton">Logout</button>
            </div>
        </div>
    </div>
            

    <div class="border profileCard_left_pos" >
        <h3 class="profileCard_top">Profile <small style="float: right;">   Edit</small></h3>
        <img src="images/blank.jfif" class="blank_image_style" >
        <p style="text-align:center"><b style="font-size:30px">${userName}</b> <br><br> ID <br> ${ID}<br><br>Designation<br>${Designation}<br><br>Office<br>${Office}</p><br>
        
    </div>

            <div class="main_divpag32">
                <div>
                    <input type="button" class="tabbar active" value="PRODUCTS" >
                    <input type="Button" class="tabbar" value="VENDORS">
                    <input type="Button" class="tabbar2" >
                </div>
                <div class="main_subdivpag32">
                    
                    
                    <select class="input_fieldpage2" disabled >
                                <option>Choose Category</option>
                    </select>
                    <input type="text" class="input_fieldpage2" placeholder="Search Category">
                    <i id="filtersubmitCategory" class="fa fa-search"></i>
                    <select class="input_fieldpage2"  >
                            <option disabled selected>Sort By</option>
                            <option>Brand</option>
                            <option>Rating</option>
                            <option>Category</option>
                    </select>
                    <button class="add_productbtn">Add Product</button>
                    
                </div>

                <div class="table_enhnc">
                        <table class="table table-bordered noBorder" style="border: 2px solid white;">
                                <thead>
                                  <tr>
                                    <th scope="col"></th>
                                    <th scope="col">Product List</th>
                                    <th scope="col">Brand</th>
                                    <th scope="col">Category</th>
                                    <th scope="col">Rating</th>
                                    <th scope="col"></th>
                                  </tr>
                                </thead>
                                <tbody >
                                  <tr>
                                    <td><div class="round">
                                            <input type="checkbox" id="checkbox" >
                                            <label for="checkbox"></label>
                                          </div>
                                        </td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td>
                                            <button disabled>View</button>
                                            <button disabled>Block</button>
                                            <button disabled>Remove</button>
                                    </td>
                                  </tr>
                              
                                </tbody>
                              </table>
                </div>
                
            </div>

            


    
</body>
</html>