package activityApp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "trip")
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String title;

    @Column(name = "location")
    private String location;

    @Column(name = "trip_start")
    private LocalDate start;

    @Column(name = "trip_finish")
    private LocalDate finish;

    @OneToMany(mappedBy = "trip", cascade = CascadeType.ALL)
    private List<Activity> activities;

}
