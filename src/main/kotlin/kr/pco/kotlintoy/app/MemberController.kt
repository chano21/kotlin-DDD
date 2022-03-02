package kr.pco.kotlintoy.app

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MemberController {


//  public ResponseEntity<BackPackerResponse> orderCreate(@PathVariable int productSeq,@RequestBody int memberSeq)

    @GetMapping("/")
    fun findMemberOneWithMemberId(memberId: Int) :String {
        return "dddd"
    }

}