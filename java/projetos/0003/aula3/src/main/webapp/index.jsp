<%@ page import="java.util.*" language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exemplo JSP</title>
</head>
<body>
	<ul>

	<!-- scriplets  <%  %> -->
	<%for(int x = 0; x < 10 ; x++){%> 
				
			<li><%=x %></li>
			
	<%}%>
	</ul>

    <p>
        
        <%
            String palavra = "AHAM";
            out.println(palavra);
        %>
    </p>

    <p>
        <%  
            out.println("Seu IP é: " + request.getRemoteAddr());
        %>
    </p>


    <!-- declarations  <%!  %> -->
    <%! String nome = "JSP"; %>
    <%! int nr = 0; %>
    <%! Object obj = new Object(); %>


    <!-- expressions  <%=  %>
     <p>A data de hoje é: <%=(new java.util.Date()).toLocalDate()%> </p> -->

    <!-- comentarios -->
    <%-- Comentário em páginas JSP --%>

    <%
	    //Comentário de Linha
        
	    /*
	    Comentário de Bloco
	    */
    %>

</body>
</html>