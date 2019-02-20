package Servlet;

import Dao.Membersinfodao;
import entity.Membersinfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2019-01-19.
 */
@WebServlet(name = "Select1Servlet",urlPatterns = "/select")
public class Select1Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type=request.getParameter("type");
        Membersinfodao membersinfodao=new Membersinfodao();
        String message="";
        if(type==null) {

        }else  if("u".equals(type)){
            Object mess= request.getAttribute("update");
            message=mess.toString();
        }
        List<Membersinfo> list= membersinfodao.selectAll();
        request.getSession().setAttribute("update",message);
        request.getSession().setAttribute("list",list);
        response.sendRedirect("membersinfoselect.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
