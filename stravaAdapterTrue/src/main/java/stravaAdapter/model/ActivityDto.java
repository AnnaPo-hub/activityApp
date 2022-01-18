package stravaAdapter.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;

@AllArgsConstructor
@Data
@Builder
public class ActivityDto {
    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "distance")
    private float distance;

    @Column(name = "type")
    private String type;

}
