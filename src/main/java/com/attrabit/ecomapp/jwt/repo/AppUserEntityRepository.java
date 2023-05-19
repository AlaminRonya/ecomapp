package com.attrabit.ecomapp.jwt.repo;

import com.attrabit.ecomapp.jwt.model.AppUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface AppUserEntityRepository extends JpaRepository<AppUserEntity, UUID> {
    Optional<AppUserEntity> findByEmail (String email);
}
