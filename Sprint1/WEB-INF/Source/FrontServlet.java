package etu1828.framework.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.HashMap;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import etu1828.framework.Mapping;
import utility.Utility;

public class FrontServlet extends HttpServlet {
      HashMap<String,Mapping> mappingUrls;

  protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    PrintWriter out = resp.getWriter();
    out.println(Utility.getUrl(String.valueOf(req.getRequestURL())));
  }

  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    try {
      processRequest(req, resp);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    try {
      processRequest(req, resp);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
