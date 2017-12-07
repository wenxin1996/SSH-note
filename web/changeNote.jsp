<%--
  Created by IntelliJ IDEA.
  User: bigBoss
  Date: 2017/12/7
Time: 11:06
To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,  initial-scale=1.0,maximum-scale=1.0, user-scalable=no">
    <link rel="stylesheet" href="css/bootstrap.min.css">
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
        <div class="row">
            <div class="col-lg-6 col-ms-12">
                <form class="form" action="http://localhost:8080/updatenote.action" role="form">
                    <div class="form-group">
                        <input name="id" class="btn btn-primary" readonly="readonly" value="<%=request.getParameter("id")%>">
                    </div>
                    <div class="form-group">
                        <input class="form-control" value="<%=request.getParameter("content")%>" readonly="readonly">
                        <input name="content" class="form-control">
                    </div>
                    <div class="form-group">
                        <button class="btn btn-block btn-success" type="submit">提交</button>
                    </div>
                    <div class="form-group">
                        <button class="btn btn-block btn-danger" onclick=window.open('http://localhost:8080/deletenote?id=<%=request.getParameter("id")%>')>删除</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>

</body>
</html>
