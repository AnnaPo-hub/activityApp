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
    //подтянуть  из страва все эти поля
    @Id
    Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "distance")
    private int distance;

    @Column(name = "TYPEOFACTIVITY")
    String typeOfActivity;



//добавить сохранение вытащенных активностей в БД ?

    @ManyToOne(targetEntity = Trip.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "tripId", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_tripId"), nullable = false)
    private Trip trip;
}
