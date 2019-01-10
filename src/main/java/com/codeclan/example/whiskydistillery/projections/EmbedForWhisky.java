package com.codeclan.example.whiskydistillery.projections;
import com.codeclan.example.whiskydistillery.models.Distillery;
import com.codeclan.example.whiskydistillery.models.Whisky;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedForWhisky", types = Whisky.class)
public interface EmbedForWhisky {

    public String getName();
    public Distillery getDistillery();
    public int getYear();
    public int getAge();
    public Long getId();






}
