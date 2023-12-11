<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<hr>
<div class="container">
	<h2>Enter Your Todo</h2>
	<br>
	<form:form method="post" modelAttribute="todoDto">
		<fieldset class="row mb-3"> 
			<form:label path = "description" class="col-1">Description </form:label>
			<form:input type="text" path="description" required="required" class="col-6"/>
			<form:errors path="description" cssClass="text-danger col-5"></form:errors>	
		</fieldset>	
		
		<fieldset class="row mb-3"> 
			<form:label path = "startDate" class="col-1">Start Date</form:label>
			<form:input type="text" path="startDate" required="required" class="col-2"/>
			<form:errors path="startDate" cssClass="text-danger col-5"></form:errors>	
		</fieldset>	
		
		<fieldset class="row mb-3"> 
			<form:label path = "targetDate" class="col-1">Target Date</form:label>
			<form:input type="text" path="targetDate" required="required" class="col-2"/>
			<form:errors path="targetDate" cssClass="text-danger col-5"></form:errors>	
		</fieldset>	
		
		<fieldset class="row mb-3"> 
			<form:label path="done" class="col-1">Done </form:label>
			<form:select path="done" class="col-2">
				<form:option value="True"></form:option>
				<form:option value="False"></form:option>
			</form:select>
			<form:errors path="done" cssClass="text-warning col-5"></form:errors>	
		</fieldset>	
												 
		<form:input type="hidden" path="id" />
		<input type="submit" class="btn btn-success col-1"/>
		<a href="../list-todos" class="btn btn-secondary col-1">Back</a>
	</form:form>			
</div>

<%@ include file="common/footer.jspf" %>

<script type="text/javascript">
	$('#targetDate').datepicker({
	    format: 'yyyy-mm-dd',
	    startDate: '-1y'
	});
	
	$('#startDate').datepicker({
	    format: 'yyyy-mm-dd',
	    startDate: '-2y'
	});
</script>
