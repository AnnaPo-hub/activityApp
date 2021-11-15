package stravaAdapter.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ActivityDto {
    //откорректировать по файлу
    String typeOfActivity;
    Long distance;
}
