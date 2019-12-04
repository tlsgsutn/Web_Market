<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="dto.product"%>
<%@ page import="dao.ProductRepository"%>
<%
     String id = request.getParameter("id");
     if (id == null || id.trim().equals("")) {
    	 response.sendRedirect("products.jsp");
    	 return;
     }
     
     ProductRepository dao = ProductRepository.getInstance();
     
     product product = dao.getProductById(id);
     if (product == null) {
    	 response.sendRedirect("exceptionNoProductld.jsp");
     }
     
     ArrayList<product> cartList = (ArrayList<product>) session.getAttribute("cartlist");
     product goodsQnt = new product();
     for (int i = 0; i < cartList.size(); i++) {
    	 goodsQnt = cartList.get(i);
    	 if (goodsQnt.getProductId().equals(id)) {
    		 cartList.remove(goodsQnt);
    	 }
     }
     
     response.sendRedirect("cart.jsp");
%>