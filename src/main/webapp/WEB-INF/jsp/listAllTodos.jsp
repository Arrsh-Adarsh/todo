<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<hr>
<br>
<div class="container">
	<h2>Your Todos</h2>
	<br>
	<div class="table-responsive-lg">
		<table class="table table-striped text-center">
			<thead>
				<tr>
					<th scope="col">Sl. No.</th>
					<th scope="col">Description</th>
					<th scope="col">Start Date</th>
					<th scope="col">Completion/Target Date</th>
					<th scope="col">Is Done?</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody class="p-1">
				<%int cnt=0; %>
				<c:forEach items="${todos}" var="todo">
				 	<tr>
				 		<td><%=++cnt%></td>
				 		<td>${todo.description}</td>
				 		<td>${todo.startDate}</td>
				 		<td>${todo.targetDate}</td>
				 		<td>
				 			<c:choose>
				 			<c:when  test="${true eq todo.done }">
						 		<svg xmlns="http://www.w3.org/2000/svg" width="25" height="25" 
						 			fill="green" class="bi bi-check-square-fill" viewBox="0 0 16 16">
	  								<path d="M2 0a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V2a2
	  									 2 0 0 0-2-2zm10.03 4.97a.75.75 0 0 1 .011 1.05l-3.992 4.99a.75.75
	  									  0 0 1-1.08.02L4.324 8.384a.75.75 0 1 1 1.06-1.06l2.094 2.093
	  									   3.473-4.425a.75.75 0 0 1 1.08-.022z"/>
								</svg>
							</c:when>
							<c:otherwise>
								<svg xmlns="http://www.w3.org/2000/svg" width="25" height="25" 
									fill="red" class="bi bi-x-square-fill" viewBox="0 0 16 16">
	  								<path d="M2 0a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V2a2
	  								 2 0 0 0-2-2zm3.354 4.646L8 7.293l2.646-2.647a.5.5 0 0 1 .708.708L8.707
	  								  8l2.647 2.646a.5.5 0 0 1-.708.708L8 8.707l-2.646 2.647a.5.5 0 0
	  								   1-.708-.708L7.293 8 4.646 5.354a.5.5 0 1 1 .708-.708"/>
								</svg>
							</c:otherwise>
							</c:choose>		
						</td>
				 		<td class="row justify-content-center">
				 			<div class="col w-90 p-1">
				 				<a href="update-todo/${todo.id}" class="btn btn-warning" >Update</a>
				 			</div>
				 			<div class="col w-90 p-1">
				 				<a href="delete-todo/${todo.id}" class="btn btn-danger" 
				 					onclick="return alert({${todo.description}))" >Delete</a>
				 			</div>
				 		</td>				 		
				 	</tr>		
				</c:forEach>
			</tbody>
		</table>
	</div>
	<br>
	
	<form:form method="post" class="" action="delete-all">
		<a href="add-todo" class="btn btn-success">Add Todo</a>
		<input type="submit" class="btn btn-danger" value="Delete All Todo">
	</form:form>
</div>
<%@ include file="common/footer.jspf" %>