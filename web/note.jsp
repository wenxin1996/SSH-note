<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Big_Boss
  Date: 2017/9/20
  Time: 22:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,  initial-scale=1.0,maximum-scale=1.0, user-scalable=no">
    <link rel="stylesheet" href="http://localhost:8080/css/bootstrap.min.css">
    <script type="text/javascript" src="http://localhost:8080/js/jquery-3.2.1.js"></script>
    <script type="text/javascript" src="http://localhost:8080/js/bootstrap.min.js"></script>
    <title>Note</title>
</head>
<body>

<style>
    .img-com{
        max-width: 100%;
    }
    a:hover,a:focus{
        text-decoration: none;
    }
</style>

<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse"
                    data-target="#example-navbar-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="http://localhost:8080/loadhome.action">HOME</a>
        </div>
        <div class="collapse navbar-collapse" id="example-navbar-collapse">
            <ul class="nav navbar-nav">
                <li><a href="http://localhost:8080/loadhome.action">home</a></li>
                <li class="active"><a href="http://localhost:8080/loadNotebar.action">note</a></li>
                <li><a href="http://localhost:8080/noteAdd.html">note+</a></li>
                <li><a href="http://localhost:8080/htmlAdd.html">html+</a></li>
            </ul>
        </div>
    </div>
</nav>

<section>
    <div class="container">
        <s:iterator value="list">
        <div class="row">
            <div class="col-lg-1">
                <button class="btn btn-default" onclick=window.open("http://localhost:8080/changeNotebar.jsp?id=<s:property value="id"/>&headline=<s:property value="headline"/>")>改</button>
            </div>
            <div class="col-lg-10">
                <a href="http://localhost:8080/loadnote?id=<s:property value="id"/>">
                    <h4 class="text-left" style="color: #EE7A6B">
                        <s:property value="headline"/>
                        <small class="text-muted">--<s:property value="time"/></small>
                    </h4>
                </a>
            </div>
            <div class="col-xs-12">
                <hr>
            </div>
        </div>
        </s:iterator>
    </div>
</section>

<section>
    <div class="container">
        <div class="row">
            <div class="col-lg-6 col-sm-12">
                <ul class="pagination">
                    <li><a href="http://localhost:8080/loadNotebar?page=1">1</a></li>
                    <li><a href="http://localhost:8080/loadNotebar?page=2">2</a></li>
                    <li><a href="http://localhost:8080/loadNotebar?page=3">3</a></li>
                    <li><a href="http://localhost:8080/loadNotebar?page=4">4</a></li>
                    <li><a href="http://localhost:8080/loadNotebar?page=5">5</a></li>
                </ul>
            </div>
        </div>
    </div>
</section>

<script>
    window.onload=function () {
        var page=<%=request.getParameter("page")%>;
        var $ul=$('.pagination').get(0);
        if(page<4){
            $ul.children[page-1].className="active";
        }else {
            $ul.children[2].className="active";
            for(i=0;i<5;i++){
                var number=page-2+i;
                $ul.children[i].children[0].innerText=number;
                $ul.children[i].children[0].href='http://localhost:8080/loadNotebar?page='+number;
            }
        }
    }
</script>

</body>
</html>