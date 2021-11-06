package activityApp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "activity")
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //подтянуть  из страва
    Long id;

    @Column(name = "type_of_activity")
    String typeOfActivity;
    //подтянуть  из страва

    @Column(name = "distance")
    private int distance; // //подтянуть  из страва


    @ManyToOne(targetEntity = Trip.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "trip_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_trip_id"), nullable = false)
    private Trip trip;
}
