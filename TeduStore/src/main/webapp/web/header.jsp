<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<header id="top" class="fixed_nav">
    <div id="logo" class="lf">
        <img class="animated jello" src="../images/header/logo.png" alt="logo"/>
    </div>
    <div id="top_input" class="lf">
        <input id="input" type="text" placeholder="请输入您要搜索的内容"/>
        <a href="search.jsp" class="rt"><img id="search" src="../images/header/search.png" alt="搜索"/></a>
    </div>
    <div class="rt">
        <ul class="lf">
            <li><a href="../user/showPassword.do" title="修改用户信息">${user.username}</a><b>|</b></li>
            <li><a href="favorites.html" title="我的收藏"><img class="care" src="../images/header/care.png" alt=""/></a><b>|</b></li>
            <li><a href="orders.html" title="我的订单"><img class="order" src="../images/header/order.png" alt=""/></a><b>|</b></li>
            <li><a href="../cart/showCart.do" title="我的购物车"><img class="shopcar"
                                               src="../images/header/shop_car.png" alt=""/></a><b>|</b></li>
            <li><a href="help.html">帮助</a><b>|</b></li>
            <!-- 如果user==null，说明没有登录 -->
            <c:if test="${user==null}">
            	<li><a href="${pageContext.request.contextPath}/user/showLogin.do">登录</a></li>
            </c:if>
            <!-- 如果user!=null，说明已经登录 -->
            <c:if test="${user!=null}">
            	<li><a href="../user/exit.do">退出</a></li>
            </c:if>
            
        </ul>
    </div>
</header>