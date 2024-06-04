$(function (){
    $("#blogSave").submit(function (e) {
        e.preventDefault();
        $.ajax({
            url: "blog/save",
            type: "post",
            data: {"blog_name":$("#blogName").val()},
            success: function () {
                alert("블로그가 생성되었습니다.")
                location.href="/main"
            }
        })
    })
})