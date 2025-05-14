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
/*
    - Các bước làm chức năng hiển thị chi tiết sản phẩm :
    + dữ liệu đang nằm trong db
    => mục tiêu : lấy dữ liệu sp từ trong db -> gửi lên ui trình duyệt

    b1. trình duyệt gửi id sp muốn xem chi tiết lên controller qua param hoặc path variable
    b2. controller sẽ gọi tới tầng service , truyền vào id vì controller
    sẽ chỉ giao tiếp với tầng service để xử lý logic , không giao tiếp với tầng dao
    -> tạo method findById trong ProductionService
    b3. từ tầng service -> gọi tới tầng dao vì tầng dao là tầng duy nhất dử dụng jdbc để giao tiếp
    thực hiện querry được với db
    -> tạo method findById ở tầng dao
    b4. tầng dao tại method finById thực hiện câu lệnh query



* */



}
