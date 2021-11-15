package stravaAdapter.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;

@AllArgsConstructor
@Data
@Builder
public class Activity {
    //все поля подтянуть из страва
    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "distance")
    private float distance;

    @Column(name = "type_of_activity")
    private String typeOfActivity;

}
