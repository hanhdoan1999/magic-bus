package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DatChoDao;
import dao.TuyenDuongComplexDao;
import dto.DatChoDto;
import dto.TuyenDuongComplexDto;


import util.ValidationUtil;

@WebServlet(urlPatterns = "/xoatuyen")
public class XacNhanXoaTuyenServlet extends AbstractServlet {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
            throws ServletException, IOException {
    	String idTuyenDuong=req.getParameter("idTuyenDuong");
    	TuyenDuongComplexDao dao=new TuyenDuongComplexDao(connection);
    	TuyenDuongComplexDto TuyenDuong=dao.selectById(idTuyenDuong);
    	req.setAttribute("TuyenDuong", TuyenDuong);
    	
    	DatChoDao dao2=new DatChoDao(connection);
    	List<DatChoDto> soluong=dao2.danhSachChoDaDatTheoIdTuyen(idTuyenDuong);
    	req.setAttribute("soluong", soluong.size());
    	
        return "/WEB-INF/pages/XacNhanXoaTuyen.jsp";
    }
}