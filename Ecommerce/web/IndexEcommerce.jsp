<%-- 
    Document   : IndexEcommerce
    Created on : 19/06/2018, 16:32:13
    Author     : LucasMarcon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="ControllerServlet" method="post">
            <!-- AÇÃO ABSOLUTAMENTE NECESSÁRIA PARA IDENTIFICAR DE ODNE VEM AS REQUISIÇÕES DAS PÁGINAS PARA LOCALIZÁ-LAS NAS SESSÕES -->
            <input type="hidden" name="acao" value="login" />
            
            Login: <input type="text" name="login"><br>
            Senha: <input type="password" name="senha"><br>
            <input type="submit" value="OK">
        </form>
    </body>
</html>
