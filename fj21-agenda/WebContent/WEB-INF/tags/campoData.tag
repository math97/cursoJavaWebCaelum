<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ attribute name ="id" required="true"%>
<input autocomplete="off" type="text" id="${id}" name="${id }"/>
<script>
	$("#${id}").datepicker({dateFormat:'dd/mm/yy'});
	
</script>