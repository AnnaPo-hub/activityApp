package stravaAdapter;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.otus.activity.client.model.SummaryActivity;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/activities")
public class ActivityController {

    @Autowired
    Adapter adapter;

    @GetMapping("/getAllActivities")
    @ResponseBody
    public List<SummaryActivity> getActivities(@RequestParam("before") Integer before, @RequestParam("after") Integer after) {
        return adapter.getActivities(before, after, 1, 30);
    }
}
