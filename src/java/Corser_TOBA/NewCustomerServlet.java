
package Corser_TOBA;

import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name ="NewCustomerServlet", urlPatterns = {"/new_customer"})
public class NewCustomerServlet extends HttpServlet {


        
        

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    

        
        
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
    
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewCustomerServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewCustomerServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        
        
        
        
        
    }
    
    

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response, Object param)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String url = "/new_customer.jsp";
        
        String action = request.getParameter("action");
        
        if (action == null) {
            action = "Join";
        }
        
        if (action.equals("Join")) {
            url = "/account_activity.html";   
        }
        
        else if (action.equals("add")) {           
        
    String FirstName = request.getParameter("First Name");
    String LastName = request.getParameter("Last Name");
    String Username = request.getParameter ("Username");
    String Password = request.getParameter("Password");
    String PhoneNumber = request.getParameter("Phone Number");
    String Address = request.getParameter("Address");
    String City = request.getParameter("City");
    String State = request.getParameter("State");
    String ZipCode = request.getParameter("Zip Code");
    String Email = request.getParameter("Email");
 
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    System.out.println("Connection Establishment");
    Connection con = null;
    String ull = "\"C:\\Users\\AURYN\\Documents\\NetBeansProjects\\TOBA Titan Onliine Banking Application\\src\\java\\Corser_TOBA\\UserLogin.java\"";
    
    String drive = "com.mysql.jdbc.Driver";
    String uName = "LastName" + "ZipCode";
    String pswd = "welcome1";
    String uname="";
    String userp="";
    String query= "";
    Statement st=null;
    ResultSet rs=null;
    HttpSession sess = request.getSession(true);
    
    HttpSession session = request.getSession();
    session.setAttribute("User", param);
    
    try {
    Class.forName(drive).newInstance();
    con = DriverManager.getConnection(ull,uname,pswd);
    if(request.getParameter("uname")!=null &&
    request.getParameter("uname")!="" && request.getParameter("pswd")!=null &&
    request.getParameter("pswd")!="")
    {
    uname = request.getParameter("uname").toString();
    userp = request.getParameter("pswd").toString();
    System.out.println(query);
    st = (Statement) con.createStatement();
    int cnt=0;
    while(rs.next())
    {
    sess.setAttribute("uname",rs.getString(2));
    cnt++;
    }
    if(cnt>0)
    {
    response.sendRedirect("index.html");
    }
    else
    {
    response.sendRedirect("Account_activity.html");
    }
    }

    } catch (Exception e) {
    e.printStackTrace();
    }
    
    String message;
    
    if (FirstName == null || LastName == null || Username == null || Password == null || PhoneNumber == null || Address == null || City == null || 
        State == null || ZipCode == null || Email == null || FirstName.isEmpty() || LastName.isEmpty() || Username.isEmpty() || Password.isEmpty() ||
        PhoneNumber.isEmpty() || Address.isEmpty() || City.isEmpty() || State.isEmpty() || ZipCode.isEmpty()
             || Email.isEmpty()) {
            
            message = "Please fill out all the form fields.";
        }
 
             else {
                     message = "";
                     url = "Success.html";
             }
        
        request.setAttribute("Message", message);
        
               
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
        


        

}
        
        
        
    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
    
      
    
}