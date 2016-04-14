function loadJs(path){
    var tag = document.createElement('script');
    tag.setAttribute('type', 'text/javascript');
    tag.setAttribute('src', path);
    document.getElementsByTagName('head')[0].appendChild(tag);
}

function loadCss(path) {
    var tag = document.createElement('link');
    tag.setAttribute("rel", "stylesheet");
    tag.setAttribute("type", "text/css");
    tag.setAttribute("href", path);
    tag.setAttribute("media", "all");
    document.getElementsByTagName('head')[0].appendChild(tag);
}

function doLogout() {
    if(confirm("确认退出？")) {
        $("#logoutForm").submit();
        return true;
    }
    else {
        return false;
    }
}