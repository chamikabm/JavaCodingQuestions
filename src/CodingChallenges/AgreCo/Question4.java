package CodingChallenges.AgreCo;

public class Question4 {
    /**

    select ponds.id, coalesce(y.cnt, 0)
    from ponds left join (select x.pond_id, count(*) cnt
    from ponds p left join (select * from ducks d
    left join species s on d.species_id = s.id) x on p.id = x.pond_id
    where (x.temp_preferences = '+' and x.temp_limit <= p.temperature)
    or (x.temp_preferences = '-' and x.temp_limit >= p.temperature)
    group by  x.pond_id) y on ponds.id =  y.pond_id order by ponds.id;

     */
}
