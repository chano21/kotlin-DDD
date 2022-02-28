package kr.pco.kotlintoy.domain.order

import javax.persistence.*
import kr.pco.kotlintoy.domain.BaseEntity
import kr.pco.kotlintoy.domain.member.MemberEntity
import kr.pco.kotlintoy.domain.product.ProductEntity


@Entity
@Table(name="b_order")
class OrderEntity(
    @Id
    @Column(name="order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val orderId :Int,

    @JoinColumn(name = "member_id")
    @ManyToOne(fetch = FetchType.LAZY)
    val member : MemberEntity, //주문한 회원은 변할수가없다.

    @JoinColumn(name = "product_id")
    @ManyToOne(fetch = FetchType.LAZY)
    var product : ProductEntity, //주문된 상품은 변할수가 있다.
) : BaseEntity()