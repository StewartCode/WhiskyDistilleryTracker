package com.codeclan.example.whiskydistillery.projections;
import com.codeclan.example.whiskydistillery.models.Distillery;
import com.codeclan.example.whiskydistillery.models.Whisky;
import org.springframework.data.rest.core.config.Projection;
import java.util.List;

@Projection(name = "embedForDistillery", types = Distillery.class)
public interface EmbedForDistillery {
    public String getName();
    public String getRegion();
    public List<Whisky> getWhiskies();
    public Long getId();

}
