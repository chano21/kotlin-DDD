package kr.pco.kotlintoy.domain.member

import javax.persistence.*
import kr.pco.kotlintoy.domain.BaseEntity

@Entity
@Table(name="b_member")
class MemberEntity(
    @Id
    @Column(name="member_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val memberId :Int,

    @Column(name="member_name")
    val memberName :String



) : BaseEntity()