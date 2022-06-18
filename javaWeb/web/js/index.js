function delFruit(id){
    if(confirm('是否确认删除？')){
        window.location.href='del.do?id='+id;
    }
}