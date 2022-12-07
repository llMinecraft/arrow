package mc.exarrow.arrow.web.service.impl;

import cn.hutool.core.date.DateUtil;
import mc.exarrow.arrow.support.dao.ChannelAccountDao;
import mc.exarrow.arrow.support.domain.ChannelAccount;
import mc.exarrow.arrow.common.constant.ArrowConstant;
import mc.exarrow.arrow.web.service.ChannelAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ChannelAccountServiceImpl implements ChannelAccountService {
    @Autowired
    private ChannelAccountDao channelAccountDao;
    @Override
    public ChannelAccount save(ChannelAccount channelAccount) {
        if(channelAccount.getId()==null){
            channelAccount.setCreatedTime(Math.toIntExact(DateUtil.currentSeconds()));
            channelAccount.setIsDeleted(ArrowConstant.FALSE);
        }
        channelAccount.setUpdatedTime(Math.toIntExact(DateUtil.currentSeconds()));
        return channelAccountDao.save(channelAccount);
    }

    @Override
    public List<ChannelAccount> list() {
        return channelAccountDao.findAll();
    }

}
