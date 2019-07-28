package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BenDoDao;

import dto.BenDoDto;


import util.ValidationUtil;

@WebServlet(urlPatterns = "/xacnhancapnhatbendo")
public class XacNhanCapNhatBenDoServlet extends AbstractServlet {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
            throws ServletException, IOException {
        String idBen= req.getParameter("idBen");
        String tinhThanh = req.getParameter("tinhThanh");
       
      
        BenDoDao dao = new  BenDoDao(connection);
        BenDoDto bendo = dao.selectById(idBen);
        req.setAttribute("bendo", bendo);
        return "/WEB-INF/pages/XacNhanCapNhatBenDo.jsp";
    }
    
}