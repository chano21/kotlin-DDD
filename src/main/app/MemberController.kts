import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

//import org.springframework.web.bind.annotation.RestController;

@RestController
class MemberContrller{
    @GetMapping("/")
    fun findMember(){
        return "hi"
    }

}