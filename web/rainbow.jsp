<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Big_Boss
  Date: 2017/9/26
  Time: 18:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,  initial-scale=1.0,maximum-scale=1.0, user-scalable=no">
    <link rel="stylesheet" href="http://localhost:8080/note/css/bootstrap.min.css">
    <link rel="icon" href="https://github.com/wenxin1996/SSH-note/blob/master/appicon.png?raw=true">
    <script type="text/javascript" src="http://localhost:8080/note/js/jquery-3.2.1.js"></script>
    <script type="text/javascript" src="http://localhost:8080/note/js/bootstrap.min.js"></script>
    <title>Note</title>
</head>
<style>
    .img-com{
        max-width: 100%;
    }
    a:hover,a:focus{
        text-decoration: none;
    }
</style>
<body>
<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse"
                    data-target="#example-navbar-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="http://localhost:8080/note/loadhome.action">HOME</a>
        </div>
        <div class="collapse navbar-collapse" id="example-navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="http://localhost:8080/note/loadhome.action">home</a></li>
                <li><a href="http://localhost:8080/note/loadNotebar.action">note</a></li>
                <li><a href="http://localhost:8080/note/noteAdd.html">note+</a></li>
                <li><a href="http://localhost:8080/note/htmlAdd.html">html+</a></li>
            </ul>
        </div>
    </div>
</nav>

<section>
    <div class="container">
        <s:iterator value="html">
            <s:property value="html" escape="false"/>
        </s:iterator>
    </div>
</section>
</body>
</html>