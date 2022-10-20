//package servlet;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.ArrayList;
//
//@WebServlet(name = "ProductServlet", urlPatterns = "/word")
//public class ProductServlet extends HttpServlet {
//
//    private static Logger logger = LoggerFactory.getLogger(ProductServlet.class);
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//      resp.setContentType("text/http;charset=UTF-8");
//      resp.getWriter().printf("<html><body>");
//        for (int i = 0; i < 10; i++) {
//            resp.getWriter().printf("<h1>Word" + i + "</h1>");
//        }
//        ArrayList<Product> products = new ArrayList<Product>();
//        for (int i = 1; i < 11; i++) {
//            products.add(new Product(i, "Bad", 10f));
//        }
//        resp.getWriter().printf("<h1>" + products + "</h1>");
//
//        //Вот эта реализация для меня намного правильней, но в методичке не уточняется как именно нужно сделать
//
////        products.add(new Product(1, "Bad", 10f));
////        products.add(new Product(2, "Milk", 15.5f));
////        products.add(new Product(3, "Яйца", 15.99f));
////        products.add(new Product(4, "Колбаса", 100f));
////        products.add(new Product(5, "Сыр", 40f));
////        products.add(new Product(6, "Сыр", 75f));
////        products.add(new Product(7, "Сыр", 87f));
////        products.add(new Product(8, "Сыр", 79f));
////        products.add(new Product(9, "Сыр", 91f));
////        products.add(new Product(10, "Сыр", 74f));
////        for (Product p: products) {
////            resp.getWriter().printf("<h1>" + p + "</h1>");
////        }
//        resp.getWriter().printf("</body></html>");
//        resp.getWriter().close();
//    }
//
//}
