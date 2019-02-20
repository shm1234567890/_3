package Service.impl;

import Dao.Attencedao;
import Dao.impl.Attencedaoimpl;
import Service.AttenceService;
import entity.ATTENCE;

import java.util.List;

/**
 * Created by Administrator on 2019-01-19.
 */
public class AttenceServiceimpl implements AttenceService{
    Attencedao attencedao=new Attencedaoimpl();
    @Override
    public List<ATTENCE> selectAll() {
        return attencedao.selectAll();
    }

    @Override
    public int insert(ATTENCE attence) {
        return attencedao.insert(attence);
    }
}
