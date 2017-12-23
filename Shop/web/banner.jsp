<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>banner</title>
    </head>
    <body>

        <div class="banner">
            <div class="container">
                <div class="banner-bottom">
                    <div class="banner-bottom-left">
                        <h2><br><br><br></h2>
                    </div>
                    <div class="banner-bottom-right">
                        <div  class="callbacks_container">
                            <ul class="rslides" id="slider4">
                                <li>
                                    <div class="banner-info">
                                        <h3>Shop hoa yêu thương</h3>
                                        <p>Hoa cho bạn, cho tôi, cho mọi người!</p>
                                    </div>
                                </li>
                                <li>
                                    <div class="banner-info">
                                        <h3>Shop hoa yêu thương</h3>
                                        <p>Chào mừng đến với thế giới hoa yêu thương!</p>
                                    </div>
                                </li>
                                <li>
                                    <div class="banner-info">
                                        <h3>Hoa yêu thương</h3>
                                        <p>Trao gửi yêu thương...!</p>
                                    </div>								
                                </li>
                            </ul>
                        </div>
                        <!--banner-->
                        <script src="js/responsiveslides.min.js"></script>
                        <script>
                            // You can also use "$(window).load(function() {"
                            $(function () {
                                // Slideshow 4
                                $("#slider4").responsiveSlides({
                                    auto: true,
                                    pager: true,
                                    nav: false,
                                    speed: 500,
                                    namespace: "callbacks",
                                    before: function () {
                                        $('.events').append("<li>before event fired.</li>");
                                    },
                                    after: function () {
                                        $('.events').append("<li>after event fired.</li>");
                                    }
                                });

                            });
                        </script>
                    </div>
                    <div class="clearfix"> </div>
                </div>
                <div class="shop">
                    <a href="#">MUA NGAY</a>
                </div>
            </div>
        </div>


    </body>
</html>
