package jp.co.g.japan.web.controller.app;

import jp.co.g.japan.app.constant.ApiConstant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping(ApiConstant.HOME_URI)
public class HomeController {

    @GetMapping
    public ModelAndView index(){
        return new ModelAndView("../index");
    }
}
