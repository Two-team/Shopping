<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Sign Up Form by Colorlib</title>
	
    <!-- Font Icon -->
    <link rel="stylesheet" href="fonts/signup/material-icon/css/material-design-iconic-font.min.css">

    <!-- Main css -->
	<link rel="stylesheet" href="css/signup/style.css">
</head>
<body>

    <div class="main">

        <!-- Sign up form -->
        <section class="signup">
            <div class="container">
                <div class="signup-content">
                    <div class="signup-form">
                        <h2 class="form-title">Sign up</h2>
                        <form method="POST" class="register-form" id="register-form">
                        	<div class="form-group">
                                <label for="memberId"><i class="zmdi zmdi-email"></i></label>
                                <input type="email" name="memberId" id="memberId" placeholder="Your Email"/>
                                <span style="font-size:5px; color:red; display:none"> Email은 필수 입력입니다.</span>
                            </div>
                            <div class="form-group">
                                <label for="memberName"><i class="zmdi zmdi-account material-icons-name"></i></label>
                                <input type="text" name="memberName" id="memberName" placeholder="Your Name" oninput="checkMemberNameLength()"/>
                                <span style="font-size:5px; color:red; display:none"> 이름은 3글자 이상이여야 합니다.</span>
                            </div>
                            <div class="form-group">
                                <label for="memberPw"><i class="zmdi zmdi-lock"></i></label>
                                <input type="password" name="memberPw" id="memberPw" placeholder="Password" oninput="checkMemberPwLength()"/>
                                <span style="font-size:5px; color:red; display:none"> 8자이상이여야 하며 최소 2개 이상의 영어와 특수문자를 포함해야합니다.</span>
                            </div>
                            <div class="form-group">
                                <label for="re-memberPw"><i class="zmdi zmdi-lock-outline"></i></label>
                                <input type="password" name="re-memberPw" id="re-memberPw" placeholder="Repeat your password"/>
                                <span style="font-size:5px; color:red; display:none"> 비밀번호가 일치하지 않습니다.</span>
                            </div>
                            <div class="form-group">
                                <label for="memberPhone"><i class="zmdi zmdi-phone"></i></label>
                                <input type="text" name="memberPhone" id="memberPhone" placeholder="010-xxxx-xxxx"/>
                                <span style="font-size:5px; color:red; display:none"> 전화번호는 필수 입력입니다.</span>
                            </div>
                            <div class="form-group">
                                <input type="checkbox" name="agree-term" id="agree-term" class="agree-term" />
                                <label for="agree-term" class="label-agree-term"><span><span></span></span>I agree all statements in  <a href="#" class="term-service">Terms of service</a></label>
                            </div>
                            <div class="form-group form-button">
                                <input type="submit" name="signup" id="signup" class="form-submit" value="Register"/>
                            </div>
                        </form>
                    </div>
                    <div class="signup-image">
                        <figure><img src="img/signup/signup-image.jpg" alt="sing up image"></figure>
                        <a href="/login" class="signup-image-link">I am already member</a>
                    </div>
                </div>
            </div>
        </section>

    </div>

    <!-- JS -->
    <script src="js/signup/main.js"></script>
    
    <!-- JavaScript 함수 -->
    
    <script>
    	/* 이름글자수제한 */
    	function checkMemberNameLength() {
    		let inputElem = document.getElementById('memberName');
    		let spanElem = inputElem.nextElementSibling;
    		if (inputElem.value.length < 3) {
    			spanElem.style.display = "inline";
    		} else {
    			spanElem.style.display ="none";
    		}
    	}
    	
    	/* 비밀번호제한 */
    	function checkMemberPwLength() {
    		let inputElem = document.getElementById('memberPw');
    		let spanElem = inputElem.nextElementSibling;
    		
    		/* 비밀번호의 길이는 8자 이상,영어문자 2개이상, 특수문자 2개이상의 조건 */
    		const regex = /^(?=(?:[^a-zA-Z]*[a-zA-Z]){2})(?=(?:[^\!\@\#\^\&\*\(\)\_\+\-\=\[\]\{\}\;\'\:\"\\\|\,\.\<>\/\?]*[\!\@\#\^\&\*\(\)\_\+\-\=\[\]\{\}\;\'\:\"\\\|\,\.\<>\/\?]){2}).{8,}$/;
    		
    		if (!regex.test(inputElem.value)) {
    			spanElem.style.display = "inline";
    		} else {
    			spanElem.style.display = "none";
    		}
    	}
    	
    	/* 필수입력사항 */
    	$(document).ready(function() {
		    const form = $("#register-form");
		    
		    form.on("submit", function(e) {
		        let hasError = false;
		        const inputs = ['memberId', 'memberName', 'memberPw', 'memberPhone'];
		        const checkBox = $('#agree-term');
		
		        for (let id of inputs) {
		            const inputElem = $("#" + id);
		            const spanElem = inputElem.next();
		            if (!inputElem.val().trim()) {
		                spanElem.css('display', 'inline');
		                hasError = true;
		            } else {
		                spanElem.css('display', 'none');
		            }
		        }
		
		        if (!checkBox.prop('checked')) {
		            alert("사용자 약관에 동의해주세요.");
		            hasError = true;
		        }
		
		        if (hasError) {
		            e.preventDefault();
		            return;
		        }
		
		        var formData = form.serialize();
		
		        $.ajax({
		            type: "POST",
		            url: "/signup",
		            data: formData,
		            success: function(response) {
		                if (response.success) {
		                    alert('회원가입이 정상적으로 등록되었습니다.');
		                    window.location.href = '/login';
		                } else {
		                    alert('회원가입에 실패했습니다. ' + response.message);
		                }
		            },
		            error: function(error) {
		                console.error('Error:', error);
		                alert('서버 오류 발생');
		            }
		        });
		
		        e.preventDefault();
		    });
		});


    	
    </script>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>