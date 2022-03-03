package kr.pco.kotlintoy.`in`.domain.member.value

import javax.persistence.*
import kr.pco.kotlintoy.`in`.domain.BaseEntity

@Embeddable
class MemberName(name: String){
   lateinit var name : String

//   fun validMemberNameLength(name:String){
//       this.name=name
//   }
}