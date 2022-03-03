package kr.pco.kotlintoy.`in`.domain.product

import kr.pco.kotlintoy.`in`.domain.BaseEntity
import javax.persistence.*

@Entity
@Table(name="b_product")
class ProductEntity(
    @Id
    @Column(name="product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val productId :Int,

    @Column(name="product_name")
    val productName : String



) : BaseEntity()