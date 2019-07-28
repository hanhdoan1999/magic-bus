package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DanhSachDatChoDao;

import dto.DanhSachDatChoDto;

@WebServlet(urlPatterns = "/huydatcho")
public class XacNhanHuyDatChoServlet extends AbstractServlet {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
            throws ServletException, IOException {
    	String idDatCho=req.getParameter("idDatCho");
    	DanhSachDatChoDao dao=new DanhSachDatChoDao(connection);
    	DanhSachDatChoDto datcho=dao.selectById(idDatCho);
    	req.setAttribute("datcho", datcho);
        return "/WEB-INF/pages/XacNhanHuyDatCho.jsp";
    }
}