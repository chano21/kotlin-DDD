package kr.pco.kotlintoy.infra

import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext


@Configuration
@EnableJpaAuditing
class JPAConfig{

    @PersistenceContext
    private lateinit var em: EntityManager

}