package servlet;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DanhSachDatChoDao;
import dao.HoiVienDao;
import dto.DanhSachDatChoDto;
import dto.HoiVienDto;



@WebServlet(urlPatterns = "/tinh-trang-dat-cho-cua-hoi-vien")
public class TinhTrangDatChoCuaHoiVienServlet extends AbstractServlet {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
            throws ServletException, IOException {
    	String idHoiVien=req.getParameter("idHoiVien");
		/*
		 * TinhTrangDatChoCuaHoiVienDao dao = new
		 * TinhTrangDatChoCuaHoiVienDao(connection); TinhTrangDatChoCuaHoiVienDto
		 * hoivien = dao.selectByIdHoiVien(idHoiVien);
		 */
        
        HoiVienDao dao1=new HoiVienDao(connection);
        HoiVienDto hoivien=dao1.selectById(idHoiVien);
        req.setAttribute("hoivien",hoivien );
        
        DanhSachDatChoDao dao=new DanhSachDatChoDao(connection);
        List<DanhSachDatChoDto> datchos=dao.danhsachdatcho(idHoiVien);
        req.setAttribute("datchos", datchos );
        return "/WEB-INF/pages/TinhTrangDatChoCuaHoiVien.jsp";
    }

}