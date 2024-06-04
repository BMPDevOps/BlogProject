$(function(){
    let s;
    $.ajax({
        url:"/posts/find",
        data:"post",
        success:function(data){
            s += `
            <table>
            `
            data.forEach(function(postItem){
                s+=`
                    <tr>
                        <td>
                            <a href="posts/list?post_idx=${postItem.postIdx}">${postItem.title}</a>
                        </td>
                    </tr>
                `
            })
            s+= "</table>"
            $("#postList").append(s);
        }
    })


})