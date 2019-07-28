<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/pages/common/define.jsp" %>
 <style>
footer-row, .main-body, .main-header, .msg-wrapper, .sub-header {
    min-width: 1000px;
    max-width: 1300px;
    margin: 0 auto;
    overflow: hidden;
}

.footer1{
	
    height: 100%;
    overflow-y: scroll;
    word-break: break-word;
    
    font-size: 14px;
    font-weight: 400;
}

.rest1.animate {
	background-color: #1f1e1d;
    /*  transform: translateY(500px);*/
    animation: moveUp 1s cubic-bezier(.19,1,.22,1) forwards;
    transition: opacity 1s ease-in;
    opacity: 1;
}

.footer-links {
    margin-bottom: 5px;
}
.w-100 {
    width: 100%;
}
.fl {
    float: left;
}


footer-links .dib {
    font-weight: 700;
    margin-bottom: 19px;
    color: #797979;
}
row {
    margin-right: 60px;
    text-align: left;}
    
   .dib {
    font-weight: 700;
    margin-bottom: 19px;
    color: #797979;}
 .footer-links .dib {
    font-weight: 700;
    margin-bottom: 19px;
    color: #797979;
}

.foot-wrapper {
    margin-left: 110px;
}
  .footer-links a {
    display: block;
    color: #d7d7d7;
    cursor: pointer;
    margin-bottom: 10px;
    font-weight: 300;
    text-decoration: none;
    font-size: 15px;
    margin-right: 50px;
}
.rights-cont {
    width: 335px;
    line-height: 27px;
    margin-right: 48px;
}
.fr {
    float: right;
}

user agent stylesheet
div {
    display: block;
}
.promotion {
    color: #b1babf;
    padding: 30px 0;
}

.row.fl {
    margin-right: 35px;
}
.footer-links a:hover {
color: #d7d7d780;
	
}
</style>

<div class="container-fluid"  style="background-color:#1f1e1d">
<div class="footer1-row">
    <div class="clearfix promotion  main-body rest1 animate">
        <div class="w-100 pR fl footer-links">
                <div class="dib foot-wrapper">
                    <div class="row fl">
                        <div class="dib">
                            Giới thiệu về Magic Bus
                        </div>
                            <a href="" target="_blank">About Us</a>
                            <a href="#" target="_blank">Contact Us</a>
                            <a href="#" target="_blank">Mobile Version</a>
                            <a href="#" target="_blank">Magic Bus on Mobile</a>
                            <a href="#" target="_blank">Sitemap</a>
                            <a href="#" target="_blank">Offers</a>
                            <a href="#" target="_blank">Careers</a>
                            <a href="#" target="_blank">Values</a>
                    </div>
                    <div class="row fl">
                        <div class="dib">
                            Thông tin
                        </div>
                            <a href="#" target="_blank">T &amp; C</a>
                            <a href="#" target="_blank">Privacy Policy</a>
                            <a href="#" target="_blank">FAQ</a>
                            <a href="#" target="_blank">Blog</a>
                            <a href="#" target="_blank">Agent Registration</a>
                            <a href="#" target="_blank">Insurance Partner</a>
                    </div>
                    <div class="row fl">
                        <div class="dib">
                          Trang web toàn cầu
                        </div>
                            <a href="#" target="_blank">India</a>
                            <a href="#" target="_blank">Singapore</a>
                            <a href="#" target="_blank">Malaysia</a>
                            <a href="#" target="_blank">Indonesia</a>
                            <a href="#" target="_blank">Peru</a>
                            <a href="#" target="_blank">Colombia</a>
                    </div>
                </div>

            <div class="fr rights-cont">
                <div class="img-cont">
                    <img src="imgs/r_logo_1.png" >
                </div>
                <div style="text-align: justify">
                    Magic Bus là dịch vụ đặt vé xe buýt trực tuyến lớn nhất thế giới được tin tưởng bởi hơn 17 triệu khách hàng hài lòng trên toàn cầu. Magic Bus cung cấp dịch vụ đặt vé xe buýt thông qua trang web, ứng dụng di động iOS và Android cho tất cả các tuyến chính.
                </div>
                    <div id="social-media">
    <a target="_blank" href=""><span class="fbicon icon-Facebook"></span></a>
    <a target="_blank" href=""><span class="twittericon icon-Twitter"></span></a>
                        
                    </div>
                <div style="float: left">
                    <span>Ⓒ</span>
                        <span>  2019 Magic Bus Bảo lưu mọi quyền</span>
                </div>


            </div>      
                    </div>
    </div>
</div>
<br> 
</div>

</body>
</html>