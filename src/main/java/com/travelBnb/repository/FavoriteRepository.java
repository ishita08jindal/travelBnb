package com.travelBnb.repository;

import com.travelBnb.entity.FavoriteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepository extends JpaRepository<FavoriteEntity, Long> {
}