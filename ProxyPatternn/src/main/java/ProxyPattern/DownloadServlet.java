package ProxyPattern;

import java.io.IOException;

import java.net.http.HttpRequest;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DownloadServlet")
public class DownloadServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpRequest request, HttpServletResponse response) throws ServletException, IOException {
        String videoUrl = request.getParameter("videoUrl");
        
        // Assuming you have already set the videoUrl as an attribute before forwarding
        request.setAttribute("videoUrl", videoUrl);
        request.getRequestDispatcher("VideoPlayer.jsp").forward(request, response);
    }
}
