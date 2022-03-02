package kr.pco.kotlintoy.domain.member

import javax.persistence.*
import kr.pco.kotlintoy.domain.BaseEntity

class MemberName(name: String){
   lateinit var name : String

   fun validMemberNameLength(name:String){
       this.name=name
   }
}