package kr.pco.kotlintoy.`in`.domain.member.command

import javax.validation.constraints.Email
import javax.validation.constraints.Pattern

open class Member {
    @Pattern(regexp = "([a-zA-Zㄱ-힣]{0,10}+)", message = "회원 이름은 한글, 영문 대소문자만 허용 10자까지 허용")
    open val memberName:String = ""
    @Email(message = "이메일 형식이 안맞습니다.")
    open val memberEmail:String = ""
    open val memberAge:String = ""
}


data class MemberCreated (
    var memberId: Int,
    override val memberName: String,
    override  val memberEmail:String,
    override  val memberAge:String,
) : Member()


data class MemberUpdated (
    val memberId:Int,
    override val memberName: String,
    override  val memberEmail:String,
    override  val memberAge:String,
) : Member()

data class MemberDeleted (
    val memberId:Int
)
