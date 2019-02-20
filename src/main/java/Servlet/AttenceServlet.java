package Servlet;
import Service.AttenceService;
import Service.impl.AttenceServiceimpl;
import entity.ATTENCE;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

/**
 * Created by Administrator on 2019-01-19.
 */
@WebServlet(urlPatterns = "/p",name = "AttenceServlet")
public class AttenceServlet extends HttpServlet {
    AttenceService attenceService=new AttenceServiceimpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String type=request.getParameter("type");
        if(type==null){
            select(request,response);
        }else{
            switch (type){
                case "select":
                    select(request,response);
                    break;
                case "insert":
                    insert(request,response);
                    break;
            }
        }
    }

    protected void select(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ATTENCE> list =attenceService.selectAll();
        request.getSession().setAttribute("list1",list);
        response.sendRedirect("attenceselect.jsp");
    }

    protected void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter a=response.getWriter();
        ATTENCE attence=new ATTENCE();
        attence.setEMPNAME(request.getParameter("name"));
        attence.setDEPT(request.getParameter("bm"));
        attence.setCHKDATE(Date.valueOf(request.getParameter("time")));
        attence.setSTATUS(Integer.valueOf(request.getParameter("zt")));
        int x=attenceService.insert(attence);
        if (x==1){
            a.print("<script type=\"text/javascript\">alert(\"添加成功\");window.location.href='p?type=select'</script>");
            a.flush();
            a.close();
        }else{
            response.sendRedirect("insert.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
