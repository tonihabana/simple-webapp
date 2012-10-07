package org.sonatype.mavenbook.web;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SimpleServlet extends HttpServlet {
    public static void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws ServletException, IOException {
	PrintWriter out = response.getWriter();
	out.println( "SimpleServlet is now being executed, take a look!" );
        out.flush();
        out.close();
    }
}
