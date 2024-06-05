let jungbok=false;

$(function(){

    $("#photo").change(function(){
        //console.log($(this)[0]);//type 이 file 인경우 배열타입으로 넘어온다
        let reg=/(.*?)\/(jpg|jpeg|png|gif)$/;
        let f=$(this)[0].files[0];
        if(!f.type.match(reg)){
            alert("이미지 파일만 가능합니다");
            return;
        }
        if(f){
            let reader=new FileReader();
            reader.onload=function(e){
                $("#showimg").attr("src",e.target.result);
            }
            reader.readAsDataURL($(this)[0].files[0]);
        }
    });

    //중복버튼 이벤트
    $("#btncheckid").click(function(){
        if($("#id").val()==''){
            alert("가입할 아이디를 입력해주세요");
            return;
        }
        $.ajax({
            url:"/signup/id_check",
            type:"post",
            data:{"id":$("#id").val()},
            success:function(result){
                console.log(result);
                if(result){
                    alert("이미 사용중인 아이디입니다");
                    jungbok=false;
                } else{
                    alert("사용가능한 아이디입니다");
                    jungbok=true;
                }
            }
        })
    });

    //아이디를 입력시 다시 중복확인을 누르도록 중복변수를 초기화
    $("#id").keyup(function(){
        jungbok=false;
    });

    $("#signup").submit(function (e){
        e.preventDefault();
        let url = $(this).attr("action");
        let form = $("#signup")[0];
        console.log(form)
        let formData = new FormData(form);
        console.log($(this))
        console.log(formData)

        $.ajax({
            url:url,
            type:"post",
            dataType:"json",
            data:formData,
            contentType : false,
            processData: false,
            cache:false,
            success:function (e){
                alert("회원가입 성공")
                location.href = "/main"
            },
            error: function (){
                alert("회원가입 에러")
            }
            
        })
    })
});  //close function



function check() {
    if(!jungbok){
        alert("아이디 중복확인을 해주세요");
        return false;//false반환시 action 실행을 안함
    }
}