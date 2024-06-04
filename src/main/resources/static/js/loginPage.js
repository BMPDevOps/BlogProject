$(document).ready(function(){
    console.log("test")
    $("#loginForm").submit(function (e){
        e.preventDefault()  //모든 이벤트를 멈추겟다

        var fdata = $(this).serialize();//form의 데이터를 불러옴
        console.log(fdata)

        $.ajax({
            url:"/login/check",
            type:"post",
            dataType: "json",
            data:fdata,
            success:function(result){
                if(result) {
                    $.ajax({
                        url:"/blog/blogCheck",
                        type:"post",
                        success: function (check){
                            if(check){
                                location.href = "/main";   
                            }else{
                                alert("블로그를 생성해 주세요")
                                location.href="/newBlog"
                            }
                        }
                        
                    })
                }
                else{
                    alert("아이디 및 비밀번호가 틀렸습니다.")
                    location.reload();
                }
            },
            error:function(error){
                alert("로그인 에러")
            }
        })
    })
})

