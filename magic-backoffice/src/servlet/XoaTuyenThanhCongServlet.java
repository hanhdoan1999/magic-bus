package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import dao.TuyenDuongDao;
import dto.TuyenDuongDto;

@WebServlet(urlPatterns = "/xoatuyenthanhcong")
public class XoaTuyenThanhCongServlet extends AbstractServlet {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
            throws ServletException, IOException {
    	String idTuyenDuong=req.getParameter("idTuyenDuong");
        TuyenDuongDao dao = new TuyenDuongDao(connection);
        int count=   dao.deleteTuyenDuong(idTuyenDuong);
        HttpSession session = req.getSession();
        session.setAttribute("oneTimeMessage", "Một tuyến đã được xóa!");
        return "redirect:danhsachtuyen";
 
    }
}