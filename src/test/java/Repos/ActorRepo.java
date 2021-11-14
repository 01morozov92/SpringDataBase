package Repos;

import Entity.actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ActorRepo extends JpaRepository<actor, Long> {

    Optional<actor> findById(Long id);

//    @Query("SELECT ID FROM WINNERS  WHERE GAME_ID =:GAME_ID AND WIN =:WIN")
//    List<Long> selectIdWhereGameIdAndWin(@Param("GAME_ID") int GAME_ID, @Param("WIN") int WIN);

    @Query("SELECT last_name FROM actor WHERE first_name =:first_name")
    List<String> selectIdWhereLastName(@Param("first_name") String first_name);

    @Query("SELECT first_name FROM actor WHERE last_name =:last_name")
    String selectFirstNameWhereLastName(@Param("last_name") String last_name);


//    @Query("SELECT t.GAME_ID FROM WINNERS t WHERE t.ID =:ID")
//    Long selectGameIdWhereId(@Param("ID") Long ID);
}
