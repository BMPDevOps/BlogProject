$(function(){
    $("#inputPost").submit(function(e){
        e.preventDefault();
        console.log("이벤트")
        let formData = $(this).serialize();
        let blog_idx = $("#blog_idx").val();
        console.log(blog_idx)
        console.log(formData)
        $.ajax({
            url:"/posts/save",
            type:"post",
            data: formData,
            success:function(){
                alert("글이 등록되었습니다.")
                location.href=`/blog?blog_idx=${blog_idx}`
            }
        })
    })
})