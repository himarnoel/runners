package emmanuel.dev.runners.run;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;

@Repository
public class RunRepository {
    private List<Run> runs = new ArrayList<>();

    List<Run> findAll() {
        return runs;
    }

    @PostConstruct
    public void init() {
        runs.add(new Run(1, "Monday Morning Run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 100,
                Location.OUTDOOR));
        runs.add(new Run(2, "Wednesday Evening Run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 100,
                Location.OUTDOOR));
    }
}
