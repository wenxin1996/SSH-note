# SSH-note
## 树洞（未完成）<br>
类似树洞日记之类的页面，采用SSH框架搭建。<br><br>
上传了lib文件，之前弄的时候，由于lib不对，整了好久好久，不断地检查jar。这次所有的lib都上传了。<br><br>
完成了基本的功能，note+页面可以添加日记。日记显示的页面是按照日期显示，每天的日记都汇总在一个notebar里，从notebar可以点进查看当天的所有日记。<br><br>
主页有一个html展示页面，html+页面可以添加HTML代码到数据库，主页可以从数据库提取html代码到主页展示。也就是在线编辑html文件，并可以查看效果。<br><br>
未完成部分：分页没有弄，修改和更新数据没有弄。<br><br>

## 经验
分层为action、bean、service、Dao，bean储存对象实例，Dao执行数据库的查询、service实现逻辑，在action和Dao之间做中间操作，
action实现页面中数据的接受和数据处理后页面的分配。<br><br>

spring利用依赖注入链接struts2及Hibernate中的各个应用类，如把service层的类注入到action层的类里，实现两个类的互通，
这样就不用在action类里创建service类，使得代码的耦合降低，增强类的独立性。

测试时，有过查询几次数据库后，不响应。发现Dao的查询忘记提交事务（Transaction）。也要注意关闭session。

## Ps：
上传个自己画的图标，appicon.png

