<%--placardList.jsp  公告列表页面--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>公告列表</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<link rel="stylesheet" type="text/css" href="CSS/style.css">
</head>
<body>
	<table width="500" border="0" align="center" cellpadding="0"
		cellspacing="0">
		<tr>
			<td width="415">&nbsp;</td>
			<td width="43">&nbsp;</td>
			<td width="42">&nbsp;</td>
		</tr>
		<tr>
			<td height="27" colspan="3" align="center" bgcolor="#FFFFFF"><span
				class="style1"></span><span class="style1"></span>[${description}]${createTime}</td>
		</tr>
		<tr>
			<td height="27" align="center" bgcolor="#FFFFFF">标题</td>
			<td align="center" bgcolor="#FFFFFF">修改</td>
			<td align="center" bgcolor="#FFFFFF">删除</td>
		</tr>
		<c:if test="${list==null}">
			<tr>
				<td height="27" colspan="3" align="center" bgcolor="#FFFFFF">暂无公告！</td>
			</tr>
		</c:if>
		<c:forEach var="form" items="${list}">
			<tr>
				<td height="27" bgcolor="#FFFFFF">&nbsp;${form.title}</td>
				<td align="center" bgcolor="#FFFFFF"><a
					href="/DynamicWeb/PlacardServlet01?action=modify_query&id=${form.id}"><img
						src="images/modify.gif" width="20" height="18" border="0" alt="提示" />
				</a></td>
				<td align="center" bgcolor="#FFFFFF"><a
					href="/DynamicWeb/PlacardServlet01?action=del&id=${form.id}"><img
						src="images/del.gif" width="23" height="22" border="0" /></a></td>
			</tr>
		</c:forEach>
	</table>
	<c:if test="${list!=null}">
		<table width="500" height="42" border="0" align="center"
			cellpadding="0" cellspacing="0">
			<tr>
				<td align="center"><a
					href="/DynamicWeb/PlacardServlet01?action=clearAll">[删除全部公告]</a></td>
			</tr>
		</table>
	</c:if>
</body>
</html>
