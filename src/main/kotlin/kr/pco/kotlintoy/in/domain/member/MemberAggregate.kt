package kr.pco.kotlintoy.`in`.domain.member

import javax.persistence.*
import kr.pco.kotlintoy.`in`.domain.BaseEntity
import kr.pco.kotlintoy.`in`.domain.member.value.MemberEmail
import kr.pco.kotlintoy.`in`.domain.member.value.MemberName

@Entity
@Table(name="b_member")
data class MemberAggregate(
    @Id
    @Column(name="member_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val memberId :Int,

    @Column(name="member_name")
    val memberName : MemberName,

    @Column(name="member_email")
    val memberEmail : MemberEmail,

    @Column(name="member_age")
    val memberAge : Int


) : BaseEntity()