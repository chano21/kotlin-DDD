package kr.pco.kotlintoy.domain.member.command

import javax.persistence.*
import kr.pco.kotlintoy.domain.BaseEntity
import org.intellij.lang.annotations.Pattern
//import javax.validation.constraints.Pattern;

//open abstract class Member{
//    abstract  var memberId:Int
//    abstract  var memberName:String
//    abstract  var memberEmail:String
//    abstract  var memberAge:String
//}

class Member {
   // lateinit var  memberId: Int
     var  memberName: String?=null
 //   @Pattern
     lateinit var memberEmail: String
     lateinit var  memberAge: String

     class MemberCreated{
        val memberId:Int = 0
     }
}

//
//data class MemberCreated(override var memberName: String,
//                         override var memberEmail: String, override var memberAge: String): Member(memberName, memberEmail, memberAge)
//
//data class MemberUpdated(override var memberId: Int, override var memberName: String,
//                         override var memberEmail: String, override var memberAge: String): Member()
//

