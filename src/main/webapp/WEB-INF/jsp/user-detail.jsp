<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../layout/taglib.jsp"%>

<h1>User Information:</h1>
<p>User Name:${user.name }</p>
<p>Email:${user.email }</p>

<c:forEach items="${user.blogs }" var="blog">

	<p>WebLog Name:${blog.name}</p>
	<p>WebLog URL:${blog.url}</p>

	<table class="table table-bordered table-hover table-striped">
		<thead>
			<tr>
				<th>Title</th>
				<th>Link</th>
			</tr>
		</thead>
		<tbody>
			<tr>

				<c:forEach items="${blog.items }" var="item">
					<tr>
						<td>${item.title }</td>
						<td>${item.link }</td>

					</tr>
				</c:forEach>
		</tbody>
	</table>

</c:forEach>