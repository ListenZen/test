function firstPage(num){
    $("[name=pageNo]").val(num);
    $("form").submit();
}
function pervPage(num){
    if(num<=1){
        alert("已经是第一页了！");
    }else{
        num--;
        $("[name=pageNo]").val(num);
        $("form").submit();
    }
}
function nextPage(num){
    var pageTotal = $("[name=pageTotal]").val();
    if(num>=pageTotal){
        alert("已经是最后一页了！");
    }else{
        num++;
        $("[name=pageNo]").val(num);
        $("form").submit();
    }
}
function lastPage(num){
    $("[name=pageNo]").val(num);
    $("form").submit();
}

function back(){
    window.location.href="/devices.do";
}

function submit(){
    var repairRecord = $("[name=repairRecord]").val();
    var deviceId = $(".deviceId").text();
    $.ajax({
        url:"add.do",
        type:"post",
        data:{"deviceId":deviceId,"repairRecord":repairRecord},
        dataType:"json",
        success:function(data){
            var addBefore = $(".addBefore");
            addBefore.before("<tr><td>"+data.repairTime+" ，"+data.repairRecord+" 。</td></tr>");
        },
        error:function () {
            alert("网络错误");
        }
    });
}

$(function(){
    $(".context tr:even").css("background","pink");
    $(".context tr:first").css("background","green");
});
