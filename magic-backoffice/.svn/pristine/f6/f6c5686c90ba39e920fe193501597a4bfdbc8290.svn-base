
  package servlet; 
  import java.io.IOException;
  import java.sql.Connection;
  import java.sql.Date;
  import java.util.List;
  import javax.servlet.ServletException; 
  import javax.servlet.annotation.WebServlet;
  import javax.servlet.http.HttpServletRequest; 
  import javax.servlet.http.HttpServletResponse;
  import dao.TuyenDuongComplexDao;
  import dto.TuyenDuongComplexDto;
  
  @WebServlet(urlPatterns = "/locTuyenDuong") public class LocTuyenDuongServlet extends AbstractServlet {
  
  @Override public String execute(HttpServletRequest req, HttpServletResponse
  resp, Connection connection) throws ServletException, IOException { String
  date1=req.getParameter("locTuyenDuong"); String date2[] =date1.split("/");
  String ngay=date2[0]; String thang=date2[1]; String nam=date2[2];
  
  String date3=nam+"-"+thang+"-"+ngay;
  
  Date date=Date.valueOf(date3); TuyenDuongComplexDao dao = new
  TuyenDuongComplexDao(connection); List<TuyenDuongComplexDto> TuyenDuongs =
  dao.locTuyenDuong(date); req.setAttribute("TuyenDuongs", TuyenDuongs); return
  "/WEB-INF/pages/DanhSachTuyen.jsp"; }
  
  }
/* AJAX
 * package servlet;
 * 
 * import java.io.IOException; import java.sql.Connection; import java.sql.Date;
 * import java.util.List; import javax.servlet.ServletException; import
 * javax.servlet.annotation.WebServlet; import javax.servlet.http.HttpServlet;
 * import javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse; import com.google.gson.Gson; import
 * com.google.gson.JsonArray; import com.google.gson.JsonElement; import
 * com.google.gson.reflect.TypeToken;
 * 
 * import dao.TuyenDuongComplexDao; import dto.TuyenDuongComplexDto; import
 * util.DBConnectUtil;
 * 
 * @WebServlet(urlPatterns = "/locTuyenDuong") public class LocTuyenDuongServlet
 * extends HttpServlet { private static final long serialVersionUID = 1L;
 * 
 * @Override protected void doGet(HttpServletRequest req, HttpServletResponse
 * resp) throws ServletException, IOException {
 * 
 * Connection connection = DBConnectUtil.getConnection(); String date1 =
 * req.getParameter("date");
 * 
 * String date2[] = date1.split("/"); String ngay = date2[0]; String thang =
 * date2[1]; String nam = date2[2]; String date3 = nam + "-" + thang + "-" +
 * ngay; Date date = Date.valueOf(date3); TuyenDuongComplexDao dao = new
 * TuyenDuongComplexDao(connection); List<TuyenDuongComplexDto> TuyenDuongs =
 * dao.locTuyenDuong(date); Gson gson = new Gson(); JsonElement element =
 * gson.toJsonTree(TuyenDuongs, new
 * 
 * TypeToken<List<TuyenDuongComplexDto>>() { }.getType());
 * 
 * JsonArray jsonArray = element.getAsJsonArray();
 * resp.setContentType("application/json"); resp.setCharacterEncoding("UTF-8");
 * resp.getWriter().println(jsonArray); }
 * 
 * }
 */


 