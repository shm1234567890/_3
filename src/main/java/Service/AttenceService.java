package Service;

import entity.ATTENCE;

import java.util.List;

/**
 * Created by Administrator on 2019-01-19.
 */
public interface AttenceService {
    List<ATTENCE> selectAll();
    int insert(ATTENCE attence);
}
