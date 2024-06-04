$(function(){
    $("#postUpload").submit(function(e){
        e.preventDefault();
        $.ajax({
            url:"posts/save",
            type:"post",
            data:{"blog_idx":${}, "title":${}, "content":${}},

        })
    })
})