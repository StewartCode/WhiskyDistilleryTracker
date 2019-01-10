package com.codeclan.example.whiskydistillery.repositories;

import com.codeclan.example.whiskydistillery.models.Distillery;
import com.codeclan.example.whiskydistillery.projections.EmbedForDistillery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedForDistillery.class)
public interface DistilleryRepository extends JpaRepository<Distillery, Long>, DistilleryRepositoryCustom {
}
