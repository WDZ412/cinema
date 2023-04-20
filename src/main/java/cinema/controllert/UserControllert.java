package cinema.controllert;


import cinema.entity.User;
import cinema.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user/")
public class UserControllert {
    @Autowired
    UserService userService;
    @RequestMapping("login")//验证账户是否存在并跳转到不同类型账户的页面
    public Object login(String account,String password){
        System.out.println("进入验证");
        User user=userService.getUser(account,password);
        if(user!=null) {
            switch (user.getUserTypeId()){
                case 1:
                    return "user/home";
                case 2:
                    return "数据库管理员页面";
                case 3:
                    return "保洁人员页面";
                case 4:
                    return "放映人员页面";
                case 5:
                    return "检票人员页面";
                case 6:
                    return "院线管理员页面";
            }
        }
        return "账号或密码错误";
    }
}