package ir.controler;

import ir.domian.User;
import ir.repository.UserRepository;
import ir.repository.UserRepositoryImpl;
import ir.service.UserService;
import ir.service.UserServiceImpl;
import ir.util.DatabaseUtil;
import jakarta.persistence.EntityManager;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SaveServlet extends HttpServlet {

//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
//        resp.setContentType("text/html");
//        User user =  new User(1L , "mehrshad" , "Samaei" , "mehrshad74" , "123");
//        EntityManager entityManager = DatabaseUtil.getEmf().createEntityManager();
//        UserRepository userRepository = new UserRepositoryImpl(entityManager);
//        UserService userService = new UserServiceImpl(userRepository);
//        userService.save(user);
//
//    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        User user =  new User(1L , "mehrshad" , "Samaei" , "mehrshad74" , "123");
        EntityManager entityManager = DatabaseUtil.getEmf().createEntityManager();
        UserRepository userRepository = new UserRepositoryImpl(entityManager);
        UserService userService = new UserServiceImpl(userRepository);
        userService.save(user);

    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
}
