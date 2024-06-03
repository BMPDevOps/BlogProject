let jungbok=false;

$(function(){

    $("#file").change(function(){
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
        if($("#myid").val()==''){
            alert("가입할 아이디를 입력해주세요");
            return;
        }
        $.ajax({
            url:"/signup/id_check",
            type:"post",
            data:{"id":$("#myid").val()},
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
    $("#myid").keyup(function(){
        jungbok=false;
    });
});  //close function



function check() {
    if(!jungbok){
        alert("아이디 중복확인을 해주세요");
        return false;//false반환시 action 실행을 안함
    }
}