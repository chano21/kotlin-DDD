package kr.pco.kotlintoy.`in`.domain.order

import javax.persistence.*
import kr.pco.kotlintoy.`in`.domain.BaseEntity
import kr.pco.kotlintoy.`in`.domain.member.MemberAggregate
import kr.pco.kotlintoy.`in`.domain.product.ProductEntity


@Entity
@Table(name="b_order")
class OrderEntity(
    @Id
    @Column(name="order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val orderId :Int,

    @JoinColumn(name = "member_id")
    @ManyToOne(fetch = FetchType.LAZY)
    val member : MemberAggregate, //주문한 회원은 변할수가없다.

    @JoinColumn(name = "product_id")
    @ManyToOne(fetch = FetchType.LAZY)
    var product : ProductEntity, //주문된 상품은 변할수가 있다.
) : BaseEntity()