package com.cursodevsuperior.dscommerce.repositories;

import com.cursodevsuperior.dscommerce.entities.User;
import com.cursodevsuperior.dscommerce.projections.UserDetailsProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(nativeQuery = true, value = """
                SELECT tb_user.email AS username, tb_user.password, tb_role.id AS roleId, tb_role.authority
                FROM tb_user
                INNER JOIN tb_user_role ON tb_user.id = tb_user_role.uswer_id
                WHERE tb_user.email = :email
            """)
    List<UserDetailsProjection> searchUserAndRolesByEmail(String email);
}
