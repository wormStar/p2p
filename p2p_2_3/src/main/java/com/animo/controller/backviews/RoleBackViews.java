package com.animo.controller.backviews;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ye
 * 描述：后台角色页面跳转控制器
 */
@Controller
@RequestMapping("/back/role")
public class RoleBackViews {

    @GetMapping("pagerRole")
   public String listRoles(){
       return "role/roles";
   }

}
