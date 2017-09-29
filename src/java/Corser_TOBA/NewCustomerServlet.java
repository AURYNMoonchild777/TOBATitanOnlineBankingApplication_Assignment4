
package Corser_TOBA;


import java.io.IOException;
import java.io.PrintWriter;
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
     * @param user
     * @param param
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response, Object param, Object user)
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
 

    
    
    String message;
    
    if (FirstName == null || LastName == null || Username == null || Password == null || PhoneNumber == null || Address == null || City == null || 
        State == null || ZipCode == null || Email == null || FirstName.isEmpty() || LastName.isEmpty() || Username.isEmpty() || Password.isEmpty() ||
        PhoneNumber.isEmpty() || Address.isEmpty() || City.isEmpty() || State.isEmpty() || ZipCode.isEmpty()
             || Email.isEmpty()) {
            
            message = "Please fill out all the form fields.";
        }
 
             else {
                    //I moved adding the user to the session over here so it's validated properly now.
                    HttpSession sess = request.getSession(true);
    
                    HttpSession session = request.getSession();
                    session.setAttribute("User", user);
                    User u = new User(FirstName + LastName + Username + Password + PhoneNumber + Address + City + State + ZipCode + Email); 
                    request.setAttribute("User", user);
                     
                    message = "";
                    url = "Success.html";
                     
                     // Here's where I updated the code to add the user to the database.
                    UserDB.insert(u);
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