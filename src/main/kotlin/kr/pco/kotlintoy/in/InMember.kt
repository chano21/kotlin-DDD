package kr.pco.kotlintoy.`in`

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class InMember {


//  public ResponseEntity<BackPackerResponse> orderCreate(@PathVariable int productSeq,@RequestBody int memberSeq)

    @GetMapping("/")
    fun createMemberOneWithMember(memberId: Int) :String {
        return "dddd"
    }

}