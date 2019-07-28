package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.BusDao;
import dto.BusDto;

import util.ValidationUtil;

@WebServlet(urlPatterns = "/xacnhandangki")
public class XacNhanDangKiXeBusServlet extends AbstractServlet {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp, Connection connection)
            throws ServletException, IOException {
        String idBus= req.getParameter("idBus");
 
        BusDao dao = new BusDao(connection);
        BusDto bus = dao.selectById(idBus);
        req.setAttribute("bus", bus);
        return "/WEB-INF/pages/XacNhanDangKiBus.jsp";
    }
}