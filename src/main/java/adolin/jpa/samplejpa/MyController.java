package adolin.jpa.samplejpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Adolin Negash 22.06.2021
 */
@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private MyRepository myRepository;

    @GetMapping("/all")
    public Iterable<MyEntity> getAll() {
        return myRepository.findAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody MyEntity entity) {
        myRepository.save(entity);
    }

}
