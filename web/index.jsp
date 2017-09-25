<%--
  Created by IntelliJ IDEA.
  User: Big_Boss
  Date: 2017/9/20
  Time: 21:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width,  initial-scale=1.0,maximum-scale=1.0, user-scalable=no">
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <script type="text/javascript" src="js/jquery-3.2.1.js"></script>
  <script type="text/javascript" src="js/bootstrap.min.js"></script>
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
      <a class="navbar-brand" href="index.jsp">HOME</a>
    </div>
    <div class="collapse navbar-collapse" id="example-navbar-collapse">
      <ul class="nav navbar-nav">
        <li class="active"><a href="index.jsp">home</a></li>
        <li><a href="loadnote.action">note</a></li>
        <li><a href="noteAdd.html">note+</a></li>
      </ul>
    </div>
  </div>
</nav>

<section>
  <div class="container">
    <div class="row">
      <div class="col-lg-3 col-xs-6 text-center">
        <a href="note.jsp">
          <img class="img-rounded img-com" src="http://img.jandan.net/news/2017/09/f12c8bc53952e62bdab42e13c9ffc05f.jpg!custom"/>
        </a>
      </div>
      <div class="col-xs-6 visible-xs">
        <a href="note.jsp">
          <h5 class="text-left" style="color: #EE7A6B">
            关于食物的20个冷知识
          </h5>
        </a>
      </div>
      <div class="col-lg-6 visible-lg">
        <a href="note.jsp">
          <h3 class="text-left" style="color: #EE7A6B">
            关于食物的20个冷知识
          </h3>
        </a>
        <h5 class="text-muted">by copy</h5>
        <h5 class="text-left">
          什么是世界上最常被偷的食物？什么食物可以变成钻石？
        </h5>
      </div>
      <div class="col-xs-12">
        <hr>
      </div>
    </div>
    <div class="row">
      <div class="col-lg-3 col-xs-6 text-center">
        <a href="note.jsp">
          <img class="img-rounded img-com" src="http://img.jandan.net/news/2017/09/617d7caf888ffbac4063e8869cf02951.jpg!custom"/>
        </a>
      </div>
      <div class="col-xs-6 visible-xs">
        <a href="note.jsp">
          <h5 class="text-left" style="color: #EE7A6B">
            喵星人可以有多坏？
          </h5>
        </a>
      </div>
      <div class="col-lg-6 visible-lg">
        <a href="note.jsp">
          <h3 class="text-left" style="color: #EE7A6B">
            喵星人可以有多坏？
          </h3>
        </a>
        <h5 class="text-muted">by copy</h5>
        <h5 class="text-left">
          “我知道你不喜欢，可本喵偏要气死你。”
        </h5>
      </div>
      <div class="col-xs-12">
        <hr>
      </div>
    </div>
  </div>
</section>

<section>
  <div class="container">
    <div class="row">
      <div class="col-lg-6 col-sm-12">
        <ul class="pagination">
          <li><a href="#">&laquo;</a></li>
          <li class="active"><a href="#">1</a></li>
          <li><a href="#">2</a></li>
          <li><a href="#">3</a></li>
          <li><a href="#">4</a></li>
          <li><a href="#">5</a></li>
          <li><a href="#">&raquo;</a></li>
        </ul>
      </div>
    </div>
  </div>
</section>
</body>
</html>