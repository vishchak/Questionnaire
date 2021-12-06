package com.home.ht_pro_1;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "FilmsServlet", value = "/FilmsServlet")
public class FilmsServlet extends HttpServlet {

    String yourChoice1 = "Your fav film genre is " + "<br>";
    String yourChoice2 = "Your fav actor is " + "<br>";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        yourChoice1 = yourChoice1 + req.getParameter("movie") + "<br>";
        if (req.getParameter("actor").equals("Brad Pitt")) {
            yourChoice2 =yourChoice2 + req.getParameter("actor") + " <b>GOOD ONE</b>" + "<br>";
        } else {
            yourChoice2 =yourChoice2+ req.getParameter("actor") + "<br>";
        }

        PrintWriter pw = resp.getWriter();
        pw.println("<html>" +
                "<head><title>Answers</title></head>" +
                "<body><h1> Great answers I should say!</h1><br>" +
                "<fieldset><h2>" + yourChoice1 + "</h2></fieldset><br>" +
                "<fieldset><h2>" + yourChoice2 + "</h2></fieldset></body>" +
                "</html>");

    }

}