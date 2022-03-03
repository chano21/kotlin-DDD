package kr.pco.kotlintoy.`in`.domain.member.value

import javax.persistence.*
import kr.pco.kotlintoy.`in`.domain.BaseEntity

@Embeddable
class MemberEmail(name: String){
   lateinit var email : String
}