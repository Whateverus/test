package ru.ilya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RequestMapping("/test")
@Controller
public class TestController {
    private TestService testService;

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model uiModel) {
        List<TestObject> testObjects = testService.findAll();
        uiModel.addAttribute("objects", testObjects);
        return "test/list";
    }
    @Autowired
    public void setTestService(TestService testService) {
        this.testService = testService;
    }
}
