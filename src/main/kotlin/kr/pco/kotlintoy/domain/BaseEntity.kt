package kr.pco.kotlintoy.domain

import com.fasterxml.jackson.annotation.JsonFormat
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.EntityListeners
import javax.persistence.MappedSuperclass

@MappedSuperclass
@EntityListeners(value = [AuditingEntityListener::class])
open class BaseEntity {
    //val = 불변
    //var = 변
    @CreatedDate
    @Column(name="created_at")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:ss", timezone = "Asia/Seoul")
   lateinit var createdAt: LocalDateTime

    @LastModifiedDate
    @Column(insertable =false,name="updated_at")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:ss", timezone = "Asia/Seoul")
    lateinit var updatedAt: LocalDateTime

}
