$(function(){
    let s='';
    $.ajax({
        url: "blog/list",
        type: "post",
        success: function (data){   //list<>전체
            s+=`
            <table class="table table-bordered">
                <tr>
                    <th>
                        <h4>블로그 이름</h4>
                    </th>
                </tr>
            `
            data.forEach(function (item){   //list -> map의 key, value
                s += `
                    <tr>
                        <td>
                            <a href="/blog?blog_idx=${item.blog_idx}">${item.blog_name}</a>  
                        </td>
                    </tr>
                ` //item.id(key)의 값
            })
            s+= "</table>"
            $("#postPrint").append(s);
        }
    })
})