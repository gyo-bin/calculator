package kr.hs.dgsw.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

    @Autowired
    private GreetingService gs;

    //Request : http://hostname:port/greeting?name=DGSW
    //Response : Hello DGSW
    @GetMapping("/greeting/{num1}/{num2}/{cal}")
    public double sayNumber(@PathVariable double num1,@PathVariable double num2,@PathVariable String cal){
       if(cal.equals("plus")){
           return gs.plus(num1,num2);
        }else if(cal.equals("minu")){
           return gs.minu(num1,num2);
       }else if(cal.equals("mul")){
           return gs.mul(num1,num2);
       }else if(cal.equals("div")){
           return gs.div(num1,num2);
       }
       return 0;
    }

    /*
    //Request : http://hostname:port/greeting/DGSW
    //Response : Hello DGSW
    @GetMapping("/greeting/{name}")
    public String sayHi2(@PathVariable String name){
        return gs.sayHi(name);
    }
    */
}
