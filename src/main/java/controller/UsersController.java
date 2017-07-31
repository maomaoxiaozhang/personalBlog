package controller;

import dao.CRUD;
import model.AdminEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhanggq on 2017/7/31.
 */
@Controller
public class UsersController {

    @RequestMapping("/index")
    public String getIndex(){
        return "index";
    }

    @RequestMapping("/admin")
    public String getAdmin(ModelMap modelMap){
        CRUD crud = new CRUD();
        AdminEntity admin = crud.research();
        modelMap.addAttribute("admin", admin);
        return "admin/admin";
    }
}
