package ip.gr1.TechnologyRelatedBlogs.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;
    @Column
    private  String Title;
    @Column
    private  String Content;
    @Column
    private Instant postedOn;
    @Column
    private  Instant updatedOn;
    @Column
    private String Username;
}
