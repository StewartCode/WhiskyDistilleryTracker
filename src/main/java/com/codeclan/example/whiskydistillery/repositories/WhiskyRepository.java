package com.codeclan.example.whiskydistillery.repositories;

import com.codeclan.example.whiskydistillery.models.Whisky;
import com.codeclan.example.whiskydistillery.projections.EmbedForWhisky;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedForWhisky.class)
public interface WhiskyRepository extends JpaRepository<Whisky, Long>, WhiskyRepositoryCustom{
}
