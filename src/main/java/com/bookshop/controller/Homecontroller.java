package com.bookshop.controller;

import com.bookshop.model.ProductionModel;
import com.bookshop.service.ProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class Homecontroller {

    @Autowired
    private ProductionService productionService;
    // Trong spring mvc địa chỉ đường dẫn là 1 hàm , hàm đó trả về là 1 string , string đó phải giống tên file trong phần view

    @RequestMapping("/home")
    public String home(HttpServletRequest request) {    //
        List<ProductionModel> response = productionService.readAllProduction(); // hứng dữ liệu từ tầng service trả về
        request.setAttribute("response", response); // tạo attribute cho view chứa dữ liệu
        return "home";
    }


}
