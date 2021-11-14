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

    //название , например, осенний отпуск в Венгрии
    private String title;

    //страна план
    @Column(name = "location")
    private String location;

    @Column(name = "trip_start")
    private LocalDate start;

    @Column(name = "trip_finish")
    private LocalDate finish;

    // несколько активностей в отпуске
    @OneToMany(mappedBy = "trip", cascade = CascadeType.ALL)
    private List<Activity> activities;

//может это вообще не нужно?
    //    @Column(name = "sportsEquipment")
//    SportsEquipment sportsEquipment;
//
//    @Column(name = "otherEquipment")
//    OtherEquipment otherEquipment;
}
