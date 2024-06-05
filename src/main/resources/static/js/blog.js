$(function(){
    let s="";
    let blog_idx =  $("#blog_idx").val();
    $.ajax({
        url:"/posts/list",
        type:"post",
        data:{"idx":blog_idx},
        dataType:"json",
        success:function(data){
            s += `
            <table>
            `
            data.forEach(function(postItem){
                s+=`
                    <tr>
                        <td>
                            <a href="posts/find?post_idx=${postItem.post_idx}">${postItem.title}</a>
                        </td>
                    </tr>
                `
            })
            s+= "</table>"
            $("#postList").append(s);
        }
    })


})