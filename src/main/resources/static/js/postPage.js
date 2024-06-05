$(function(){
   let s = "";
   let c = "";
    $("#postPage").ready(function(){
        console.log($("#post_idx").val())
        $.ajax({
            type: "post",
            url:"/posts/find",
            data: {"idx":$("#post_idx").val()},
            success: function(data){
                s += `<span>`
                s += `${data.title}`
                s += `</span>`
                $("#postTitle").append(s)

                c += `<span>`
                c += `${data.content}`
                c += `</span>`
                $("#postContent").append(c)
            }
        })
    })
})