import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/servletA")
public class ServletA extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie1 = new Cookie("keya", "valuea");
        // set the max time of a cookie
        // cookie1.setMaxAge(60*5)
        cookie1.setPath("/demo06/servletB");

        Cookie cookie2 = new Cookie("keyb","valueb");

        resp.addCookie(cookie1);
        resp.addCookie(cookie2);
    }
}
