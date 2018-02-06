package ru.ilya.servlet;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import ru.ilya.TestObject;
import ru.ilya.TestService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class TestServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
        TestService testService = applicationContext.getBean(TestService.class);
        PrintWriter printWriter = resp.getWriter();

        printAll(testService.findAll(), printWriter);
        for (TestObject testObject: testService.findAll()) {
            testObject.setMyData(testObject.getMyData() + "_new");
            testService.save(testObject);
        }
        printAll(testService.findAll(), printWriter);
    }

    private void printAll(List<TestObject> all, PrintWriter printWriter) {
        for (TestObject testObject: all) {
            printWriter.println(testObject.toString());
        }
    }

}
