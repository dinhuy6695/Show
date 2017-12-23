
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Contact</title>
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery.min.js"></script>
        <!-- Custom Theme files -->
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
        <!-- Custom Theme files -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Eshop Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!--webfont-->
        <!-- for bootstrap working -->
        <script type="text/javascript" src="js/bootstrap-3.1.1.min.js"></script>
        <!-- //for bootstrap working -->
        <!-- cart -->
        <script src="js/simpleCart.min.js"></script>
        <!-- cart -->
        <link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />
    </head>
    <body>
        
<jsp:include page="header.jsp"></jsp:include>
        <!-- contact-page -->
        <div class="contact">
            <div class="container">
                <div class="dreamcrub">
                    <ul class="breadcrumbs">
                        <li class="home">
                            <a href="index.html" title="Go to Home Page">Trang chủ</a>&nbsp;
                            <span>&gt;</span>
                        </li>
                        <li class="women">
                            Liên hệ
                        </li>
                    </ul>
                    <ul class="previous">
                        <li><a href="index.html">Về trang chủ</a></li>
                    </ul>
                    <div class="clearfix"></div>
                </div>
                <div class="contact-info">
                    <h2>LIÊN HỆ</h2>
                </div>
                <div class="contact-map">
                  
                  
                    <style>
    #map {
        width: 100%;
        height: 400px;
    }
</style>
<button class="btn btn-primary" style="" onclick="timDuongDi()">Tìm đường đi</button>
<div id="map"></div>

<script>
    function initMap() {
        var latlng = new google.maps.LatLng(10.801841, 106.715002); //Vị trí của cửa hàng
        var map = new google.maps.Map(document.getElementById('map'), {
            center: latlng,
            zoom: 16
        });
        var marker = new google.maps.Marker({
            position: latlng,
            map: map,
            title: "Book Store"
        });
    }
    function timDuongDi() {
        var latlng = new google.maps.LatLng(10.801841, 106.715002); //Vị trí của cửa hàng
        var map = new google.maps.Map(document.getElementById('map'), {
            center: latlng,
            zoom: 16
        });
        var infoWindow = new google.maps.InfoWindow({ map: map });

        // Try HTML5 geolocation.
        if (navigator.geolocation) {
            navigator.geolocation.getCurrentPosition(function (position) {
                var pos = {
                    lat: position.coords.latitude,
                    lng: position.coords.longitude
                };

                infoWindow.setPosition(pos);
                infoWindow.setContent('Vị trí của bạn');
                map.setCenter(pos);

                var directionsDisplay = new google.maps.DirectionsRenderer({
                    map: map
                });
                var request = {
                    destination: latlng,
                    origin: pos,
                    travelMode: google.maps.TravelMode.DRIVING
                };
                var directionsService = new google.maps.DirectionsService();
                directionsService.route(request, function (response, status) {
                    if (status == google.maps.DirectionsStatus.OK) {
                        // Display the route on the map.
                        directionsDisplay.setDirections(response);
                    }
                });
            }, function () {
                handleLocationError(true, infoWindow, map.getCenter());
            });
        } else {
            // Browser doesn't support Geolocation
            handleLocationError(false, infoWindow, map.getCenter());
        }
        
            }

    function handleLocationError(browserHasGeolocation, infoWindow, pos) {
        infoWindow.setPosition(pos);
        infoWindow.setContent(browserHasGeolocation ?
                              'Error: The Geolocation service failed.' :
                              'Error: Your browser doesn\'t support geolocation.');
    }
</script>
<script async defer
        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBBNm_w79QzP4x67_HifEsfh69I3xpjkpo&callback=initMap">
</script>


                    </div>
                <div class="contact-form">
                    <div class="contact-info">
                        <h3>ĐỊA CHỈ</h3>
                    </div>
                 
                        <div class="contact-left">
                        <p>Trụ sở : 475A Điện Biên Phủ, P.25, Q.Bình Thạnh, TP.HCM</p>
                        <p>ĐT: (08) 5445 7777</p>
                        <p>Fax: (08) 5445 4444</p>
                        <p>Email: hutech@hutech.edu.vn</p>
                        </div>

                        <div class="clearfix"></div>
              
                </div>
            </div>
        </div>
        <!-- //contact-page -->

<jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
