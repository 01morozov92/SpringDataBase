package Entity;

import lombok.Getter;
import lombok.ToString;
import javax.persistence.*;

@ToString
@Entity
@Getter
@Table(name = actor.ACTOR_TABLE)
public class actor {

    public static final String ACTOR_TABLE = "actor";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long actor_id;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "first_name")
    private String first_name;

//    @Column(name = "GAME_ID")
//    private int GAME_ID;
//
//    @Column(name = "TICKET_ID")
//    private Long TICKET_ID;

}
